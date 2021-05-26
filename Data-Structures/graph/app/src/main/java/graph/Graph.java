package graph;

import linkedList.LinkedList;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Graph {
    private HashMap<Vertex, LinkedList> setOfVertexEdges;
    private int size;

    public Graph() {
        this.setOfVertexEdges =  new HashMap<Vertex, LinkedList>();
        this.size = 0;
    }

    public Vertex addNode(Vertex node){
        this.setOfVertexEdges.put(node, new LinkedList());
        this.size ++;
        return node;
    }

    public void addEdge(Vertex startVertex, Vertex endVertex, int weight){
        if(this.setOfVertexEdges.get(startVertex) != null || this.setOfVertexEdges.get(endVertex) != null ){
            LinkedList startEdges = this.setOfVertexEdges.get(startVertex);
            startEdges.insert(new Edge(endVertex,weight));
        }
    }

    public void addEdge(Vertex startVertex, Vertex endVertex){
        if(this.setOfVertexEdges.get(startVertex) != null || this.setOfVertexEdges.get(endVertex) != null ){
            LinkedList startEdges = this.setOfVertexEdges.get(startVertex);
            startEdges.insert(new Edge(endVertex,0));
        }
    }

    public Set getNodes(){
        Set vertices = new HashSet<Vertex>();
        for (Vertex vertex : setOfVertexEdges.keySet())
            vertices.add(vertex);
        return vertices.size() != 0 ? vertices: null;
    }


    public LinkedList getNeighbors(Vertex vertex){
        if(setOfVertexEdges.get(vertex) != null){
            return  setOfVertexEdges.get(vertex);
        }
        return null;
    }

    public int size(){
        return this.size;
    }

    public HashMap<Vertex, LinkedList> getSetOfVertexEdges() {
        return setOfVertexEdges;
    }
}