package linkedlist;

// https://leetcode.com/problems/reverse-linked-list/
public class LinkedList {

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

}
