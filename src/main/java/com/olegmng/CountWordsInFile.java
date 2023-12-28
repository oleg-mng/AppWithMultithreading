package com.olegmng;

import java.util.concurrent.*;

public class CountWordsInFile {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        Callable<Integer> countWordsInFile = () -> {
            int wordCount = 0;
            // accessing a file and calculating wordCount
            return wordCount;
        };
        Future<Integer> task = executor.submit(countWordsInFile);

// some other statements here
        try {
            TimeUnit.SECONDS.sleep(15);
            int count = task.get();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }

    }
}
