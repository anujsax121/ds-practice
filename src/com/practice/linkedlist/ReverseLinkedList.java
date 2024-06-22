package com.practice.linkedlist;

public class ReverseLinkedList {

    public static LinkedList.Node reverse(LinkedList.Node head) {

        LinkedList.Node pre = null;
        LinkedList.Node curr = head;
        LinkedList.Node next = null;

        while (curr != null) {
            next = curr.next;
            curr.next = pre;
            pre = curr;
            curr = next;
        }
        return pre;
    }
}



