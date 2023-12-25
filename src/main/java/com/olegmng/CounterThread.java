package com.olegmng;

class CounterThread extends Thread {

    @Override
    public void run() {
        long counter = 0;

        while (true) {
            counter++;
            System.out.println(counter);

            if (Thread.currentThread().isInterrupted()){
                System.out.println("It was interrupted");
                break;
            }
        }
    }

    public static void main(String[] args) {
        CounterThread counterThread = new CounterThread();
        counterThread.start();

        CounterThread counterThread1 = new CounterThread();
        counterThread1.start();
        counterThread1.interrupt();

    }
}
