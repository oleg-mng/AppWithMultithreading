package com.olegmng;

public class MainThreadMth {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(() -> {
            while(Thread.currentThread().isInterrupted()) {
                try {
                    Thread.sleep(2_000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        });
        thread.start();
        thread.interrupt();
        System.out.println(Thread.currentThread().isInterrupted());

    }
}
