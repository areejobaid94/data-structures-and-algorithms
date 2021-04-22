package stacksandqueues;

import org.checkerframework.checker.units.qual.A;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Stack<T> {
    ArrayList<Integer> maxStack = new ArrayList();

    public Node getTop() {
        return top;
    }

    public void setTop(Node top) {
        this.top = top;
    }

    Node top;

    public Stack(T value) {
        this.top = new Node(value);
    }

    public Stack() {
    }

    public void push(T value){
        try {
            Node node = new Node(value);
            node.next = top;
            top = node;
            if(maxStack.size() == 0 || maxStack.get(maxStack.size() -1)  < (int) peek() ){
                maxStack.add((int)value);
            }
        }catch (Exception ex){
            System.out.println(ex);
        }
    }

    public Object pop(){
        Node lastNode = top;
        try {
            if (isEmpty()){
                return new NullPointerException();
            }
            top = top.next;
            lastNode.next = null;
            if(maxStack.size()!= 0 && (int)lastNode.value == maxStack.get(maxStack.size() - 1)){
                maxStack.remove(maxStack.size() - 1);
            }
        }catch (NullPointerException ex){
            System.out.println(ex);
        }
        return lastNode.value;
    }

    public Object peek() {
        try {
            if (isEmpty())
                return new NullPointerException();
        }catch (NullPointerException ex){
            System.out.println(ex);
        }
        return top.value;
    }

    @Override
    public String toString() {
        return "Stack{" +
                "top=" + top +
                '}';
    }
    public Object getMax(){
        if(maxStack.size() > 0 ){
            return maxStack.get(maxStack.size() - 1);
        }
        return new NullPointerException();
    }

    public Object getMaxStack(){
        if(top == null) return new NullPointerException();
        Object max = this.top.value;
        Node current = this.top;
        while (current != null){
            if((int) current.value > (int) max){
                max = current.value;
            }
            current =current.next;
        }
        return  max;
    }
    public boolean isEmpty(){
        return top == null;
    }
}
