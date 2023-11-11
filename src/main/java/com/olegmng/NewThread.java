package com.olegmng;

public class NewThread implements Runnable{
    Thread t;

    public NewThread() {
        t = new Thread(this, "Демонстрационный поток");
        System.out.println("Демонстрационный поток создан" + t);
        t.start();
    }
    @Override
    public void run() {
        try {
            for (int i = 5; i >= 0; i--) {
                System.out.println("Дочерний поток: " + i);
                Thread.sleep(500);

            }
        } catch (InterruptedException e) {
            System.out.println("Дочерний поток прерван");
        }
        System.out.println("Дочерний поток завершен");

    }
}
class ThreadDemo{
    public static void main(String[] args) {
        new NewThread();
        try {
            for (int i = 5; i >= 0; i--) {
                System.out.println("Главный поток: " + i);
                Thread.sleep(500);

            }
        } catch (InterruptedException e) {
            System.out.println("Главный поток прерван");
        }
        System.out.println("Главный поток завершен");

    }
}
