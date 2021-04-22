package tree;

public class Node <T>{
    public T value;
    public Node left;
    public Node right;

    public Node(T value) {
        this.value = value;
    }
    public Node() {
    }

    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                ", left=" + left +
                ", right=" + right +
                '}';
    }
}
