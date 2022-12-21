package com.study;

public class DoublyLinkedList {

    public class Node {
        int data;
        Node prev;
        Node next;

        Node(int val) {
            this.data = val;
            this.next = null;
        }
    }

    Node head, tail = null;

    public boolean isEmpty() {
        return (head == null);
    }
    public void add(int val) {
        Node item = new Node(val);;
        if(head == null) {
            head = item;
            tail = item;
        } else {
            tail.next = item;
            item.next = null;
            item.prev = tail.prev;
            tail = item;
        }
    }

    public void print(){
        if(head == null) {
            System.out.println("Doubly linked list is empty");
        } else {
            Node n = head;
            while (n != null) {
                System.out.print(n.data + " ");
                n = n.next;
            }
        }
    }

    public static void main (String[] args) {

        DoublyLinkedList dl = new DoublyLinkedList();
        dl.add(1);
        dl.add(2);
        dl.add(3);
        dl.print();
    }
}
