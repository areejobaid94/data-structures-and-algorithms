package hashtable;

import LeftJoin.LeftJoin;
import RepeatedWord.RepeatedWord;
import TreeIntersection.TreeIntersection;
import org.junit.Test;
import tree.BinaryTree;

import static org.junit.Assert.assertEquals;

public class LeftJoinTest {
    @Test
    public void testLeftJoinMethodForEmptyLeftHashTable(){
        Hashtable hashtableLeft = new Hashtable();
        Hashtable hashtableRight = new Hashtable();
        hashtableRight.add("areej",10);
        hashtableRight.add("areej1",20);
        hashtableRight.add("areej2",30);
        hashtableRight.add("areej6",30);

        assertEquals("Test LeftJoin Method For Empty LeftHashTable","[]", LeftJoin.leftJoin(hashtableLeft,hashtableRight).toString());
        assertEquals("Test LeftJoin Method For Empty LeftHashTable",0, LeftJoin.leftJoin(hashtableLeft,hashtableRight).size());
    }

    @Test
    public void testLeftJoinMethodForEmptyRightHashTable(){
        Hashtable hashtableLeft = new Hashtable();
        Hashtable hashtableRight = new Hashtable();
        hashtableLeft.add("areej",10);
        hashtableLeft.add("areej1",20);
        hashtableLeft.add("areej2",30);
        hashtableLeft.add("areej6",30);

        assertEquals("Test LeftJoin Method For Empty RightHashTable","[[areej6, 30, null], [areej1, 20, null], [areej, 10, null], [areej2, 30, null]]", LeftJoin.leftJoin(hashtableLeft,hashtableRight).toString());
        assertEquals("Test LeftJoin Method For Empty RightHashTable",4, LeftJoin.leftJoin(hashtableLeft,hashtableRight).size());
    }

    @Test
    public void testLeftJoinMethodForBothHashTableEmpty(){
        Hashtable hashtableLeft = new Hashtable();
        Hashtable hashtableRight = new Hashtable();

        assertEquals("Test LeftJoin Method For Both HashTables Empty","[[areej6, 30, null], [areej1, 20, null], [areej, 10, null], [areej2, 30, null]]", LeftJoin.leftJoin(hashtableLeft,hashtableRight).toString());
        assertEquals("Test LeftJoin Method For Empty RightHashTable",4, LeftJoin.leftJoin(hashtableLeft,hashtableRight).size());
    }

    @Test
    public void testTreeIntersectionMethodWithNoSharedValues(){
        BinaryTree binaryTree1 = new BinaryTree();
        binaryTree1.add(1);
        binaryTree1.add(2);
        binaryTree1.add(3);

        BinaryTree binaryTree2 = new BinaryTree();
        binaryTree1.add(4);
        binaryTree1.add(5);
        binaryTree1.add(6);

        assertEquals("Test  treeIntersection Method With No Shared Values",0, TreeIntersection.tree_intersection(binaryTree1,binaryTree2).size());
        assertEquals("Test  treeIntersection Method With No Shared Values","[]", TreeIntersection.tree_intersection(binaryTree1,binaryTree2).toString());
    }

    @Test
    public void testTreeIntersectionMethodWithAllSharedValues(){
        BinaryTree binaryTree1 = new BinaryTree();
        binaryTree1.add(1);
        binaryTree1.add(2);
        binaryTree1.add(3);

        BinaryTree binaryTree2 = new BinaryTree();
        binaryTree2.add(1);
        binaryTree2.add(2);
        binaryTree2.add(3);

        assertEquals("Test  treeIntersection Method With All Shared Values",3, TreeIntersection.tree_intersection(binaryTree1,binaryTree2).size());
        assertEquals("Test  treeIntersection Method With All Shared Values","[1, 2, 3]", TreeIntersection.tree_intersection(binaryTree1,binaryTree2).toString());
    }

    @Test
    public void testTreeIntersectionMethodWithNotAllSharedValues(){
        BinaryTree binaryTree1 = new BinaryTree();
        binaryTree1.add(1);
        binaryTree1.add(2);
        binaryTree1.add(3);
        binaryTree1.add(4);

        BinaryTree binaryTree2 = new BinaryTree();
        binaryTree2.add(1);
        binaryTree2.add(2);
        binaryTree2.add(3);
        binaryTree2.add(5);
        binaryTree2.add(6);

        assertEquals("Test  treeIntersection Method With Not All Shared Values",3, TreeIntersection.tree_intersection(binaryTree1,binaryTree2).size());
        assertEquals("Test  treeIntersection Method With Not All Shared Values","[1, 2, 3]", TreeIntersection.tree_intersection(binaryTree1,binaryTree2).toString());
    }
}
