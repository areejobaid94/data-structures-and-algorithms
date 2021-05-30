package graph;

public class Vertex <T>{
    private T value;

    public Vertex(T value) {
        this.value = value;
    }

    public Vertex() {
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Vertex{" +
                "value=" + value +
                '}';
    }
}
