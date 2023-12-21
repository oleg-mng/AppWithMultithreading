package com.olegmng;

public class TestTTT extends Thread{
    public static void main(String[] args) {
        var t = new TestTTT();
        System.out.print("one. ");
        t.start();
        System.out.print("two. ");
        t.start();

    }

    @Override
    public void run() {
        System.out.print("Thread ");
    }
}
