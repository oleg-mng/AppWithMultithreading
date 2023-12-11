package com.olegmng;

import java.util.concurrent.TimeUnit;

public class ThreadSafeMain {
    public static void main(final String[] args) throws Exception {
        ThreadSafe1 runnable = new ThreadSafe1();
        new Thread(runnable).start();

        TimeUnit.MICROSECONDS.sleep(10);
        runnable.cancel();

        System.out.println("Main thread says goodbye!");
    }

    public static class ThreadSafe1 implements Runnable {
        private volatile boolean done; // sometimes changes are not visible

        @Override
        public void run() {
            long count = 0;
            while (!done) {
                count++;
            }
            System.out.println("Job's done! Count = " + count);
        }

        public void cancel() {
            done = true;
        }
    }
}
