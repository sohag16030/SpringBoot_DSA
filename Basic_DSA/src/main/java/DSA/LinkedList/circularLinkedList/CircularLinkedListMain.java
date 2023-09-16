package DSA.LinkedList.circularLinkedList;

class Node {
    public int data;
    public Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class CircularLinkedListOperations {
    Node head = null;
    Node tail = null;

    public void addElementInFirstPos(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            newNode.next = head;
        } else {
            newNode.next = head;
            head = newNode;
            tail.next = head;
        }
    }

    public void addElementInGivenPosition(int pos, int val) {
        Node newNode = new Node(val);
        Node current = head;
        Node prevNode = null;
        for (int i = 0; i < pos - 1; i++) {
            prevNode = current;
            current = current.next;
        }
        prevNode.next = newNode;
        newNode.next = current;
    }

    public void deleteHeadFromFirst() {
        if (head == null && tail == null) {
            System.out.println("List is empty");
        }
        if (head == tail) {
            head = null;
            tail = null;
        } else {
            head = head.next;
            tail.next = head;
        }
    }

    public void deleteFromLast() {
        if (head == null && tail == null) {
            System.out.println("List is empty");
        }
        if (head == tail) {
            head = null;
            tail = null;
        } else {
            Node current = head;
            Node preTailNode = null;
            while (current != tail) {
                preTailNode = current;
                current = current.next;
            }
            preTailNode.next = head;
        }
    }

}

public class CircularLinkedListMain {
    public static void main(String[] args) {
        CircularLinkedListOperations operations = new CircularLinkedListOperations();
        operations.addElementInFirstPos(10);
        operations.addElementInFirstPos(11);
        operations.addElementInFirstPos(12);
        // operations.deleteHeadFromFirst();
        operations.addElementInGivenPosition(2, 15);
        operations.deleteFromLast();
    }
}
