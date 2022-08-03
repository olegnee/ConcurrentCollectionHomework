package com.company;

import java.util.concurrent.*;

public class Main {
    public static final int callsIterration = 7;
    public static LinkedTransferQueue<String> clientsProblems = new LinkedTransferQueue<>();
    public static void main(String[] args) throws Exception {

        Employee employee = new Employee(3000, "Vince Carter");
        Employee employee1 = new Employee(3500, "Kobe Bryant");
        Employee employee2 = new Employee(2500, "Dirk Nowitzki");
        Employee employee3 = new Employee(3300, "Tim Duncan");
        ATS ats = new ATS(3, 1000);
        ThreadToMakeSomething th1 = new ThreadToMakeSomething(employee);
        ThreadToMakeSomething th2 = new ThreadToMakeSomething(employee1);
        ThreadToMakeSomething th3 = new ThreadToMakeSomething(employee2);
        ThreadToMakeSomething th4 = new ThreadToMakeSomething(employee3);
        ThreadToMakeSomething th5 = new ThreadToMakeSomething(ats);
        th1.setDaemon(true);
        th3.setDaemon(true);
        th2.setDaemon(true);
        th4.setDaemon(true);
        th5.start();
        th1.start();
        th2.start();
        th3.start();
        th4.start();

    }
}
