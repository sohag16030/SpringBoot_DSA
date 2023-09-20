package com.example.dsa.DSA.MyCodesSchool;

class Node {
    public int data;
    public Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Operations {
    Node head = null;

    public Node addElementLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        return head;
    }

    public void reverseALinkedListIterative() {
        Node prevNode = null;
        Node currNode = head;
        Node nextNode = null;
        while (currNode != null) {
            nextNode = currNode.next;
            currNode.next = prevNode;
            prevNode = currNode;
            currNode = nextNode;
        }
    }

    public Node reverseUsingRecursion(Node head) {
        if (head == null || head.next == null) return head;
        Node newHead = reverseUsingRecursion(head.next);

        Node headNext = head.next;
        head.next = null;
        headNext.next = head;

        return newHead;
    }

    public void displayUsingRecursion(Node head) {
        if (head == null) return;
        else {
            System.out.println(head.data);
            displayUsingRecursion(head.next);
        }
    }

    public Node cycleFinding(Node head) {
        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) return slow;
        }
        return null;
    }

    public Node firstNodeSearch(Node head) {
        Node meet = cycleFinding(head);
        Node current = head;
        while (current != meet) {
            current = current.next;
            meet = meet.next;
        }
        return current;
    }

}

public class LinkedListIterativeMethod {
    public static void main(String[] args) {
        Operations operations = new Operations();
        operations.addElementLast(10);
        operations.addElementLast(20);
        operations.addElementLast(40);
        Node head = operations.addElementLast(60);
        //operations.reverseALinkedListIterative();
        // operations.displayUsingRecursion(head);
        //Node newHead = operations.reverseUsingRecursion(head);
        //System.out.println(newHead);
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);

        // Creating a cyclic linked list by connecting the tail node to node2
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node2;
        Node node = operations.cycleFinding(node1);
        System.out.println(node.data);
        Node firstMeetNode = operations.firstNodeSearch(node1);

    }
}
