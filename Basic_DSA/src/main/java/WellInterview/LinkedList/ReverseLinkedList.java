package WellInterview.LinkedList;


class Node {
    public int data;
    public Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

//   10-->20-->30-->40-->50
class Operation {
    Node head = null;

    public Node addElementFirst(int data) {

        if (head == null) {
            head = new Node(data);
        } else {
            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;
        }
        return head;
    }

    //iterative approach
    //   null<--10 20-->30-->40-->50
    public Node reverseLinkedList(Node head) {
        Node curr = head;
        Node prev = null;
        Node next;
        while (curr!= null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}

public class ReverseLinkedList {
    public static void main(String[] args) {
        // Add element at first position in a singly linked list
        Operation operation = new Operation();
        operation.addElementFirst(30);
        operation.addElementFirst(20);
        Node head = operation.addElementFirst(10);

        Node reverseHead = operation.reverseLinkedList(head);
    }
}
