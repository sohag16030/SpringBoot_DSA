package DSA.LinkedList.interview;

class Operations {
    Node head = null;

    public Node addElementLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node currentNode = head;
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
        }
        return head;
    }

    // 10->20->30->40->null
    public Node ReverseLinkedListUsingIterativeMethod() {
        Node prevNode = null;
        Node currentNode = head;
        Node nextNode;
        while (currentNode != null) {
            nextNode = currentNode.next;
            currentNode.next = prevNode;
            prevNode = currentNode;
            currentNode = nextNode;
        }
        head = prevNode;
        return head;
    }
    // 10 20 30 40 50 60
    public Node ReverseLinkedListUsingRecursion(Node head) {
        if (head == null || head.next == null) return head;
        Node newHead = ReverseLinkedListUsingRecursion(head.next);
        Node headNext = head.next;
        headNext.next = head;
        head.next = null;

        return newHead;
    }

    public Node FindCycleInLinkedList(Node head) {
        Node fast = head;
        Node slow = head;
        while (fast!=null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow)
                return slow;
        }
        return null;
    }

    public Node detectFirstNode(Node head) {
        Node start = head;
        Node meet = FindCycleInLinkedList(head);

        while (start != meet) {
            start = start.next;
            meet = meet.next;
        }
        return start;
    }
    public void removeCycleFromALinkedList(Node head){
        Node start = head;
        Node meet = FindCycleInLinkedList(head);
        Node prevNode = null;

        while (start != meet) {
            prevNode = meet;
            start = start.next;
            meet = meet.next;
        }
        prevNode.next = null;
    }

}

public class LinkedList_Reverse_CycleFinding {
    public static void main(String[] args) {
        Operations operations = new Operations();
        operations.addElementLast(10);
        operations.addElementLast(20);
        operations.addElementLast(30);
        operations.addElementLast(40);
        operations.addElementLast(50);
        //Node head = operations.ReverseLinkedListUsingIterativeMethod();
        Node newHead = operations.ReverseLinkedListUsingRecursion( operations.addElementLast(60));
        System.out.println(newHead);
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
        node5.next = node2; // Creating a cycle

        Node head = node1;
        Node slow = operations.FindCycleInLinkedList(head);
        System.out.println(slow);
//
        Node point = operations.detectFirstNode(head);
        operations.removeCycleFromALinkedList(head);
    }
}
