package com.olegmng;

class A {
    synchronized void foo(B b) {
        String name = Thread.currentThread().getName();
        System.out.println(name + " вошел в метод A.foo()");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("класс A прерван");

        }
        System.out.println(name + " пытается вызвать B.last()");
        b.last();
    }

    synchronized void last() {
        System.out.println("В методе A.last()");

    }

}

class B {
    synchronized void bar(A a) {
        String name = Thread.currentThread().getName();
        System.out.println(name + " вошел в метод B.bar()");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("класс B прерван");

        }
        System.out.println(name + " пытается вызвать A.last()");
        a.last();

    }

    synchronized void last() {
        System.out.println("В методе B.last()");

    }

}

class Deadlock implements Runnable {
    A a = new A();
    B b = new B();

    public Deadlock() {
        Thread.currentThread().setName("Главный поток");
        Thread t = new Thread(this, "Соперничающий поток");
        t.start();

        a.foo(b);// получить блокировку для объекта a в данном потоке исполнения
        System.out.println("Назад в главный поток");

    }

    @Override
    public void run() {
        b.bar(a);// получить блокировку для объекта b в другом потоке исполнения
        System.out.println("Назад в другой поток");

    }

    public static void main(String[] args) {
        new Deadlock();
    }
}
