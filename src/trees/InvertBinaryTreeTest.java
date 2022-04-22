package trees;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InvertBinaryTreeTest {
    @Test
    public void should_invert_binary_tree() {
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(1);
        root.right = new TreeNode(3);

        TreeNode expected = new TreeNode(2);
        expected.left = new TreeNode(3);
        expected.right = new TreeNode(1);

        assertEquals(expected, InvertBinaryTree.invertTree(root));
    }
}