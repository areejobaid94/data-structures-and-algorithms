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


    // find max first solution
    public Object findMaximumValue(){
        if(root == null)return 0;
        Integer max =(Integer) root.value;
        Integer value = (Integer) this.root.value;
        try {
            if(max < value)max = (Integer) value;
            if(this.root.left != null){
                value = (Integer) findMaximumValue(this.root.left);
                if(max < value)max =value;
            }
            if (this.root.right != null) {
                value = (Integer) findMaximumValue(this.root.right);
                if(max < value)max =value;
            }
        }catch (Exception ex){
            System.out.println(error.Errors.unexpectedError());
        }
        return max;
    }

    // overload findMaximumValue
    public static Object findMaximumValue(Node root){
        if(root == null)return 0;
        Integer value = (Integer) root.value;
        Integer max = value ;
        try {
            if(max < value)max =value;
            if(root.left != null){
                value = (Integer) findMaximumValue(root.left);
                if(max < value)max =value;
            }
            if (root.right != null) {
                value =(Integer) findMaximumValue(root.right);
                if(max < value)max =value;
            }
        }catch (Exception ex){
            System.out.println(error.Errors.unexpectedError());
        }
        return max;
    }

    // 2nd solution find max value with Method in method;

    // interface to implement method on method;
    interface maxInterface {
        void findMaxIn();
    }

    public Object findMax (){
        if(root == null)return 0;
        final Integer[] max = {(Integer) root.value};
        final Integer[] value = {(Integer) root.value};
        maxInterface innerMethodInterface = new maxInterface() {
            public void findMaxIn() {
                try {
                    if(max[0] < value[0]) max[0] = value[0];
                    if(root.left != null){
                        value[0] = (Integer) findMaximumValue(root.left);
                        if(max[0] < value[0]) max[0] = value[0];
                    }
                    if (root.right != null) {
                        value[0] =(Integer) findMaximumValue(root.right);
                        if(max[0] < value[0]) max[0] = value[0];
                    }
                }catch (Exception ex){
                    System.out.println(error.Errors.unexpectedError());
                }
            }
        };
        innerMethodInterface.findMaxIn();
        return max[0];
    }

}
