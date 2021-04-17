package stacksandqueues;

public class Stack<T> {
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

    public boolean isEmpty(){
        return top == null;
    }
}
