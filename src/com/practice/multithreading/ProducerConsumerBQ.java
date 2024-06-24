package com.practice.multithreading;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

public class ProducerConsumerBQ {

    public static void main(String[] args) {
        BlockingQueue<Item> queue =
                new ArrayBlockingQueue<>(10);
        AtomicInteger i = new AtomicInteger(1);
        Runnable producer = () -> {
            while (true) {
                try {
                    Item item = createItem(i.get());
                    System.out.println("Consuming Item " + item);
                    queue.put(item);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                i.getAndIncrement();
            }
        };


        new Thread(producer).start();
        new Thread(producer).start();

        Runnable consumer = () -> {
            while (true) {
                try {
                    Item item = queue.take();
                    System.out.println("Consuming Item " + item);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                i.getAndIncrement();
            }
        };

        new Thread(consumer).start();
        new Thread(consumer).start();

    }

    private static Item createItem(int x) {

        return new Item(x);

    }
}


class Item {

    private int x;

    Item(int x) {
        this.x = x;
    }

    @Override
    public String toString() {
        return "Item{" +
                "x=" + x +
                '}';
    }
}