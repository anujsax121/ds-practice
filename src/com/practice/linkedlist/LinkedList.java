package com.practice.linkedlist;

public class LinkedList {

    private Node head;
    int count;

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public void insert(int data) {
        if (head == null) {
            head = new Node(data);
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new Node(data);
    }

    public int size() {
        return count;
    }

    public void display(Node head) {
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            count++;
        }
    }

}
