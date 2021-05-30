package linkedList;

public class Node {
    public Object val;
    public Node next;

    public Node(Object val) {
        this.val = val;
    }

    @Override
    public String toString() {
        return "Node{" +
                "val=" + val +
                ", next=" + next +
                '}';
    }
}