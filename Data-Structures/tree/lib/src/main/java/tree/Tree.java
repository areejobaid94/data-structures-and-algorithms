package tree;

import tree.utilities.KAnyNode;

import java.util.ArrayList;

public class Tree <T>{
    public KAnyNode root;
    public Tree(T value,int maxNrOfChildren) {

        this.root = new KAnyNode(value);
    }

    public Tree() {
    }

    @Override
    public String toString() {
        return "Tree{" +
                "root=" + root +
                '}';
    }
}
