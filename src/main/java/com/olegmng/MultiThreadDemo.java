package com.olegmng;

class TThread implements Runnable{
    String name;
    Thread t;

    public TThread(String threadName) {
        this.name = threadName;
        t = new Thread(this, name);
        System.out.println("Новый поток" + t);
        t.start();
    }

    @Override
    public void run() {
        try {
            for (int i = 5; i >= 0; i--) {
                System.out.println(name + ": " + i);
                Thread.sleep(1000);

            }
        } catch (InterruptedException e) {
            System.out.println(name + " прерван");;
        }
        System.out.println(name + " завершен");

    }
}

//public class MultiThreadDemo {
//    public static void main(String[] args) {
//        new TThread("Первый");
//        new TThread("Второй");
//        new TThread("Третий");
//
//        try {
//            Thread.sleep(10000);
//        } catch (InterruptedException e) {
//            System.out.println("Главный поток прерван");
//        }
//        System.out.println("Главный поток завершен");
//
//
//    }
//}

class DemoJoin{
    public static void main(String[] args) {

        TThread thread1 = new TThread("thread1");
        TThread thread2 = new TThread("thread2");
        TThread thread3 = new TThread("thread3");

        System.out.println("Поток 1 запущен: "+ thread1.t.isAlive());
        System.out.println("Поток 2 запущен: "+ thread2.t.isAlive());
        System.out.println("Поток 3 запущен: "+ thread3.t.isAlive());
        // ожидаем завершения потоков
        try {
            System.out.println("ожидание зашершения потоков");
            thread1.t.join();
            thread2.t.join();
            thread3.t.join();
        } catch (InterruptedException e) {
            System.out.println("Главный поток прерван");;
        }

        System.out.println("Поток 1 запущен: "+ thread1.t.isAlive());
        System.out.println("Поток 2 запущен: "+ thread2.t.isAlive());
        System.out.println("Поток 3 запущен: "+ thread3.t.isAlive());
        System.out.println("Главный поток завершен");


    }


}
