package tree;

import java.util.ArrayList;

public class KAnyNode  extends Node{
    public ArrayList<KAnyNode> children = new ArrayList<>();
    public Object value;

    public KAnyNode(Object value) {
        this.value = value;
    }
    public KAnyNode(Object value,ArrayList children) {
        this.value = value;
        this.children = children;
    }
    public KAnyNode() {
    }

    @Override
    public String toString() {
        return "KAnyNode{" +
                "children=" + children +
                ", value=" + value +
                '}';
    }
}
