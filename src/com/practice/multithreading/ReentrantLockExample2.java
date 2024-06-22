package com.practice.multithreading;

import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockExample2 {

    private static final ReentrantLock lock = new ReentrantLock();

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            if (lock.tryLock()) {
                try {
                    System.out.println("Thread 1 acquired the lock");
                    // Critical section
                } finally {
                    lock.unlock();
                }
            } else {
                System.out.println("Thread 1 couldn't acquire the lock");
            }

        });

        Thread t2 = new Thread(() -> {
            if (lock.tryLock()) {
                try {
                    System.out.println("Thread 2 acquired the lock");
                    // Critical section
                } finally {
                    lock.unlock();
                }
            } else {
                System.out.println("Thread 2 couldn't acquire the lock");
            }

        });

        t1.start();
        t2.start();
    }
}
