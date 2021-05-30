package queue;

public class Queue <T>{

    NodeQueue front;
    NodeQueue rear;

    public Queue(T value) {
        this.front = new NodeQueue(value); // add from back
        this.rear = this.front;
    }

    public Queue() {

    }

    public void enqueue(T value){
        NodeQueue node = new NodeQueue(value);
        if (front==null){
            front=node;
            rear=front;
        } else {
            this.rear.next=node;
            this.rear=this.rear.next;

        }

    }

    public Object dequeue(){
        NodeQueue firstNode = front;
        try {
            if (isEmpty())
                return new NullPointerException();
            if(front == rear){
                rear = null;
            }
            front = front.next;
            firstNode.next = null;
        }catch (NullPointerException ex){
            System.out.println(ex);
        }
        return firstNode;

    }


    public Object peek() {
        try {
            if (isEmpty())
                return new NullPointerException();
        }catch (NullPointerException ex){
            System.out.println(ex);
        }
        return front.value;
    }


    public boolean isEmpty(){

        return front == null;
    }

    @Override
    public String toString() {
        return "Queue{" +
                "front=" + this.front +
                ", Rear=" + this.rear +
                '}';
    }
}