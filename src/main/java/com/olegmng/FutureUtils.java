package com.olegmng;

import java.util.*;
import java.util.concurrent.*;

class FutureUtils {

    public static int howManyIsDone(List<Future> items) {
        // write your code here
//        int count = 0;
//        for (Future item : items) {
//            if (item.isDone()) count++;
//        }
//        return count;

       return Math.toIntExact(items.stream()
               .filter(it -> it.isDone())
               .count());

//        return k;

//        int k = Math.toIntExact(items.stream()
//                .map(it -> it.isDone())
//                .count());
    }

}