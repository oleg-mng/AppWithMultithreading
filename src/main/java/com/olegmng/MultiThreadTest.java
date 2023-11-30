package com.olegmng;

public class MultiThreadTest extends Thread {
    public static void main(String[] args) {
        MultiThreadTest thread = new MultiThreadTest();
        thread.start();
        System.out.print("one. ");
//        thread.start();
//        System.out.print("two. ");


        try {
            System.out.print("1");
            int a = 2/0;


        }catch (IllegalStateException e){
            System.out.print("3");
        }catch (NullPointerException e){
            System.out.print("4");
        }catch (Exception e){
            System.out.print("5");
        }
        finally {
            System.out.print("6");
        }
    }
    public void run(){
        System.out.print("Thread ");
    }


}
