package tree;

public class BinaryTree <T>{
    public Node root;

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
            System.out.println(ex);
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
            System.out.println(ex);
        }
        return output;
    }

    public static int counterOfLeafs(Node root){
        Integer sum = 0;
        try {
            if(root == null)return sum;
            if(root.left != null)
                sum += counterOfLeafs(root.left);
            if (root.right != null)
                sum += counterOfLeafs(root.right);
            if(root.right == null && root.left == null)
                sum++;
        }catch (Exception ex){
            System.out.println(ex);
        }
        return sum;
    }

    public static boolean isSameNumOfLeafs(BinaryTree tree1, BinaryTree tree2){
        return counterOfLeafs(tree1.root) == counterOfLeafs(tree2.root);
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
            System.out.println(ex);
        }
        return output;
    }

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
            System.out.println(ex);
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
            System.out.println(ex);
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
            System.out.println(ex);
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
            System.out.println(ex);
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
            System.out.println(ex);
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
                    System.out.println(ex);
                }
            }
        };
        innerMethodInterface.findMaxIn();
        return max[0];
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

}
