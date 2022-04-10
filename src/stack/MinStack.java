package stack;

class Node {
    public int value;
    public int min;
    public Node next;

    Node(int value, int min) {
        this.value = value;
        this.min = min;
        this.next = null;
    }
}

// https://leetcode.com/problems/min-stack/
public class MinStack {
    Node head;

    public MinStack() {}

    public void push(int val) {
        if(head == null) {
            head = new Node(val, val);
        } else {
            Node n = new Node(val, Math.min(head.min, val));
            n.next = head;
            head = n;
        }
    }

    public void pop() {
        if(this.head != null) {
            Node n = this.head.next;
            this.head = n;
        }
    }

    public int top() {
        if(this.head != null) {
            return this.head.value;
        }
        return -1;
    }

    public int getMin() {
        if(this.head != null) {
            return this.head.min;
        }
        return -1;
    }
}
