package com.olegmng;

public class ExceptionsInThreads {
    public static void main(String[] args) throws Exception {
        Thread thread = new Thread(() -> {
            String str = "";
            System.out.println("Length is " + str.length());
        }, "secondary");
        thread.start();

        while (true) {
            // do nothing
        }
    }
}

/**
 * original
 */
//public class Main {
//    public static void main(String[] args) throws Exception {
//        Thread thread = new Thread(() -> {
//            String str = null;
//            System.out.println("Length is " + str.length());
//        }, "secondary");
//        thread.start();
//
//        while (true) {
//            // do nothing
//        }
//    }
//}