package com.practice.multithreading;

import java.util.concurrent.LinkedBlockingQueue;

public class BlockingQueueExample {

    private static LinkedBlockingQueue<Integer> queue = new LinkedBlockingQueue<Integer>();

    public static void main(String[] args) {
        System.out.println("<=====> Blocking Queue Example <====================>");
        Thread producer = new Thread(() -> {

            try {
                for (int i = 1; i <= 20; i++) {
                    queue.put(i);
                    System.out.println("Produced: " + i);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread consumer = new Thread(() -> {
            boolean isRunning = true;
            while (isRunning) {
                try {
                    Integer element = queue.take();
                    System.out.println("Consumed: " + element);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    isRunning = false;
                }
            }

        });
        producer.start();
        consumer.start();

    }
}
