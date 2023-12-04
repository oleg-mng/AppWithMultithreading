package com.olegmng;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class NumbersFilter extends Thread {

    /* use it to read numbers from the standard input */
    private final Scanner scanner = new Scanner(System.in);
    private Integer key;
    private List<Integer> list = new ArrayList<>();

    @Override
    public void run() {
        // implement this method
        do {
            key = scanner.nextInt();
            if (key % 2 == 0) {
                list.add(key);

            }
        } while (key != 0);
        list.remove(key);
        for (Integer l : list) {
            System.out.println(l);
        }
    }

    public static void main(String[] args) {
        new NumbersFilter().start();
    }

}

/**
 * original
 */
//import java.util.Scanner;
//
//class NumbersFilter extends Thread {
//
//    /* use it to read numbers from the standard input */
//    private final Scanner scanner = new Scanner(System.in);
//
//    @Override
//    public void run() {
//        // implement this method
//    }
//}
