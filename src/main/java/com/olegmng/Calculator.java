package com.olegmng;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Queue<Task> queue = new ArrayDeque<>();

        ExecutorService executor = Executors.newFixedThreadPool(2);
        Thread taskService = new Thread(() -> {
            while (true) {
                try {
                    Thread.sleep(2000);
                    executor.submit(() -> {
                        Task task = queue.poll();
                        System.out.println("Task " + task + " started");
                        if (task != null) {
                            task.run();
                        }
                    });

                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            }
        });
        taskService.start();

        while (in.hasNextLine()) {
            //1+2
            try{
                int value = in.nextInt();

                Task task = new Task(value);
                queue.add(task);
            }catch (Exception e){
                e.printStackTrace();
            }

        }


}
}
