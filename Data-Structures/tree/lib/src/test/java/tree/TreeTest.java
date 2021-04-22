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
}
