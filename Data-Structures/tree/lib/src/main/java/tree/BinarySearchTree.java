package tree;

public class BinarySearchTree<T> extends BinaryTree {

    public BinarySearchTree(Object value) {
        super(value);
    }

    public BinarySearchTree() {
    }

    public void add(T value){
        Node node = new Node(value);
        if(root == null)
            root = node;
        else {
            Node current =  root;
            while (current != null){
                if((int) current.value > (int) value) {
                    if (current.left == null){
                        current.left = node;
                        break;
                    }
                    current = current.left;
                }else{
                    if (current.right == null){
                        current.right = node;
                        break;
                    }
                    current = current.right;
                }
            }
        }

    };

    public boolean contains(T value){
        Node current =  root;
        while (current != null){
            if (current.value == value)
                return  true;
            if((int) current.value > (int) value)
                current = current.left;
            else
                current = current.right;
        }
        return false;
    };

    @Override
    public String toString() {
        return "BinarySearchTree{" +
                "root=" + root +
                '}';
    }
}
