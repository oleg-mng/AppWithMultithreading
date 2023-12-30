package com.olegmng;

import java.util.List;
import java.util.concurrent.*;


class FutureUtilsRun {

    public static int executeCallableObjects(List<Future<Callable<Integer>>> items) {
        // write your code here
        Integer sum = 0;
            for (int i = items.size() - 1; i >= 0; i--) {

            try {
                Callable<Integer> callable =  items.get(i).get();
                Integer s = 0;
                try {
                    s = callable.call();
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
                sum +=s;
            } catch (InterruptedException | ExecutionException e) {
                throw new RuntimeException(e);
            }

        }
        return sum;
    }

}