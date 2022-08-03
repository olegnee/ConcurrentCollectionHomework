package com.company;

import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentLinkedQueue;

public class ATS implements Runnable {
    private int amountOfCalls;
    private int howOften;
    private ClientsProblem clientsProblem;

    public ATS(int amountOfCalls, int howOften) {
        this.amountOfCalls = amountOfCalls;
        this.howOften = howOften;
    }

    @Override
    public void run() {
        for (int i = 0; i < Main.callsIterration; i++) {
            for (int j = 0; j < amountOfCalls; j++) {
                String problem = "Меня бесит проблема " + j;
                try {
                    Main.clientsProblems.transfer(problem);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("New part of clients added.");
            try {
                Thread.sleep(howOften);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
