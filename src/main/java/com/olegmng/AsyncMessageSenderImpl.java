package com.olegmng;

import java.util.concurrent.*;

/* Do not change this class */
class Message {
    final String text;
    final String from;
    final String to;

    Message(String from, String to, String text) {
        this.text = text;
        this.from = from;
        this.to = to;
    }
}

/* Do not change this interface */
interface AsyncMessageSender {
    void sendMessages(Message[] messages);
    void stop();
}

class AsyncMessageSenderImpl implements AsyncMessageSender {
    private ExecutorService executor; // TODO initialize the executor
    private final int repeatFactor;

    public AsyncMessageSenderImpl(int repeatFactor) {
        this.repeatFactor = repeatFactor;
    }

    @Override
    public void sendMessages(Message[] messages) {
        executor = Executors.newFixedThreadPool(repeatFactor);
        for (Message msg : messages) {
            // TODO repeat messages
            for (int i = 0; i < repeatFactor; i++) {
                executor.submit(() -> {
                    System.out.printf("(%s>%s): %s\n", msg.from, msg.to, msg.text); // do not change it
                });

            }
        }
    }

    @Override
    public void stop() {
        // TODO stop the executor and wait for it
        try {
            executor.awaitTermination(60, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        executor.shutdown();
    }

    public static void main(String[] args) {
        AsyncMessageSender sender = new AsyncMessageSenderImpl(3);

        Message[] messages = {

                new Message("John", "Mary", "Hello!"),
                new Message("Clara", "Bruce", "How are you today?")
        };

        sender.sendMessages(messages);
        sender.stop();

        notifyAboutEnd(); // it prints something after the sender successfully stop
    }

    private static void notifyAboutEnd() {
        System.out.println("Completed.");
    }
}

/**
 * original
 */
//import java.util.concurrent.*;
//
///* Do not change this class */
//class Message {
//    final String text;
//    final String from;
//    final String to;
//
//    Message(String from, String to, String text) {
//        this.text = text;
//        this.from = from;
//        this.to = to;
//    }
//}
//
///* Do not change this interface */
//interface AsyncMessageSender {
//    void sendMessages(Message[] messages);
//    void stop();
//}
//
//class AsyncMessageSenderImpl implements AsyncMessageSender {
//    private ExecutorService executor; // TODO initialize the executor
//    private final int repeatFactor;
//
//    public AsyncMessageSenderImpl(int repeatFactor) {
//        this.repeatFactor = repeatFactor;
//    }
//
//    @Override
//    public void sendMessages(Message[] messages) {
//        for (Message msg : messages) {
//            // TODO repeat messages
//            executor.submit(() -> {
//                System.out.printf("(%s>%s): %s\n", msg.from, msg.to, msg.text); // do not change it
//            });
//        }
//    }
//
//    @Override
//    public void stop() {
//        // TODO stop the executor and wait for it
//    }
//}
