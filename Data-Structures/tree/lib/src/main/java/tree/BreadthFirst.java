package tree;

import helpers.Queue;

import java.util.ArrayList;

public class BreadthFirst extends BinarySearchTree{
    public BreadthFirst(Object value) {
        super(value);
    }

    public BreadthFirst() {
    }

    public static ArrayList  breadthFirst(BinaryTree breadthFirst){
        ArrayList arrayList = new ArrayList();
        if(breadthFirst.root == null)return  arrayList;
        Queue queue = new Queue();
        queue.enqueue(breadthFirst.root);
        while (queue.front != null){
            arrayList.add(((Node) queue.front.value).value);
            if(((Node) queue.front.value).left != null)
                queue.enqueue(((Node) queue.front.value).left);
            if(((Node) queue.front.value).right != null)
                queue.enqueue(((Node) queue.front.value).right);
            queue.dequeue();
        }
        return arrayList;
    }

    public  ArrayList<Object> breadthFirst(){
        ArrayList<Object> arrayList = new ArrayList<Object>();
        if(root == null)return  arrayList;
        Queue queue = new Queue();
        queue.enqueue(root);
        while (queue.front != null){
            arrayList.add(((Node) queue.front.value).value);
            if(((Node) queue.front.value).left != null)
                queue.enqueue(((Node) queue.front.value).left);
            if(((Node) queue.front.value).right != null)
                queue.enqueue(((Node) queue.front.value).right);
            queue.dequeue();
        }
        return arrayList;
    }
}
