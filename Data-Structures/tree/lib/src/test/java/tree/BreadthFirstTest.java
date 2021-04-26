package tree;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class BreadthFirstTest {
    @Test
    public void testBreadthFirstAnEmptyTree() {
        BreadthFirst tree = new BreadthFirst();
        assertEquals("[]",tree.breadthFirst().toString());
    }

    @Test public void testBreadthFirstTreeWithRoot() {
        BreadthFirst tree = new BreadthFirst();
        tree.add(2);
        assertEquals("[2]",tree.breadthFirst().toString());
    }
    @Test public void testBreadthFirstTreeWithRootAndLeafs() {
        BreadthFirst tree = new BreadthFirst();
        tree.add(2);
        tree.add(4);
        tree.add(5);
        tree.add(1);
        tree.add(0);
        assertEquals("[2, 1, 4, 0, 5]",tree.breadthFirst().toString());
    }
}
