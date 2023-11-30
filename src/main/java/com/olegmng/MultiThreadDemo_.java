package com.olegmng;

public class MultiThreadDemo_ extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println("A");
            System.out.println("B");
        }
    }
}
class MultiThreadDemo__ extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println("C");
            System.out.println("D");
        }
    }

    public static void main(String[] args) {
        MultiThreadDemo_ threadDemo_ = new MultiThreadDemo_();
        MultiThreadDemo__ threadDemo__ = new MultiThreadDemo__();
        threadDemo_.start();
        threadDemo__.start();
    }
}
