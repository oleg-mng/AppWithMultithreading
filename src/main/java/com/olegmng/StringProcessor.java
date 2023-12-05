package com.olegmng;

import java.util.Scanner;

class StringProcessor extends Thread {

    final Scanner scanner = new Scanner(System.in); // use it to read string from the standard input
    private String name;

    @Override
    public void run() {
        // implement this method
        boolean flag = false;

        while (!flag) {
            int count = 0;
            name = scanner.nextLine();
            for (int i = 0; i < name.length(); i++) {
                if (Character.isLowerCase(name.charAt(i))) {
                    name = name.toUpperCase();
                    System.out.println(name);
                    count++;
                    break;
                }

            }
            if (count == 0) {
                System.out.println("FINISHED");
                flag = true;

            }

        }
    }

    public static void main(String[] args) {
        new StringProcessor().start();
    }
}

/**
 * original
 */

//import java.util.Scanner;
//
//class StringProcessor extends Thread {
//
//    final Scanner scanner = new Scanner(System.in); // use it to read string from the standard input
//
//    @Override
//    public void run() {
//        // implement this method
//    }
//}
