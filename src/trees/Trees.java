package trees;

public class Trees {

    // https://leetcode.com/problems/invert-binary-tree
    public static TreeNode invertTree(TreeNode root) {
        if(root == null) {
            return null;
        }


        TreeNode tmp = root.left;
        root.left = root.right;
        root.right = tmp;

        invertTree(root.left);
        invertTree(root.right);

        return root;
    }

    // https://leetcode.com/problems/maximum-depth-of-binary-tree/
    public static int maxDepth(TreeNode root) {
        if(root == null) {
            return 0;
        }

        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }
}
