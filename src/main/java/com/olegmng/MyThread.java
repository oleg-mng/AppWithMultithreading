package com.olegmng;

public class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("1.Начал работать поток: " + Thread.currentThread());

        super.run();
    }
}
