package com.olegmng;

public class Test implements Runnable {
    @Override
    public void run() {
        System.out.println("1");

    }

    public static void main(String[] args) {
        new Thread(new Test()).start();
        new Test().run();
    }
}
