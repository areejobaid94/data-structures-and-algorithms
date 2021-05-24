package hashtable;

import org.junit.Test;
import tree.BinaryTree;
import TreeIntersection.TreeIntersectionStretchGoals;
import static org.junit.Assert.assertEquals;

public class TreeIntersectionStretchGoalsTest {
    @Test
    public void testTreeIntersectionMethodWithFirstTreeEmpty(){
        BinaryTree binaryTree1 = new BinaryTree();

        BinaryTree binaryTree2 = new BinaryTree();
        binaryTree2.add(1);
        binaryTree2.add(2);
        binaryTree2.add(3);

        assertEquals("Test  treeIntersection Method With First Tree Empty",0, TreeIntersectionStretchGoals.tree_intersection(binaryTree1,binaryTree2).size());
        assertEquals("Test  treeIntersection Method With First Tree Empty","[]", TreeIntersectionStretchGoals.tree_intersection(binaryTree1,binaryTree2).toString());
    }

    @Test
    public void testTreeIntersectionMethodWith2ndTreeEmpty(){
        BinaryTree binaryTree1 = new BinaryTree();
        binaryTree1.add(1);
        binaryTree1.add(2);
        binaryTree1.add(3);

        BinaryTree binaryTree2 = new BinaryTree();

        assertEquals("Test  treeIntersection Method With 2nd Tree Empty",0, TreeIntersectionStretchGoals.tree_intersection(binaryTree1,binaryTree2).size());
        assertEquals("Test  treeIntersection Method With 2nd Tree Empty","[]", TreeIntersectionStretchGoals.tree_intersection(binaryTree1,binaryTree2).toString());
    }

    @Test
    public void testTreeIntersectionMethodWithBothTreesEmpty(){
        BinaryTree binaryTree1 = new BinaryTree();

        BinaryTree binaryTree2 = new BinaryTree();

        assertEquals("Test  treeIntersection Method With Both Trees Empty",0, TreeIntersectionStretchGoals.tree_intersection(binaryTree1,binaryTree2).size());
        assertEquals("Test  treeIntersection Method With Both Trees Empty","[]", TreeIntersectionStretchGoals.tree_intersection(binaryTree1,binaryTree2).toString());
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

        assertEquals("Test  treeIntersection Method With No Shared Values",0, TreeIntersectionStretchGoals.tree_intersection(binaryTree1,binaryTree2).size());
        assertEquals("Test  treeIntersection Method With No Shared Values","[]", TreeIntersectionStretchGoals.tree_intersection(binaryTree1,binaryTree2).toString());
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

        assertEquals("Test  treeIntersection Method With All Shared Values",3, TreeIntersectionStretchGoals.tree_intersection(binaryTree1,binaryTree2).size());
        assertEquals("Test  treeIntersection Method With All Shared Values","[1, 2, 3]", TreeIntersectionStretchGoals.tree_intersection(binaryTree1,binaryTree2).toString());
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

        assertEquals("Test  treeIntersection Method With Not All Shared Values",3, TreeIntersectionStretchGoals.tree_intersection(binaryTree1,binaryTree2).size());
        assertEquals("Test  treeIntersection Method With Not All Shared Values","[1, 2, 3]", TreeIntersectionStretchGoals.tree_intersection(binaryTree1,binaryTree2).toString());
    }
}
