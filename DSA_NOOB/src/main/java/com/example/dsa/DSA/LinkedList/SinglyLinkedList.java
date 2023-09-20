package com.example.dsa.DSA.LinkedList;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
class Node {
    private int data;
    private Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class SinglyLinkedList {
    private static Node head = null;

    private static void addElementInLast(int data) {
        if (head == null) {
            head = new Node(data);
        } else {
            Node current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(new Node(data));
        }
    }

    private static void addElementInGivenPosition(int pos, int data) {
        Node temp = head;
        Node newNode = new Node(data);
        for (int i = 0; i < pos-2; i++) {
            temp = temp.getNext();
        }
        Node newNodeNext = temp.getNext();// porer part reserve
        temp.setNext(newNode);//new node set
        newNode.setNext(newNodeNext); // reserve tuku new node er por add kore dilm
    }
    private static void deleteElementFromGivenPosition(int pos) {
        Node temp = head;
        Node prev = new Node();
        Node newNext = new Node();
        for (int i = 0; i < pos-2; i++) {
            prev = temp.getNext();
            newNext = prev.getNext().getNext();
        }
        prev.setNext(newNext);
    }

    public static void main(String[] args) {
        addElementInLast(100);
        addElementInLast(200);
        addElementInLast(300);
        addElementInLast(400);
        addElementInLast(500);
        addElementInGivenPosition(3, 600);
        addElementInGivenPosition(4, 700);
        deleteElementFromGivenPosition(3);
    }

}
