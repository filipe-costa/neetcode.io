package linkedlist;

public class ListNode {
    int val;
    ListNode next;

    ListNode() {}

    ListNode(int val) {
        this.val = val;
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(o == null  || getClass() != o.getClass()) return false;

        ListNode node = (ListNode) o;
        return val == node.val;
    }
}
