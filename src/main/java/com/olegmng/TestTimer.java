package com.olegmng;

import java.util.Timer;
import java.util.TimerTask;

public class TestTimer {
    Timer timer = new Timer();
    long delay1 = 1000;
    long delay2 = 2000;
    long period = 3000;

    public void startTasks() {
        timer.schedule(new TimerTask() {
            public void run() {
                System.out.println("Task 1 fired");
            }
        }, delay1);
        timer.scheduleAtFixedRate(new TimerTask() {
            public void run() {
                System.out.println("Task 2 fired");
            }
        }, delay2, period);
    }

    public void cancelTimer() {
        timer.cancel();
    }

    public static void main(String[] args) {
        TestTimer testTimer = new TestTimer();
        testTimer.cancelTimer();
        testTimer.startTasks();

//        timer.schedule(new TimerTask() {...}, delay1) - because delay1 is less than delay2
//
//        timer.scheduleAtFixedRate(new TimerTask() {...}, delay2, period) - because the timer was cancelled
//
//        timer.schedule(new TimerTask() {...}, delay1) - because the timer was cancelled
//
//        timer.cancel() in cancelTimer method - because the timer was cancelled
//
//        timer.scheduleAtFixedRate(new TimerTask() {...}, delay2, period) - because period value is set
    }
}

/**
 * original
 */
// public class TestTimer {
//    Timer timer = new Timer();
//    long delay1 = 1000;
//    long delay2 = 2000;
//    long period = 3000;
//
//    public void startTasks() {
//       timer.schedule(new TimerTask() {
//          public void run() {
//             System.out.println('Task 1 fired');
//          }
//       }, delay1);
//       timer.scheduleAtFixedRate(new TimerTask() {
//          public void run() {
//             System.out.println('Task 2 fired');
//          }
//       }, delay2, period);
//    }
//
//    public void cancelTimer() {
//       timer.cancel();
//    }
// }
