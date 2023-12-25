package com.olegmng;

class CountingTaskInterrupt implements Runnable {

    @Override
    public void run() {
        System.out.println("Start counting");
        int i = 1; // the first number to print

        try {
            while (!Thread.interrupted()) {
                System.out.println(i);
                i++;
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Sleeping was interrupted");
        }
        System.out.println("Finishing");
    }

    public static void main(String[] args) {
        Thread counter = new Thread(new CountingTaskInterrupt());
        counter.start();
        try {
            Thread.sleep(5000L);
            counter.interrupt();
            counter.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
