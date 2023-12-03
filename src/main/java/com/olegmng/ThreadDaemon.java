package com.olegmng;

class ThreadDaemon {
    public static void printIfDaemon(Thread thread) {
        // implement logic
        // if (thread.isDaemon()) System.out.println("daemon");
        // else System.out.println("not daemon");

        String str = thread.isDaemon() ? "daemon" : "not daemon";
        System.out.println(str);
    }
}
