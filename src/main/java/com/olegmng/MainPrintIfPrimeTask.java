package com.olegmng;

import java.math.BigInteger;
import java.util.Scanner;
import java.util.concurrent.*;

public class MainPrintIfPrimeTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ExecutorService executor; // assign an object to it

        while (scanner.hasNext()) {
            int number = scanner.nextInt();
            // create and submit tasks
            executor = Executors.newSingleThreadExecutor();
            executor.execute(new PrintIfPrimeTask(number));

//            executor.submit(() -> {
//                BigInteger bigInteger = BigInteger.valueOf(number);
//                boolean probablePrime = bigInteger.isProbablePrime((int) Math.log(number));
//
//                if (probablePrime) System.out.println(number);
//            });

            executor.shutdown();
        }
    }
}

class PrintIfPrimeTask implements Runnable {
    private final int number;

    public PrintIfPrimeTask(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        // write code of task here
        // используем проверку на простое число

        BigInteger bigInteger = BigInteger.valueOf(number);
        boolean probablePrime = bigInteger.isProbablePrime((int) Math.log(number));

        if (probablePrime && number != 1) System.out.println(number);

    }
//    public static boolean isSimple(Integer number) {
//        if(number < 2) return false;
//        for(int i = 2; i <= number; i++) {
//            if(number % i == 0) {
//                return false;
//            }
//        }
//        return true;
//    }
}
/**
 * original
 */

//import java.util.Scanner;
//import java.util.concurrent.*;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        ExecutorService executor; // assign an object to it
//
//        while (scanner.hasNext()) {
//            int number = scanner.nextInt();
//            // create and submit tasks
//        }
//    }
//}
//
//class PrintIfPrimeTask implements Runnable {
//    private final int number;
//
//    public PrintIfPrimeTask(int number) {
//        this.number = number;
//    }
//
//    @Override
//    public void run() {
//        // write code of task here
//    }
//}