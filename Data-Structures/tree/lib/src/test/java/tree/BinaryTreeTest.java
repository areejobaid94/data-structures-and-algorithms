package tree;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class BinaryTreeTest {
    @Test
    public void testInstantiateAnEmptyTreeMethod() {
        BinaryTree tree = new BinaryTree();
        assertTrue("Test tree with no args",tree instanceof BinaryTree);
    }

    @Test public void testInstantiateTreeWithSingleRoot() {
        BinaryTree treeWithArgs = new BinaryTree();
        assertTrue("Test tree with args",treeWithArgs instanceof BinaryTree);
    }
}
