package linkedlist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListTest {

    @Test
    public void should_revert_linked_list_of_size_2() {
        ListNode node = new ListNode(0);
        node.next = new ListNode(1);

        ListNode expected = new ListNode(1);
        expected.next = new ListNode(0);

        assertEquals(expected, LinkedList.reverseList(node));
    }

    @Test
    public void should_merge_two_linked_lists() {
        ListNode list1 = new ListNode(0);
        list1.next = new ListNode(1);

        ListNode list2 = new ListNode(2);
        list2.next = new ListNode(3);

        ListNode expected = new ListNode(0);
        expected.next = new ListNode(1);
        expected.next.next = new ListNode(2);
        expected.next.next.next = new ListNode(3);

        assertEquals(expected, LinkedList.mergeTwoLists(list1, list2));
    }

    @Test
    public void should_merge_two_linked_lists_when_one_is_empty() {
        ListNode list2 = new ListNode(2);
        list2.next = new ListNode(3);

        ListNode expected  = new ListNode(2);
        expected.next = new ListNode(3);

        assertEquals(expected, LinkedList.mergeTwoLists(null, list2));
    }

}