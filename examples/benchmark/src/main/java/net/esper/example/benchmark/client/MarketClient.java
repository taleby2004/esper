/**************************************************************************************
 * Copyright (C) 2006 Esper Team. All rights reserved.                                *
 * http://esper.codehaus.org                                                          *
 * ---------------------------------------------------------------------------------- *
 * The software in this package is published under the terms of the GPL license       *
 * a copy of which has been included with this distribution in the license.txt file.  *
 **************************************************************************************/
package net.esper.example.benchmark.client;

import net.esper.example.benchmark.Symbols;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

/**
 * A thread that sends market data (symbol, volume, price) at the target rate to the remote host
 */
public class MarketClient extends Thread {

    private static class MarketData {

        byte ticker[];
        double price;
        int volume;

        public MarketData(String ticker, double price, int volume) {
            this.ticker = ticker.getBytes();
            this.price = price;
            this.volume = volume;
        }
    }

    private Client client;
    private MarketData market[];

    public MarketClient(Client client) {
        this.client = client;
        market = new MarketData[Symbols.SYMBOLS.length];
        for (int i = 0; i < market.length; i++) {
            market[i] = new MarketData(Symbols.SYMBOLS[i], Symbols.nextPrice(10), Symbols.nextVolume(10));
        }
        System.out.printf("MarketData with %d symbols\n", market.length);
    }

    public void run() {
        BufferedOutputStream out;
        try {
            Socket socket = new Socket(client.host, client.port);
            out = new BufferedOutputStream(socket.getOutputStream());
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            out.write("client\n".getBytes());
            out.flush();
            if (!in.readLine().equals("server"))
                throw new RuntimeException("Unknown server");
            System.out.printf("Client connected to %s:%d, rate %d msg/s\n", client.host, client.port, client.rate);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        MarketData market[] = this.market;
        int eventPer50ms = client.rate / 20;
        int tickerIndex = 0;
        int countLast5s = 0;
        int sleepLast5s = 0;
        long lastThroughputTick = System.currentTimeMillis();
        try {
            do {
                long ms = System.currentTimeMillis();
                for (int i = 0; i < eventPer50ms; i++) {
                    tickerIndex = tickerIndex % Symbols.SYMBOLS.length;
                    MarketData md = market[tickerIndex++];
                    md.price = Symbols.nextPrice(md.price);
                    md.volume = Symbols.nextVolume(10);
                    sendMessage(md, out);
                    countLast5s++;

                    // info
                    if (System.currentTimeMillis() - lastThroughputTick > 5 * 1E3) {
                        System.out.printf("Sent %d in %d(ms) avg ns/msg %.0f(ns) avg %d(msg/s) sleep %d(ms)\n",
                                countLast5s,
                                System.currentTimeMillis() - lastThroughputTick,
                                (float) 1E6 * countLast5s / (System.currentTimeMillis() - lastThroughputTick),
                                countLast5s / 5,
                                sleepLast5s
                        );
                        countLast5s = 0;
                        sleepLast5s = 0;
                        lastThroughputTick = System.currentTimeMillis();
                    }
                }

                // rate adjust
                if (System.currentTimeMillis() - ms < 50) {
                    // lets avoid sleeping if == 1ms, lets account 3ms for interrupts
                    long sleep = Math.max(1, (50 - (System.currentTimeMillis() - ms) - 3));
                    sleepLast5s += sleep;
                    Thread.sleep(sleep);
                }
            } while (true);
        } catch (Throwable t) {
            t.printStackTrace();
            System.err.println("Error sending data to server. Did server disconnect?");
        }
    }

    /**
     * Send the message as a "|" separated string
     */
    private void sendMessage(MarketData md, BufferedOutputStream out) {
        try {
            out.write(md.ticker);
            out.write('|');
            out.write(Double.toString(md.price).getBytes());
            out.write('|');
            out.write((new Long(System.currentTimeMillis())).toString().getBytes());
            out.write('|');
            out.write(Long.toString(md.volume).getBytes());
            out.write('\n');
            out.flush();
        } catch (IOException e) {
            System.err.println("Connection likely lost - now ending");
            throw new RuntimeException(e);
        }
    }
}
