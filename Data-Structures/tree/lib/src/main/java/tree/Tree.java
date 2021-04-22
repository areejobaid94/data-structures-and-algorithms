package tree;

public class Tree <T>{
    private Node root;

    public Tree(T value) {
        this.root = new Node(value);
    }

    public Tree() {
    }


}
