package TopicWisePreparation.D.LinkedList;

public class AddTwoNumbers {

    public static void main(String[] args) {
        ListNode l1 = new ListNode(5);
        ListNode node2 = new ListNode(9);
        ListNode node3 = new ListNode(9);
        ListNode node4 = new ListNode(9);
        ListNode node5 = new ListNode(9);
        ListNode node9 = new ListNode(9);

    //    l1.next = node2;
//        node2.next = node3;
//        node3.next = node4;
//        node4.next = node5;
//        node5.next = node9;

        ListNode l2 = new ListNode(5);
        ListNode node6 = new ListNode(9);
        ListNode node7 = new ListNode(9);
        ListNode node8 = new ListNode(9);

        //l2.next = node6;
//        node6.next = node7;
//        node7.next = node8;

        System.out.println(addTwoNumbers(l1, l2));
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        System.out.println(l1.val + " " + l2.val);
        ListNode head = null;
        int rem = 0, s = 0;

        if (l1 != null || l2 != null) {
            s = rem + l1.val + l2.val;
            rem = s / 10;
            s = s % 10;
            head = new ListNode(s);
        }
        int cnt = 1;
        while (l1.next != null && l2.next != null) {
            l1 = l1.next;
            l2 = l2.next;
            System.out.println(l1.val + " " + l2.val);
            s = rem + l1.val + l2.val;
            rem = s / 10;
            s = s % 10;
            ListNode curr = head;
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = new ListNode(s);
            cnt++;
        }
        if (l1.next != null) {
            while (l1.next != null) {
                l1 = l1.next;
                System.out.println(l1.val);
                s = rem + l1.val;
                rem = s / 10;
                s = s % 10;
                ListNode curr = head;
                while (curr.next != null) {
                    curr = curr.next;
                }
                curr.next = new ListNode(s);
            }

        } else if (l2.next != null) {
            while (l2.next != null) {
                l2 = l2.next;
                System.out.println(l2.val);
                s = rem + l2.val;
                rem = s / 10;
                s = s % 10;
                ListNode curr = head;
                while (curr.next != null) {
                    curr = curr.next;
                }
                curr.next = new ListNode(s);
            }

        }
        ListNode curr = head;
        if(rem>0){
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = new ListNode(rem);
        }

        return head;
    }
}
