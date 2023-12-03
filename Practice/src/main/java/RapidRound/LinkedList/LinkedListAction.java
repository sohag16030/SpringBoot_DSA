package RapidRound.LinkedList;

class Node {
    public int data;
    public Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Action {
    // using iterative approach
    // null<-10 20->30->40->50
    public Node reverse(Node head) {
        if (head == null || head.next == null) return head;
        else {
            Node curr = head;
            Node prev = null;
            Node next;
            while (curr != null) {
                next = curr.next; //20
                curr.next = prev; //  null<-10
                prev = curr; // 10
                curr = next; // 20
            }
            return prev;
        }
    }


    // recursive approach
    // null<-10<-20
    public Node reverseRecursion(Node head) {
        if (head == null || head.next == null) return head;
        else {
            Node newHead = reverseRecursion(head.next);
            Node headNext = head.next;
            headNext.next = head;
            head.next = null;
            return newHead;
        }
    }

    public Node findCycle(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast)
                return slow;
        }
        return null;
    }
}

public class LinkedListAction {
    public static void main(String[] args) {
        Node head = new Node(10);
        Node node2 = new Node(20);
        Node node3 = new Node(30);
        Node node4 = new Node(40);
        Node node5 = new Node(50);

        head.next = node2;
        node2.next = node3;
        node3.next = head;
        node4.next = node5;
        Action action = new Action();
        //Node newHead =action.reverseRecursion(head);

        Node node = action.findCycle(head);
    }
}

