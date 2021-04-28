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

    public static Object sumOfOdd  (Node root){
        Object sum = 0;
        try {
            if(root == null)return sum;
            if((Integer) root.value % 2 != 0)
                sum = (Integer) sum + (Integer)  root.value;

            if(root.left != null)
                sum = (Integer) sum +(Integer) sumOfOdd(root.left);

            if (root.right != null)
                sum = (Integer) sum + (Integer) sumOfOdd(root.right);
        }catch (Exception ex){
            System.out.println(error.Errors.unexpectedError());
        }
        return sum;
    }

    @Override
    public String toString() {
        return "BinarySearchTree{" +
                "root=" + root +
                '}';
    }
}
