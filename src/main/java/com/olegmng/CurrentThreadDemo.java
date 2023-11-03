package com.olegmng;

//управление главным потоком исполнения
public class CurrentThreadDemo {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();

        System.out.println("Текущий поток исполнения: " + t);
        // меняем имя потока исполнения
        t.setName("My thread");
        System.out.println("Имя потока после изменения: " + t);

        try {
            for (int i = 5; i >= 0; i--) {
                System.out.println(i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Главный поток исполнения прерван");
        }

    }
}
