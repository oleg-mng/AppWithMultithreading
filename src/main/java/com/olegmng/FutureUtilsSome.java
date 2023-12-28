package com.olegmng;

import java.util.concurrent.*;

class FutureUtilsSome {

    public static int determineCallableDepth(Callable callable) throws Exception {
        // write your code here

        int result = 1;
        try {
            while (callable.call() instanceof Callable) {
                callable = (Callable) callable.call();
                result++;
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return result;


//        Object temp = null;
//        try {
//            temp = callable.call();
//        } catch (Exception e) {}
//        return temp instanceof Callable ? 1 + determineCallableDepth((Callable) temp) : 1;


//        ExecutorService executor = Executors.newSingleThreadExecutor();
//
//        Future<Integer> future = executor.submit(() -> {
//            if (!(callable.call() instanceof Callable)) return 1;
//            int count = 1;
//            callable.call();
//            count++;
//            return count;
//        });
//        int res = future.get();
//        executor.shutdown();
//        return res;

//        Callable<Integer> generator = () -> {
//            if (!(callable instanceof Callable)) return 1;
//            int count = 0;
//            callable.call();
//            count++;
//            return count;
//        };
//        return generator.call();
    }

}

/**
 * original
 */
//import java.util.concurrent.*;
//
//
//class FutureUtils {
//
//    public static int determineCallableDepth(Callable callable) throws Exception {
//        // write your code here
//    }
//
//}
