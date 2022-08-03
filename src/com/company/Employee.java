package com.company;

public class Employee implements Runnable {
    private int howFastSolve;
    private String employeesName;

    public Employee(int howFastSolve, String employeesName) {
        this.howFastSolve = howFastSolve;
        this.employeesName = employeesName;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(howFastSolve);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            String string = null;
            try {
                string = Main.clientsProblems.take();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(string + "\nThis problem has solved by " + employeesName);
//            if (Main.clientsProblems.isEmpty()) {
//                break;
//        }
        }
    }
}
