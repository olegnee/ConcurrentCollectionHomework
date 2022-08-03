package com.company;

public class ThreadToMakeSomething extends Thread{
    public ThreadToMakeSomething(Runnable target) {
        super(target);
    }
}
