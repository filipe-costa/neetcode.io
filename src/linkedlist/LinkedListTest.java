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

}