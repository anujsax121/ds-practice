package com.practice.stack;

import static java.lang.System.out;

public class MyList<T> {
    private Node<T> head;

    public void add(T obj) {
        Node<T> newNode = new Node<>(obj);
        if (head == null)
            head = newNode;
        else {
            Node<T> currentNode = head;
            while (currentNode.next != null)
                currentNode = currentNode.next;
            currentNode.next = newNode;
        }
    }

    /*
    HEAD 5
    5->4->3->2->1->NULL
    */
    public void reverse() {

        Node pre = null;
        Node next = null;
        Node curr = head;

        while (curr != null) {
            next = curr.next;
            curr.next = pre; //Tail
            pre = curr;
            curr = next;


        }
        head =pre;
    }

    public void printList() {
        out.println("HEAD " + head);
        Node<T> current = head;
        while (current != null) {
            out.print(current);
            out.print("->");
            current = current.next;
        }
        out.println("NULL");
    }

    public static void main(String[] args) {
        MyList<Integer> list = new MyList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.printList();

        list.reverse();
        list.printList();

        list.reverse();
        list.printList();
    }

    class Node<T> {
        private T obj;
        private Node<T> next;

        public Node(T obj) {
            this.obj = obj;
            this.next = null;
        }

        @Override
        public String toString() {
            return obj.toString();
        }
    }
}
