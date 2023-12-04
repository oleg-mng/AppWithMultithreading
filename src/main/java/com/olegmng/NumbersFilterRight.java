package com.olegmng;

import java.util.ArrayList;
        import java.util.List;
        import java.util.Scanner;

class NumbersFilterRight extends Thread {

    /* use it to read numbers from the standard input */
    private final Scanner scanner = new Scanner(System.in);
    private Integer key;

    @Override
    public void run() {
        // implement this method
        do {
            key = scanner.nextInt();
            if (key % 2 == 0 && key != 0) {
                System.out.println(key);

            }
        } while (key != 0);

    }

    public static void main(String[] args) {
        new NumbersFilterRight().start();
    }

}