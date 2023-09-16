package DSA.LinkedList.singlylinkedList;

import lombok.Data;

@Data
class Node {
    public int data;
    public Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }

}

class LinkedListOperations {
    Node head = null;

    public void ElementDeleteFromLast() {
        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
    }

    public void ElementDeleteFromRandomPosition(int pos) {
        if (pos == 1) head = head.next;
        else {
            Node current = head;
            Node prev = null;
            for (int i = 1; i < pos; i++) {
                prev = current;
                current = current.next;
            }
            prev.next = current.next;
        }
    }

    public void ElementAddAtFirstPosition(int data) {
        if (head == null) {
            head = new Node(data);
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = new Node(data);
        }
    }

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("hello world");
        LinkedListOperations operations = new LinkedListOperations();
        operations.ElementAddAtFirstPosition(10);
        operations.ElementAddAtFirstPosition(12);
        operations.ElementAddAtFirstPosition(13);
        operations.ElementAddAtFirstPosition(14);
        operations.ElementAddAtFirstPosition(15);
        operations.ElementAddAtFirstPosition(16);
        // operations.ElementDeleteFromLast();
        operations.ElementDeleteFromRandomPosition(5);
        operations.display();
    }

}
