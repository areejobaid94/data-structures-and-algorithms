package stacksandqueues;

import java.util.ArrayList;

public class Queue <T>{
    public Node getFront() {
        return front;
    }

    public void setFront(Node front) {
        this.front = front;
    }

    public Node getRear() {
        return Rear;
    }

    public void setRear(Node rear) {
        Rear = rear;
    }

    public Node front;
    public Node Rear;

    public Queue(T value) {
        this.front = new Node(value);
        this.Rear = this.front;
    }

    public Queue() {
    }

    public void enqueue(T value){
        try {
            if (Rear == null){
                front = new Node(value);
                Rear = front;
            }else {
                this.Rear.next = new Node(value);
                this.Rear = this.Rear.next;
            }
        }catch (Exception ex){
            System.out.println(ex);
        }
    }

    public Object dequeue(){
        Node firstNode = front;
        try {
            if (isEmpty())
                return new NullPointerException();
            if(front == Rear){
                Rear = null;
            }
            front = front.next;
            firstNode.next = null;
        }catch (NullPointerException ex){
            System.out.println(ex);
        }
        return firstNode.value;
    }

    public Object peek(){
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

    public Object DuckDuckGoose(int n, Queue queue){
        Node current = queue.front;
        while (queue.front.next != null){
            int count = 1;
            while (count != n ){
                if(current == null)
                    current = queue.front;
                else
                    current = current.next;
                count++;
            }
            if(current == null)
                current = queue.front;
            if(current.next == null){
                queue.dequeue();
                current = queue.front;
            }else {
                current.next = current.next.next;
                if(current.next == null && queue.front != null){
                    queue.Rear = current;
                    current = queue.front;
                }else{
                    current = current.next;
                }
            }
        }
        return current.value;
    }
    @Override
    public String toString() {
        return "Queue{" +
                "front=" + front +
                ", Rear=" + Rear +
                '}';
    }
}
