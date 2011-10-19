/*
 * *************************************************************************************
 *  Copyright (C) 2008 EsperTech, Inc. All rights reserved.                            *
 *  http://esper.codehaus.org                                                          *
 *  http://www.espertech.com                                                           *
 *  ---------------------------------------------------------------------------------- *
 *  The software in this package is published under the terms of the GPL license       *
 *  a copy of which has been included with this distribution in the license.txt file.  *
 * *************************************************************************************
 */

package com.espertech.esper.regression.context;

import com.espertech.esper.client.Configuration;
import com.espertech.esper.client.EPServiceProvider;
import com.espertech.esper.client.EPServiceProviderManager;
import com.espertech.esper.support.client.SupportConfigFactory;
import junit.framework.TestCase;

public class TestDocExamples extends TestCase {

    private EPServiceProvider epService;

    public void setUp()
    {
        Configuration configuration = SupportConfigFactory.getConfiguration();
        epService = EPServiceProviderManager.getDefaultProvider(configuration);
        epService.initialize();
    }

    public void testDocSamples() {
        epService.getEPAdministrator().getConfiguration().addEventType(BankTxn.class);
        epService.getEPAdministrator().getConfiguration().addEventType(LoginEvent.class);
        epService.getEPAdministrator().getConfiguration().addEventType(LogoutEvent.class);
        epService.getEPAdministrator().getConfiguration().addEventType(SecurityEvent.class);
        epService.getEPAdministrator().getConfiguration().addEventType(SensorEvent.class);
        epService.getEPAdministrator().getConfiguration().addEventType(TrafficEvent.class);
        epService.getEPAdministrator().getConfiguration().addEventType(TrainEnterEvent.class);
        epService.getEPAdministrator().getConfiguration().addEventType(TrainLeaveEvent.class);
        epService.getEPAdministrator().getConfiguration().addEventType(CumulativePrice.class);

        create("create context SegmentedByCustomer partition by custId from BankTxn");
        create("context SegmentedByCustomer select custId, account, sum(amount) from BankTxn group by account");
        create("context SegmentedByCustomer\n" +
                "select * from pattern [\n" +
                "every a=BankTxn(amount > 400) -> b=BankTxn(amount > 400) where timer:within(10 minutes)\n" +
                "]");
        epService.getEPAdministrator().destroyAllStatements();
        create("create context SegmentedByCustomer partition by\n" +
                "custId from BankTxn, loginId from LoginEvent, loginId from LogoutEvent");
        epService.getEPAdministrator().destroyAllStatements();
        create("create context SegmentedByCustomer partition by\n" +
                "custId from BankTxn, loginId from LoginEvent(failed=false)");
        epService.getEPAdministrator().destroyAllStatements();
        create("create context ByCustomerAndAccount partition by custId and account from BankTxn");
        create("context ByCustomerAndAccount select custId, account, sum(amount) from BankTxn");
        create("context ByCustomerAndAccount\n" +
                "  select context.name, context.id, context.key1, context.key2 from BankTxn");
        epService.getEPAdministrator().destroyAllStatements();
        create("create context ByCust partition by custId from BankTxn");
        create("context ByCust\n" +
                "select * from BankTxn as t1 unidirectional, BankTxn.win:time(30) t2\n" +
                "where t1.amount = t2.amount");
        create("context ByCust\n" +
                "select * from SecurityEvent as t1 unidirectional, BankTxn.win:time(30) t2\n" +
                "where t1.customerName = t2.customerName");
        epService.getEPAdministrator().destroyAllStatements();
        create("create context CategoryByTemp\n" +
                "group temp < 65 as cold,\n" +
                "group temp between 65 and 85 as normal,\n" +
                "group temp > 85 as large\n" +
                "from SensorEvent");
        create("context CategoryByTemp select context.label, count(*) from SensorEvent");
        create("context CategoryByTemp\n" +
                "select context.name, context.id, context.label from SensorEvent");
        create("create context NineToFive start (0, 9, *, *, *) end (0, 17, *, *, *)");
        create("context NineToFive select * from TrafficEvent(speed >= 100)");
        create("context NineToFive\n" +
                "select context.name, context.startTime, context.endTime from TrafficEvent(speed >= 100)");
        create("create context CtxTrainEnter\n" +
                "initiated by TrainEnterEvent as te\n" +
                "terminated after 5 minutes");
        create("context CtxTrainEnter\n" +
                "select t1 from pattern [\n" +
                "t1=TrainEnterEvent -> timer:interval(5 min) and not TrainLeaveEvent(trainId = context.te.trainId)]");
        create("create context CtxEachMinute\n" +
                "initiated by pattern [every timer:interval(1 minute)]\n" +
                "terminated after 1 minutes");
        create("context CtxEachMinute select avg(temp) from SensorEvent");
        create("context CtxEachMinute\n" +
                "select context.id, avg(temp) from SensorEvent output snapshot when terminated");
        create("context CtxEachMinute\n" +
                "select context.id, avg(temp) from SensorEvent output snapshot every 1 minute and when terminated");
        create("select venue, ccyPair, side, sum(qty)\n" +
                "from CumulativePrice\n" +
                "where side='O'\n" +
                "group by venue, ccyPair, side");
        create("create context MyContext partition by venue, ccyPair, side from CumulativePrice(side='O')");
        create("context MyContext select venue, ccyPair, side, sum(qty) from CumulativePrice");
    }

    private void create(String epl) {
        epService.getEPAdministrator().createEPL(epl);
    }

    public static class CumulativePrice {
        private String venue;
        private String ccyPair;
        private String side;
        private double qty;

        public String getVenue() {
            return venue;
        }

        public String getCcyPair() {
            return ccyPair;
        }

        public String getSide() {
            return side;
        }

        public double getQty() {
            return qty;
        }
    }

    public static class TrainLeaveEvent {
        private int trainId;

        public int getTrainId() {
            return trainId;
        }
    }

    public static class TrainEnterEvent {
        private int trainId;

        public int getTrainId() {
            return trainId;
        }
    }

    public static class TrafficEvent {
        private double speed;

        public double getSpeed() {
            return speed;
        }
    }

    public static class SensorEvent {
        private double temp;

        public double getTemp() {
            return temp;
        }
    }

    public static class LoginEvent {
        private String loginId;
        private boolean failed;

        public String getLoginId() {
            return loginId;
        }

        public boolean isFailed() {
            return failed;
        }
    }

    public static class LogoutEvent {
        private String loginId;

        public String getLoginId() {
            return loginId;
        }
    }

    public static class SecurityEvent {
        private String customerName;

        public String getCustomerName() {
            return customerName;
        }
    }

    public static class BankTxn {
        private String custId;
        private String account;
        private long amount;
        private String customerName;

        public String getCustId() {
            return custId;
        }

        public String getAccount() {
            return account;
        }

        public long getAmount() {
            return amount;
        }

        public String getCustomerName() {
            return customerName;
        }
    }

}
