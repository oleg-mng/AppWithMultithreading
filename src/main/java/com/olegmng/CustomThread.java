package com.olegmng;

public class CustomThread extends Thread {

    @Override
    public void run() {
        while (!isInterrupted()) {
            try {
                doAction();
                Thread.sleep(1000); // it may throw InterruptedException
            } catch (InterruptedException e) {
                System.out.println("sleeping was interrupted");
                break; // stop the loop
            }
        }
        System.out.printf("%s finished", getName());
    }

    private void doAction() {
        // something useful
        System.out.println("doing doAction()");
    }

    public static void main(String[] args) {
        var customThread = new CustomThread();
        customThread.start();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        customThread.interrupt();


    }
}