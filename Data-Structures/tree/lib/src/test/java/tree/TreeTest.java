package tree;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class TreeTest {

    @Test
    public void testInstantiateAnEmptyTreeMethod() {
        Tree tree = new Tree();
        assertTrue("Test tree with no args",tree instanceof Tree);
    }

    @Test public void testInstantiateTreeWithSingleRoot() {
        Tree treeWithArgs = new Tree();
        assertTrue("Test tree with args",treeWithArgs instanceof Tree);
    }

    @Test public void checkBinaryTreeDepth() {
        BinarySearchTree binarySearchTree = new BinarySearchTree(3);
        binarySearchTree.add(1);
        binarySearchTree.add(2);
        binarySearchTree.add(4);
        BinaryTree binaryTree = new BinaryTree(0);
        Node left = new Node(7);
        left.left = new Node(9);
        left.right = new Node(3);
        Node right = new Node(1);
        binaryTree.root.left = left;
        binaryTree.root.right = right;

        BinarySearchTree binarySearchTree2 = new BinarySearchTree(3);
        binarySearchTree2.add(1);
        binarySearchTree2.add(2);
        binarySearchTree2.add(4);
        System.out.println(binarySearchTree.checkBinaryTreeDepth());
        System.out.println(binarySearchTree.checkBinaryTreeDepth());
        System.out.println(binaryTree.checkBinaryBreadthFirst());
        System.out.println(binaryTree.checkBinaryTreeDepth());
        System.out.println(binaryTree.checkBinaryIdenticalTreeDepth(binarySearchTree.root,binarySearchTree2.root));
        binarySearchTree2.add(100);
        System.out.println(binaryTree.checkBinaryIdenticalTreeDepth(binarySearchTree.root,binarySearchTree2.root));
        System.out.println(binaryTree.checkBinaryIdenticalTreeDepth(binarySearchTree2.root,binarySearchTree.root));

    }

}
