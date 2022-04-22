package trees;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TreesTest {

    // Invert Binary Tree
    @Test
    public void should_invert_binary_tree() {
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(1);
        root.right = new TreeNode(3);

        TreeNode expected = new TreeNode(2);
        expected.left = new TreeNode(3);
        expected.right = new TreeNode(1);

        assertEquals(expected, Trees.invertTree(root));
    }


    // Max Depth of a Tree
    @Test
    public void should_return_max_depth_of_3() {
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(1);
        root.right = new TreeNode(3);
        root.right.right = new TreeNode(4);

        int expected = 3;

        assertEquals(expected, Trees.maxDepth(root));
    }

    @Test
    public void should_return_max_depth_of_0_when_tree_is_null() {
        int expected = 0;
        assertEquals(expected, Trees.maxDepth(null));
    }
}