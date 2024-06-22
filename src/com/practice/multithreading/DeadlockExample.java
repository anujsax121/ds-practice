package com.practice.multithreading;

public class DeadlockExample {

    public static Object obj1 = new Object();
    public static Object obj2 = new Object();

    public static void main(String[] args) {

        Thread t1 = new Thread(() -> {
            synchronized (obj1) {
                System.out.println("Thread-1 acquired obj1");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Thread-1 waiting for obj2");
                synchronized (obj2) {
                    System.out.println("Thread-1 acquired obj2");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                System.out.println("Thread-1 releases obj2");
            }
            System.out.println("Thread-1 releases obj1");

        });

        Thread t2 = new Thread(() -> {
            synchronized (obj2) {
                System.out.println("Thread-2 acquired obj2");
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {

                }
                System.out.println("Thread-2 waiting for obj1");
                synchronized (obj1) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                System.out.println("Thread-2 releases obj1");
            }
            System.out.println("Thread-2 releases obj2");

        });
        t1.start();
        t2.start();
    }
}

