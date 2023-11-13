package TopicWisePreparation.D.LinkedList;

public class MergeTwoSortedLinkedList {
    public static void main(String[] args) {

        Node head1 = new Node(10);
        Node node2 = new Node(20);
        Node node3 = new Node(30);
        Node node4 = new Node(35);
        Node node5 = new Node(55);


        head1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        Node head2 = new Node(11);
        Node node7 = new Node(12);
        Node node8 = new Node(31);
        Node node9 = new Node(61);


        head2.next = node7;
        node7.next = node8;
        node8.next = node9;

        Node newHead = mergeTwoLists(head1, head2);

    }

    private static Node mergeTwoLists(Node head1, Node head2) {
        if (head1 == null && head2 != null) return head2;
        else if (head2 == null && head1 != null) return head1;
        else if (head1 == null && head2 == null) return null;
        else {
            Node head = null;
            while (head1 != null && head2 != null) {
                if (head1.data < head2.data) {
                    if (head == null)
                        head = new Node(head1.data);
                    else {
                        Node curr = head;
                        while (curr.next != null) {
                            curr = curr.next;
                        }
                        curr.next = new Node(head1.data);
                    }
                    head1 = head1.next;
                } else {
                    if (head == null)
                        head = new Node(head2.data);
                    else {
                        Node curr = head;
                        while (curr.next != null) {
                            curr = curr.next;
                        }
                        curr.next = new Node(head2.data);
                    }
                    head2 = head2.next;
                }
            }
            ///Need to handle rest of the part

            if (head1 != null) {
                Node tail = head;
                while (tail.next != null) {
                    tail = tail.next;
                }
                while (head1 != null) {
                    tail.next = head1;
                    tail = tail.next;
                    head1 = head1.next;
                }
            } else if (head2 != null) {
                Node tail = head;
                while (tail.next != null) {
                    tail = tail.next;
                }
                while (head2 != null) {
                    tail.next = head2;
                    tail = tail.next;
                    head2 = head2.next;
                }
            }
            return head;
        }
    }


}
