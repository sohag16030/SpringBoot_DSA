package TopicWisePreparation.LinkedList;


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
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    // 10-->20-->30-->40-->50-->10
    //cycle finding in a linked list
    public Node hasCycle(Node head) {
        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (slow == fast)
                return slow;
        }
        return null;
    }
}

public class ReverseLinkedList {
    public static void main(String[] args) {
        // Add element at first position in a singly linked list
        Operation operation = new Operation();
        operation.addElementFirst(10);
        operation.addElementFirst(40);
        operation.addElementFirst(30);
        operation.addElementFirst(20);
        operation.addElementFirst(40);
        Node head = operation.addElementFirst(50);
        Node reverseHead = operation.reverseLinkedList(head);

        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);

        // Create a cycle: 1 -> 2 -> 3 -> 4 -> 5 -> 2 (cycle)
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node2;
        //cycle find
        Node cycleStarting = operation.hasCycle(node1);
    }
}
