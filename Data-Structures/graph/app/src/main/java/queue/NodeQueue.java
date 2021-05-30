package queue;

public class NodeQueue<T>{

    T value;
    NodeQueue next;


    NodeQueue(T value){

        this.value = value;
    }

    public T getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                ", next=" + next +
                '}';
    }
}