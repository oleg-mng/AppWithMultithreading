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
        System.out.println("Философ из потока " + Thread.currentThread() + " кушает " + num + "-й раз");

    }

    public int toEat(int num) throws InterruptedException {
        Thread.sleep(500);
        toThink();
//        System.out.println("Философ из потока " + Thread.currentThread() + " кушает " + num + "-й раз");
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
                if (num == 2) fullEat = true;
                num++;
                toEat(num);

                Thread.sleep(500);

                System.out.println("Философ из потока " + Thread.currentThread() + " размышляет");
//                    synchronized (monitor){

//                        inc();
//                System.out.println(num);
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
