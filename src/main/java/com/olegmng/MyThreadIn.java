package com.olegmng;

class MyThreadIn extends Thread {

    @Override
    public void run() {
        System.out.println("Hello from " + getName());
    }

    public static void main(String[] args) throws InterruptedException {
        MyThreadIn t1 = new MyThreadIn();
        t1.setName("My-thread-1");
        t1.start();

        t1.join();

        MyThreadIn t2 = new MyThreadIn();
        t2.setName("My-thread-2");
        t2.start();

        System.out.println("output-1");

        t2.join();

        System.out.println("output-2");
    }
}
