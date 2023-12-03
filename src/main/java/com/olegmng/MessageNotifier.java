package com.olegmng;

import java.util.Scanner;

class MessageNotifier extends Thread {
    private String msg;
    private int repeats;

    // write fields to store variables here

    public MessageNotifier(String msg, int repeats) {
        // implement the constructor
        this.msg = msg;
        this.repeats = repeats;
        start();
    }

    @Override
    public void run() {
        // implement the method to print the message stored in a field
        for (int i = 0; i < repeats; i++) {
            System.out.println(msg);

        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int d = scanner.nextInt();
        MessageNotifier messageNotifier = new MessageNotifier(str, d);
    }
}

/**
 * original
 */
//class MessageNotifier extends Thread {
//
//    // write fields to store variables here
//
//    public MessageNotifier(String msg, int repeats) {
//        // implement the constructor
//    }
//
//    @Override
//    public void run() {
//        // implement the method to print the message stored in a field
//    }
//}
