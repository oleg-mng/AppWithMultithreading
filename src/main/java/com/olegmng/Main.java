package com.olegmng;

public class Main {
    public static void main(String[] args) throws InterruptedException {
//        System.out.println(Thread.currentThread().getName());
//        for (int i = 0; i < 3; i++) {
//            Thread thread = new MyThread();
//            thread.start();
//            thread.join();
//
//        }
//        for (int i = 0; i < 5; i++) {
//            Thread thread = new Thread(new MyRunnable());
//            thread.start();
//            thread.join();
//
//        }
//        for (int i = 0; i < 3; i++) {
//            new Thread(() -> System.out.println("3.Начал работать поток: " + Thread.currentThread())).start();
//        }

//        Thread tic = new Thread(new TicTac("["));
//        Thread tac = new Thread(new TicTac("]"));
//        Thread ttt = new Thread(new TicTac("3"));

//        tic.setDaemon(true);
//        tac.setDaemon(true);
//        tic.start();
//        tac.start();
//        ttt.start();

//        long start = System.currentTimeMillis();
//        Task task = new Task(0);
//        CountDownLatch cdl = new CountDownLatch(3);
//        task.setCdl(cdl);
//        for (int i = 0; i < 3; i++) {
//            Thread thread = new Thread(task);
//            thread.start();
//
//        }
//        cdl.await();
//        System.out.println(task.getValue());
//        long end = System.currentTimeMillis();
//        System.out.println("Time : " + (end - start) + "ms");

/**
 * Есть пять философов (потоки), которые могут либо обедать либо размышлять.
 * Каждый философ должен пообедать три раза. Каждый прием пищи длиться 500 миллисекунд
 * После каждого приема пищи философ должен размышлять
 * Не должно возникнуть общей блокировки
 * Философы не должны есть больше одного раза подряд
 */
        System.out.println(Thread.currentThread().getName());
        for (int i = 0; i < 5; i++) {
//            Thread thread = new Thread(new Philosopher(0, "Philosopher - " + i));
            Thread thread = new Thread(new Philosopher(0));
            thread.start();

        }


    }
}