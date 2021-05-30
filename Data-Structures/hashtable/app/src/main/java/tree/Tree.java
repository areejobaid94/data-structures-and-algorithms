package tree;

public class Tree <T> extends BinaryTree{
    public KAnyNode root;
    public Tree(T value,int maxNrOfChildren) {

        this.root = new KAnyNode(value);
    }

    public Tree(KAnyNode kAnyNode) {
    }

    @Override
    public String toString() {
        return "Tree{" +
                "root=" + root +
                '}';
    }
}

