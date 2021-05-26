package graph;

public class Edge <T>{
    private Vertex vertex;
    private int weight;

    public Edge(Vertex vertex, int weight) {
        this.vertex = vertex;
        this.weight = weight;
    }

    public Edge(Vertex vertex) {
        this.vertex = vertex;
        this.weight = 0;
    }

    public Vertex getVertex() {
        return vertex;
    }

    public void setVertex(Vertex vertex) {
        this.vertex = vertex;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Edge{" +
                "vertex=" + vertex +
                ", weight=" + weight +
                '}';
    }
}
