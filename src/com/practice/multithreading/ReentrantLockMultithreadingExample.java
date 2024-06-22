package com.practice.multithreading;

import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockMultithreadingExample {

    private static int count;
    private static ReentrantLock lock = new ReentrantLock();

    public static void main(String[] args) throws InterruptedException {
        Runnable task = () -> {
            try {
                lock.lock();
                for (int i = 0; i < 10000; i++) {
                    count++;
                }
                System.out.println(Thread.currentThread().getName() + " has finished its work.");
            } finally {
                lock.unlock();
            }
        };
        Thread t1 = new Thread(task, "A");
        Thread t2 = new Thread(task, "B");
        Thread t3 = new Thread(task, "C");
        t1.start();
        t2.start();
        t3.start();
        t1.join();
        t2.join();
        t3.join();
        System.out.println("counter " + count);
    }
}
