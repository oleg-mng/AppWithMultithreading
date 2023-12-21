package com.olegmng;

public class MainQ  extends Thread {
    public MainQ() {
        System.out.print("MyThread ");
    }

    public void run() {
        System.out.print("bar");
    }

    public void run(String str) {
        System.out.print("baz");
    }

    public static void main(String[] args) {
        MainQ mainQ = new MainQ() {
            public void run() {
                System.out.print("foo");
            }

        };
        mainQ.start();
    }
}



//        System.out.print("1 ");
//        synchronized (args){
//            System.out.print("2 ");
//            try {
//                args.wait();
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }
//        System.out.print("3 ");
//    }
//}
