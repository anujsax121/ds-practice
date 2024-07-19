package com.practice.multithreading;

import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierDemo {

    public static void main(String[] args) {
        CyclicBarrier cyclicBarrier = new CyclicBarrier(4, () -> {
//This task will be executed once all biker threads will reach barrier
            System.out.println("\nAll bikers have arrived to checkpoint. Lets refill the petrol\n");
        });
    }
}

class Biker implements Runnable {

    private CyclicBarrier checkPoint;

    public Biker(CyclicBarrier checkPoint) {
        this.checkPoint = checkPoint;
    }


    @Override
    public void run() {
        try {
            System.out.println(Thread.currentThread().getName() + " has left Manali");

            checkPoint.await();
            System.out.println(Thread.currentThread().getName() + " has left the first checkpoint / barrier");

            checkPoint.await();
            System.out.println(Thread.currentThread().getName() + " has left the second checkpoint / barrier");

            checkPoint.await();
            System.out.println(Thread.currentThread().getName() + " has reached Leh");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
