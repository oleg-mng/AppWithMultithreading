package com.olegmng;

class FastThread extends Thread {
    //создаем новый поток

    FastThread() {
        super("Быстрый поток");
        System.out.println("Дочерний поток: " + this);
        start(); // запуск потока на исполнение
    }

    // точка входа во второй поток исполнения

    @Override
    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Дочерний поток: " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Дочерний поток прерван");
            ;
        }
        System.out.println("Дочерний поток завершен");

    }
}

class ExtendThread {
    public static void main(String[] args) {
        new FastThread();
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Главный поток: " + i);
                Thread.sleep(1000);

            }
        } catch (InterruptedException e) {
            System.out.println("Главный поток прерван");
        }
        System.out.println("Главный поток завершен");
    }
}
