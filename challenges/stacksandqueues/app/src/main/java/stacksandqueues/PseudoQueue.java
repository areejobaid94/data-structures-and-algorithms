package stacksandqueues;

public class PseudoQueue<T> {
    public Stack getStackQueue() {
        return stackQueue;
    }

    public void setStackQueue(Stack stackQueue) {
        this.stackQueue = stackQueue;
    }

    public Stack getStackHelper() {
        return stackHelper;
    }

    public void setStackHelper(Stack stackHelper) {
        this.stackHelper = stackHelper;
    }

    Stack stackQueue;
    Stack stackHelper;

    public PseudoQueue() {
        this.stackQueue = new Stack();
        this.stackHelper = new Stack();
    }

    public void enqueue(T value){
        try {
            while (!stackQueue.isEmpty()){
                stackHelper.push(stackQueue.pop());
            }
            stackQueue.push(value);
            while (!stackHelper.isEmpty()){
                stackQueue.push(stackHelper.pop());
            }
        }catch (Exception ex){
            System.out.println(ex);
        }
    }


    @Override
    public String toString() {
        return "PseudoQueue{" +
                "stackQueue=" + stackQueue +
                ",stackHelper=" +stackHelper +
                '}';
    }
    public Object dequeue(){
        Object value = new Object();
        try {
            value = stackQueue.pop();
        }catch (NullPointerException ex){
            System.out.println(ex);
        }
        return value;
    }
}
