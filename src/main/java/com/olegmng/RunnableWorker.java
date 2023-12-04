package com.olegmng;

class MainR {

    public static void main(String[] args) {

        // create threads and start them using the class RunnableWorker
        new Thread(new RunnableWorker(), "worker-k").start();
        new Thread(new RunnableWorker(), "worker-l").start();
        new Thread(new RunnableWorker(), "worker-s").start();
    }
}

// Don't change the code below
class RunnableWorker implements Runnable {

    @Override
    public void run() {
        final String name = Thread.currentThread().getName();

        if (name.startsWith("worker-")) {
            System.out.println("too hard calculations...");
        } else {
            return;
        }
    }
}

/**
 * original
 */
//public class Main {
//
//    public static void main(String[] args) {
//
//        // create threads and start them using the class RunnableWorker
//    }
//}
//
//// Don't change the code below
//class RunnableWorker implements Runnable {
//
//    @Override
//    public void run() {
//        final String name = Thread.currentThread().getName();
//
//        if (name.startsWith("worker-")) {
//            System.out.println("too hard calculations...");
//        } else {
//            return;
//        }
//    }
//}
