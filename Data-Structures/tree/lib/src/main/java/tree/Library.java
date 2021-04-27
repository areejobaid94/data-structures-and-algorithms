/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package tree;

import tree.utilities.FizzBuzzTree;
import tree.utilities.KAnyNode;

import java.util.ArrayList;

public class Library {
    public static void main(String[] args) {
//        Node node = new Node();
//        BinarySearchTree binarySearchTree = new BinarySearchTree();
//        binarySearchTree.add(2);
//        binarySearchTree.add(3);
//        binarySearchTree.add(4);
//        binarySearchTree.add(1);
//
//        System.out.println(binarySearchTree);
//        System.out.println(binarySearchTree.contains(2));
//        System.out.println(binarySearchTree.contains(3));
//        System.out.println(binarySearchTree.contains(4));
//        System.out.println(binarySearchTree.contains(10));
//        System.out.println(binarySearchTree.contains(1));
//        System.out.println(binarySearchTree.contains(8));
//        System.out.println(binarySearchTree.contains(9));
//        System.out.println(binarySearchTree.postOrder());
//        System.out.println(binarySearchTree.postOrder());
//        System.out.println(binarySearchTree.findMaximumValue());
//        System.out.println(binarySearchTree.findMax());

        BreadthFirst breadthFirst = new BreadthFirst();
        breadthFirst.add(2);
        breadthFirst.add(3);
        breadthFirst.add(4);
        breadthFirst.add(1);
        breadthFirst.add(7);
        breadthFirst.add(0);

//        System.out.println("binarySearchTree.findMax()");
//        System.out.println(BreadthFirst.breadthFirst(breadthFirst));
//        System.out.println(breadthFirst.breadthFirst());

        Tree tree = new Tree();
        ArrayList<KAnyNode> arrayList = new ArrayList<>();
        arrayList.add(new KAnyNode(5));
        arrayList.add(new KAnyNode(6));
        KAnyNode kAnyNode1 = new KAnyNode(2);
        KAnyNode kAnyNode3 = new KAnyNode(3);
        KAnyNode kAnyNode4 = new KAnyNode(4);
        kAnyNode4.children  =arrayList;
        ArrayList<KAnyNode> arrayList2 = new ArrayList<>();

        tree.root = new KAnyNode(1);
        arrayList2.add(kAnyNode4);
        arrayList2.add(kAnyNode3);
        arrayList2.add(kAnyNode1);
        tree.root.children =arrayList2;
        System.out.println(tree);
        System.out.println(FizzBuzzTree.fizzBuzzTree(tree));

    }

}
