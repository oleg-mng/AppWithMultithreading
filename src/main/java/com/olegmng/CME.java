package com.olegmng;

import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.CopyOnWriteArrayList;

public class CME {
    public static void main(String[] args) {
//        List<Integer> list = new CopyOnWriteArrayList<>();
        Deque<Integer> list = new ConcurrentLinkedDeque<>();
        for (int i = 0; i < 1000; i++) {
            list.add(i);
        }
        Runnable r1 = () -> {
            for (int i = 0; i < 1000; i++) {
//                synchronized (list){
                list.add(i);
//                }
            }
        };
        Runnable r2 = () -> {
//            synchronized (list) {
            for (Integer integer : list) {
                System.out.print(integer + " ");
            }

        };
        new Thread(r1).start();
        new Thread(r2).start();
    }
}
