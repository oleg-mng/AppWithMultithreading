package com.olegmng;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;

public class Task implements Runnable {
    private final AtomicInteger value;
    private CountDownLatch cdl;

    public Task(int value) {
        this.value = new AtomicInteger();
    }

    public void inc(){
//        synchronized (Task.class){
           value.incrementAndGet();
//        }
    }

    public void setCdl(CountDownLatch cdl) {
        this.cdl = cdl;
    }

    public int getValue() {
        return value.intValue();
    }

    @Override
    public void run() {
//        System.out.println(value);
        for (int i = 0; i < 1000000; i++) {
            inc();
        }
        cdl.countDown();

    }

    @Override
    public String toString() {
        return "Task{" +
               "value=" + value +
               '}';
    }
}
