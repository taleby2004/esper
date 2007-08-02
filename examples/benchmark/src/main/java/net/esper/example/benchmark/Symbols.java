/**************************************************************************************
 * Copyright (C) 2006 Esper Team. All rights reserved.                                *
 * http://esper.codehaus.org                                                          *
 * ---------------------------------------------------------------------------------- *
 * The software in this package is published under the terms of the GPL license       *
 * a copy of which has been included with this distribution in the license.txt file.  *
 **************************************************************************************/
package net.esper.example.benchmark;

import java.util.Random;

/**
 * Holds the list of symbols.
 * Use -Desper.benchmark.symbol=100 to configure the number of symbols to use (hence the number of EQL statements)
 *
 * Each symbol is prefixed with "S" and suffixed with "A" to have all symbols have the same length
 * (f.e. S1AA S2AA ... S99A for 100 symbols)
 */
public class Symbols {

    static Random RAND = new Random();

    static {
        int symbolcount = Integer.parseInt(System.getProperty("esper.benchmark.symbol", "100"));
        int symbolStringLength = (""+symbolcount).length();// + 1/*S*/;
        String[] symbols = new String[symbolcount];
        for (int i = 0; i < symbols.length; i++) {
            symbols[i] = "S"+i;
            while (symbols[i].length() < symbolStringLength) {
                symbols[i] += "A";
            }
        }

        SYMBOLS = symbols;
    }

    public static final String SYMBOLS[];

    public static double nextPrice(double base) {
        int percentVar = RAND.nextInt(9) + 1;
        int trend = RAND.nextInt(3);
        double result = base;
        switch (trend) {
            case 0:
                result *= 1.0D - (double) percentVar * 0.01D;
            case 2:
                result *= 1.0D + (double) percentVar * 0.01D;
        }
        return result;
    }

    public static int nextVolume(int max) {
        return RAND.nextInt(max-1) + 1;
    }
}
