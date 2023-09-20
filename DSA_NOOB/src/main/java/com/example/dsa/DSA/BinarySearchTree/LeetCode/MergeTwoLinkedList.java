package com.example.dsa.DSA.BinarySearchTree.LeetCode;

class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int val) {
        this.val = val;
    }
}

public class MergeTwoLinkedList {
    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        listNode1.next = new ListNode(3);
        listNode1.next.next = new ListNode(5);

        ListNode listNode2 = new ListNode(2);
        listNode2.next = new ListNode(4);
        listNode2.next.next = new ListNode(6);
        listNode2.next.next.next = new ListNode(7);
        listNode2.next.next.next.next = new ListNode(7);

        ListNode head = mergeTwoLists(listNode1, listNode2);
    }

    private static ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode head = new ListNode(0);
        ListNode ans = head;
        while (list1 != null &&list2 != null) {
            if (list1.val < list2.val) {
                head.next = list1;
                list1 = list1.next;
            } else {
                head.next = list2;
                list2 = list2.next;
            }
            head = head.next;
        }
        if (list1 != null) {
            head.next = list1;
        } else if (list2 != null) {
            head.next = list2;
        }
        return ans.next;
    }
}
