package tree;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class FindMaximumTest {
    // Test first solution;
    @Test
    public void testFindMaximumEmptyTreeFirstSolutionMethod() {
        BinarySearchTree tree = new BinarySearchTree();
        assertEquals("Test empty tree",0,tree.findMaximumValue());
    }

    @Test
    public void testFindMaximumPositiveValuesFirstSolutionMethod() {
        BinarySearchTree tree = new BinarySearchTree();
        tree.add(1);
        tree.add(2);
        tree.add(3);
        tree.add(4);
        assertEquals("Test find max value from tree with positive Values",4,tree.findMaximumValue());
    }

    @Test
    public void testFindMaximumNegativeValuesFirstSolutionMethod() {
        BinarySearchTree tree = new BinarySearchTree();
        tree.add(-1);
        tree.add(-2);
        tree.add(-3);
        tree.add(-4);
        assertEquals("Test find max value from tree with negative Values",-1,tree.findMaximumValue());
    }

    @Test
    public void testFindMaximumNegativeAndPositiveValuesFirstSolutionMethod() {
        BinarySearchTree tree = new BinarySearchTree();
        tree.add(-1);
        tree.add(-2);
        tree.add(1);
        tree.add(2);
        assertEquals("Test find max value from tree with negative and positive Values",2,tree.findMaximumValue());
    }

    // Test 2nd solution;
    @Test
    public void testFindMaximumEmptyTree2ndSolutionMethod() {
        BinarySearchTree tree = new BinarySearchTree();
        assertEquals("Test empty tree",0,tree.findMax());
    }

    @Test
    public void testFindMaximumPositiveValues2ndSolutionMethod() {
        BinarySearchTree tree = new BinarySearchTree();
        tree.add(1);
        tree.add(2);
        tree.add(3);
        tree.add(4);
        assertEquals("Test find max value from tree with positive Values",4,tree.findMax());
    }

    @Test
    public void testFindMaximumNegativeValues2ndSolutionMethod() {
        BinarySearchTree tree = new BinarySearchTree();
        tree.add(-1);
        tree.add(-2);
        tree.add(-3);
        tree.add(-4);
        assertEquals("Test find max value from tree with negative Values",-1,tree.findMax());
    }

    @Test
    public void testFindMaximumNegativeAndPositiveValues2ndSolutionMethod() {
        BinarySearchTree tree = new BinarySearchTree();
        tree.add(-1);
        tree.add(-2);
        tree.add(1);
        tree.add(2);
        assertEquals("Test find max value from tree with negative and positive Values",2,tree.findMax());
    }
}
