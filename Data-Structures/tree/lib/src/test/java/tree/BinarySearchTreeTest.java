package tree;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class BinarySearchTreeTest {
    @Test
    public void testInstantiateAnEmptyBinarySearchTreeMethod() {
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        assertTrue("Test tree with no args",binarySearchTree instanceof BinarySearchTree);
    }

    @Test public void testInstantiateBinarySearchTreeWithSingleRoot() {
        BinarySearchTree binarySearchTreeWithArgs = new BinarySearchTree();
        assertTrue("Test tree with args",binarySearchTreeWithArgs instanceof BinarySearchTree);
    }

    @Test
    public void testAddNodeToSingleRootNodeMethod() {
        BinarySearchTree binarySearchTree = new BinarySearchTree(3);
        binarySearchTree.add(1);
        binarySearchTree.add(2);
        binarySearchTree.add(4);
        assertTrue("Test root value",binarySearchTree.contains(3));
        assertTrue("Test left value",binarySearchTree.contains(2));
        assertTrue("Test right value",binarySearchTree.contains(1));
        assertTrue("Test right value",binarySearchTree.contains(4));
        System.out.println(binarySearchTree.toString());
        assertEquals("check the value of the tree after adding left and right","BinarySearchTree{root=Node{value=3, left=Node{value=1, left=null, right=Node{value=2, left=null, right=null}}, right=Node{value=4, left=null, right=null}}}",binarySearchTree.toString());
    }

    @Test public void testPreorderTraversalRoot() {
        BinarySearchTree binarySearchTree = new BinarySearchTree(3);
        binarySearchTree.add(1);
        binarySearchTree.add(2);
        binarySearchTree.add(4);
        assertEquals("Test tree with args","3124",binarySearchTree.preOrder());
    }

    @Test public void testInorderTraversalRoot() {
        BinarySearchTree binarySearchTree = new BinarySearchTree(3);
        binarySearchTree.add(1);
        binarySearchTree.add(2);
        binarySearchTree.add(4);
        assertEquals("Test tree with args","1234",binarySearchTree.inOrder());
    }

    @Test public void testPostorderTraversalRoot() {
        BinarySearchTree binarySearchTree = new BinarySearchTree(3);
        binarySearchTree.add(1);
        binarySearchTree.add(2);
        binarySearchTree.add(4);
        assertEquals("Test tree with args","2143",binarySearchTree.postOrder());
    }
}
