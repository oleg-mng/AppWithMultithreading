package com.olegmng;

public class NumbersThread extends Thread{

    public NumbersThread(int from, int to) {
        // implement the constructor

        Thread t = new Thread();

        for (int i = from; i <= to; i++) {
            System.out.println(i);

        }
        t.start();
    }
    @Override
    public void run() {
        }

    public static void main(String[] args) {
        NumbersThread numbersThread = new NumbersThread(1, 3);
        numbersThread.start();
    }

    // you should override some method here
}

/**
 * original
 */
//class NumbersThread extends Thread {
//
//    public NumbersThread(int from, int to) {
//        // implement the constructor
//    }
//
//    // you should override some method here
//}