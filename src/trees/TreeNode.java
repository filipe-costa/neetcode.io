package trees;

import linkedlist.ListNode;

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(o == null  || getClass() != o.getClass()) return false;

        TreeNode node = (TreeNode) o;
        return val == node.val;
    }
}
