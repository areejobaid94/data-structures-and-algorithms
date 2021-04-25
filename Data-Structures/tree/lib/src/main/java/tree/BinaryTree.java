package tree;

public class BinaryTree <T>{
    Node root;

    public BinaryTree(T value) {
        this.root = new Node(value);
    }

    public BinaryTree() {
    }

    public String preOrder(Node root){
        String output = "";
        try {
            output += root.value;

            if(root.left != null)
                output += preOrder(root.left);

            if (root.right != null)
                output += preOrder(root.right);
        }catch (Exception ex){
            System.out.println(error.Errors.unexpectedError());
        }
        return output;
    }

    public String preOrder(){
        String output = "";
        try {
            output += this.root.value;
            if(this.root.left != null)
                output += preOrder(this.root.left);
            if (this.root.right != null)
                output += preOrder(this.root.right);
        }catch (Exception ex){
            System.out.println(error.Errors.unexpectedError());
        }
        return output;
    }

    public int findMax(){
        int max = 0;
        int value = (int) this.root.value;
        try {
            if(max < value)max =value;
            if(this.root.left != null){
                value =  findMax(this.root.left);
                if(max < value)max =value;
            }
            if (this.root.right != null) {
                value = findMax(this.root.right);
                if(max < value)max =value;
            }
        }catch (Exception ex){
            System.out.println(error.Errors.unexpectedError());
        }
        return max;
    }

    public int findMax(Node root){
        int max = 0;
        int value = (int) root.value;
        try {
            if(max < value)max =value;
            if(root.left != null){
                value =  findMax(root.left);
                if(max < value)max =value;
            }
            if (root.right != null) {
                value = findMax(root.right);
                if(max < value)max =value;
            }
        }catch (Exception ex){
            System.out.println(error.Errors.unexpectedError());
        }
        return max;
    }


    public String inOrder(Node root){
        String output = "";
        try {
            if (root.left != null)
                output += inOrder(root.left);
            output += root.value;
            if (root.right != null)
                output += inOrder(root.right);
        }catch (Exception ex){
            System.out.println(error.Errors.unexpectedError());
        }
        return output;
    }


    public String inOrder(){
        String output = "";
        try {
            if(this.root == null) return output;
            if (this.root.left != null)
                output += inOrder(this.root.left);
            output += root.value;
            if (this.root.right != null)
                output += inOrder(this.root.right);
        }catch (Exception ex){
            System.out.println(error.Errors.unexpectedError());
        }
        return output;
    }

    public String postOrder(Node root){
        String output = "";
        try {
            if (root.left != null)
                output += postOrder(root.left);

            if(root.right != null)
                output += postOrder(root.right);

            output += root.value;
        }catch (Exception ex){
            System.out.println(error.Errors.unexpectedError());
        }
        return output;
    }

    public String postOrder(){
        String output = "";
        try {
            if (root.left != null)
                output += postOrder(root.left);

            if(root.right != null)
                output += postOrder(root.right);

            output += root.value;
        }catch (Exception ex){
            System.out.println(error.Errors.unexpectedError());
        }
        return output;
    }
}
