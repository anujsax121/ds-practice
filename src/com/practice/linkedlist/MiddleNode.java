package com.practice.linkedlist;

public class MiddleNode {

    public static LinkedList.Node middle(LinkedList.Node node) {
        LinkedList.Node slow = node;
        LinkedList.Node fast = node;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;

    }
}
