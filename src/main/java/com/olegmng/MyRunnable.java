package com.olegmng;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("2.Начал работать поток: " + Thread.currentThread());

    }

    public static void main(String[] args) {
        new MyRunnable().run();
    }
}
