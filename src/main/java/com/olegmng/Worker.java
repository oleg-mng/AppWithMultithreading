package com.olegmng;

class Worker extends Thread {
    private final String str;

    public Worker(String str) {
        this.str = str;
    }

    @Override
    public void run() {
        System.out.println(str);
    }
}

class Application1 {
    public static void main(String args[]) throws InterruptedException {
        Thread t1 = new Worker("Hello from t1");
        Thread t2 = new Worker("Hello from t2");
        Thread t3 = new Worker("Hello from t3");

        t1.start();
        t2.start();
        t3.start();

        t1.join();
        t2.join();
        t3.join();
    }
}

class Application2 {
    public static void main(String args[]) throws InterruptedException {
        Thread t1 = new Worker("Hello from t1");
        Thread t2 = new Worker("Hello from t2");
        Thread t3 = new Worker("Hello from t3");

        t1.start();
        t1.join();

        t2.start();
        t2.join();

        t3.start();
        t3.join();
    }
}
