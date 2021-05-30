package BreadthFirst;

import graph.Edge;
import graph.Graph;
import graph.Vertex;
import linkedList.Node;
import queue.NodeQueue;
import queue.Queue;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class BreadthFirst extends  Graph{
    public  ArrayList breadthFirstMethod (Vertex vertex){
        ArrayList nodes = new ArrayList<>();
        Queue breadth = new Queue();
        Set visited = new HashSet();

        breadth.enqueue(vertex);
        visited.add(vertex);
        while (!breadth.isEmpty()) {
            Vertex front = (Vertex) ((NodeQueue) breadth.dequeue()).getValue();
            nodes.add(front.getValue());
            Node child = this.getNeighbors(front).head;
            while (child != null){
                Vertex currentVertex = ((Edge) child.val).getVertex();
                if (!visited.contains(currentVertex)) {
                    visited.add(currentVertex);
                    breadth.enqueue(currentVertex);
                }
                child =child.next;
            }
        }
        return nodes;

    }
}
