package com.olegmng;

class Starter {

    public static void startRunnables(Runnable[] runnables) {
        // implement the method
        for (Runnable runnable : runnables) {
            new Thread(runnable).start();
//            thread.run();
            
        }
    }

}

/**
 * original
 */
//class Starter {
//
//    public static void startRunnables(Runnable[] runnables) {
//        // implement the method
//    }
//}
