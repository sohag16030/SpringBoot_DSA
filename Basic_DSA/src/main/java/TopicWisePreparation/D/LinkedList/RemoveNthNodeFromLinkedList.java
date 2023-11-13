package TopicWisePreparation.D.LinkedList;

import org.w3c.dom.NodeList;

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class RemoveNthNodeFromLinkedList {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        head.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        ListNode newHead = removeNthFromEnd(head, 2);
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        //1
        //1-->2
        //1-->2-->3
        //1-->2-->3-->4
        if (head == null || head.next == null) return null;
        ListNode newhead = reverseLinkedList(head);
        if (n == 1)
            newhead = newhead.next;
        else {
            int pos = 1;
            ListNode curr = newhead, prev = null;
            while (pos < n && curr.next != null) {
                prev = curr;
                curr = curr.next;
                pos++;
            }
            if (curr.next != null) {
                prev.next = curr.next;
            } else {
                prev.next = null;
            }
        }
        ListNode finalHead = reverseLinkedList(newhead);
        return finalHead;
    }

    private static ListNode reverseLinkedList(ListNode head) {
        if (head == null || head.next == null) return head;
        else {
            //10-->20-->30
            ListNode curr = head;
            ListNode prev = null;
            ListNode next;
            while (curr != null) {
                next = curr.next;//20//30
                curr.next = prev;//null<--10<--20
                prev = curr;//10//20
                curr = next;//20//null
            }
            return prev;
        }
    }
}
