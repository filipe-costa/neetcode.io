package linkedlist;


public class LinkedList {

    // https://leetcode.com/problems/reverse-linked-list/
    public static ListNode reverseList(ListNode head) {
        ListNode next = null;
        ListNode prev = null;
        ListNode curr = head;
        while(curr != null) {
            next = curr.next;
            curr.next = prev;

            // swap
            prev = curr;
            curr = next;
        }

        head = prev;
        return head;
    };

    // https://leetcode.com/problems/merge-two-sorted-lists
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode listNode = new ListNode();
        ListNode tail = listNode;

        // List1 -> 1 -> 2 -> 3
        // List2 -> 1 -> 2 -> 4
        // List -> 1 -> 1 -> 2 -> 2 -> 3 -> 4

        // List1 -> 1 -> 2
        // List2 -> 1 -> 2 -> 4
        // List -> 1 -> 1 -> 2 -> 2 -> 4

        // Similar algorithm to merge in merge sort
        while(list1 != null && list2 != null) {
            if(list1.val < list2.val) {
                tail.next = list1;
                list1 = list1.next;
            } else {
                tail.next = list2;
                list2 = list2.next;
            }

            tail = tail.next;
        }

        if(list1 != null) {
            tail.next = list1;
        } else if(list2 != null) {
            tail.next = list2;
        }

        return listNode.next;
    }
}
