package tree;

import helpers.Queue;

import java.util.ArrayList;

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
            System.out.println(error.Errors.unexpectedError());
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
            System.out.println(error.Errors.unexpectedError());
        }
        return output;
    }

    public boolean checkBinaryTreeDepth(){
        boolean output = true;
        try {
            if (root.left != null)
                output = output && checkBinaryTreeDepth(root.left,this.root.value,false);
            if (root.right != null)
                output = output && checkBinaryTreeDepth(root.right,this.root.value,true);
        }catch (Exception ex){
            System.out.println(ex);
        }
        return output;
    }

    public boolean checkBinaryTreeDepth(Node root, Object value,boolean isRight){
        boolean output = true;
        try {
            if(isRight == true && (int) value > (int) root.value ){
                return false;
            }else if(isRight == false && (int) value < (int) root.value ){
                return false;
            }
            if (root.left != null){
                output = output && checkBinaryTreeDepth(root.left,root.value, false);
            }
            if (root.right != null)
                output = output && checkBinaryTreeDepth(root.right,root.value,true);
        }catch (Exception ex){
            System.out.println(ex);
        }
        return output;
    }


    public boolean checkBinaryIdenticalTreeDepth(Node root1, Node root2){
        boolean output = true;
        try {
            if (root1.left != null){
                if( root2.left == null || (int)  root2.left.value != (int) root1.left.value){
                    return false;
                }
                output = output && checkBinaryIdenticalTreeDepth(root1.left,root2.left);
            }
            if(root2.left != null  && root1.left == null || root2.right != null  && root1.right == null){
                return false;
            }
            if (root1.right != null){
                if( root2.right == null || (int)  root2.right.value != (int) root1.right.value){
                    return false;
                }
                output = output && checkBinaryIdenticalTreeDepth(root1.right,root2.right);
            }
        }catch (Exception ex){
            System.out.println(ex);
        }
        return output;
    }


    public  boolean checkBinaryBreadthFirst(){
        ArrayList arrayList = new ArrayList();
        if(this.root == null)return  true;
        Queue queue = new Queue();
        queue.enqueue(this.root);
        while (queue.front != null){
            arrayList.add(((Node) queue.front.value).value);
            if(((Node) queue.front.value).left != null){
                if((int)((Node) queue.front.value).value < (int)((Node) queue.front.value).left.value ){
                    return false;
                }
                queue.enqueue(((Node) queue.front.value).left);
            }
            if(((Node) queue.front.value).right != null){
                if((int)((Node) queue.front.value).value > (int)((Node) queue.front.value).right.value ){
                    return false;
                }
                queue.enqueue(((Node) queue.front.value).right);
            }
            queue.dequeue();
        }
        return true;
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

    @Override
    public String toString() {
        return "BinaryTree{" +
                "root=" + root +
                '}';
    }
}
