package tree;
import org.junit.Test;
import tree.utilities.FizzBuzzTree;
import tree.utilities.KAnyNode;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class fizzBuzzTreeTest {
    @Test
    public void testFizzBuzzTreeMethod() {
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
        assertEquals("Test Fizz Buzz Tree k any tree","Tree{root=KAnyNode{children=[KAnyNode{children=[KAnyNode{children=[], value=Buzz}, KAnyNode{children=[], value=Fizz}], value=4}, KAnyNode{children=[], value=Fizz}, KAnyNode{children=[], value=2}], value=1}}", FizzBuzzTree.fizzBuzzTree(tree).toString());
    }

    @Test
    public void testFizzBuzzTreeEmptyMethod() {
        Tree tree = new Tree();

        assertEquals("Test Fizz Buzz Tree k any tree","Tree{root=null}", FizzBuzzTree.fizzBuzzTree(tree).toString());
    }

    @Test
    public void testFizzBuzzTreeWithOnlyFizzBuzzValuesMethod() {
        Tree tree = new Tree();
        ArrayList<KAnyNode> arrayList = new ArrayList<>();
        arrayList.add(new KAnyNode(5));
        arrayList.add(new KAnyNode(15));
        KAnyNode kAnyNode1 = new KAnyNode(10);
        KAnyNode kAnyNode3 = new KAnyNode(3);
        KAnyNode kAnyNode4 = new KAnyNode(6);
        kAnyNode4.children  =arrayList;
        ArrayList<KAnyNode> arrayList2 = new ArrayList<>();
        tree.root = new KAnyNode(9);
        arrayList2.add(kAnyNode4);
        arrayList2.add(kAnyNode3);
        arrayList2.add(kAnyNode1);
        tree.root.children =arrayList2;
        System.out.println(tree);
        assertEquals("Tree{root=KAnyNode{children=[KAnyNode{children=[KAnyNode{children=[], value=Buzz}, KAnyNode{children=[], value=FizzBuzz}], value=Fizz}, KAnyNode{children=[], value=Fizz}, KAnyNode{children=[], value=Buzz}], value=Fizz}}", FizzBuzzTree.fizzBuzzTree(tree).toString());
    }

    @Test
    public void testFizzBuzzTreeWithoutAnyFizzBuzzValuesMethod() {
        Tree tree = new Tree();
        ArrayList<KAnyNode> arrayList = new ArrayList<>();
        arrayList.add(new KAnyNode(1));
        arrayList.add(new KAnyNode(2));
        KAnyNode kAnyNode4 = new KAnyNode(4);
        kAnyNode4.children  =arrayList;
        ArrayList<KAnyNode> arrayList2 = new ArrayList<>();
        tree.root = new KAnyNode(8);
        arrayList2.add(kAnyNode4);
        tree.root.children =arrayList2;
        System.out.println(tree);
        assertEquals("Tree{root=KAnyNode{children=[KAnyNode{children=[KAnyNode{children=[], value=1}, KAnyNode{children=[], value=2}], value=4}], value=8}}", FizzBuzzTree.fizzBuzzTree(tree).toString());
    }
}
