package com.olegmng;

import java.util.concurrent.atomic.AtomicInteger;

public class Philosopher implements Runnable {
    private int num = 0;
//    private Object monitor;
    boolean fullEat = false;

    public Philosopher(int num) {
        this.num = num;
//        this.monitor = monitor;
    }

    public void toThink() {

    }

    public int toEat(int num) throws InterruptedException {
        Thread.sleep(500);
        System.out.println("Философ начал кушать " + num +"-й раз"+Thread.currentThread());
//        num.incrementAndGet();
        num++;
        return num;

    }
//    public void inc(){
////        synchronized (Task.class){
//        num.incrementAndGet();
////        }
//    }

    @Override
    public void run() {
//        ++num;
        System.out.println("Начал работать поток " + Thread.currentThread());

        while (!fullEat) {
//            synchronized (monitor) {
//                System.out.println(monitor);
                try {
                    if(num == 2) fullEat = true;
                    Thread.sleep(500);
//                    synchronized (monitor){
                    num++;
                        toEat(num);
//                        inc();
                        System.out.println(num);
//                        notify();
//                        wait();

//                    }
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
//            }

        }
    }
}
