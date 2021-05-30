package graph;

import org.junit.Test;
import static org.junit.Assert.*;

public class graphTest {
    @Test public void addNodeSuccessfullyToGraph(){
        Graph graph = new Graph();
        Vertex vertex = new Vertex(1);
        Vertex outputAdd = graph.addNode(vertex);
        assertEquals(1,graph.addNode(vertex).getValue());
        assertEquals("Test get the vertex after adding in graph","{Vertex{value=1}=LinkedList{head=null}}",graph.getSetOfVertexEdges().toString());
    }

    @Test public void addEdgesSuccessfullyToGraph(){
        Graph graph = new Graph();
        Vertex startVertex = new Vertex(1);
        Vertex endVertex = new Vertex(2);
        graph.addNode(startVertex);
        graph.addNode(endVertex);
        graph.addEdge(startVertex,endVertex,4);
        assertEquals("Test get the new edge for startVertex after adding in graph","LinkedList{head=Node{val=Edge{vertex=Vertex{value=2}, weight=4}, next=null}}",graph.getSetOfVertexEdges().get(startVertex).toString());
    }

    @Test public void getAllNodesSuccessfullyFromGraph(){
        Graph graph = new Graph();
        Vertex startVertex = new Vertex(1);
        Vertex endVertex = new Vertex(2);
        graph.addNode(startVertex);
        graph.addNode(endVertex);
        assertEquals("[Vertex{value=1}, Vertex{value=2}]",graph.getNodes().toString());
    }

    @Test public void  getAllNeighborsSuccessfullyFromGraph(){
        Graph graph = new Graph();
        Vertex startVertex = new Vertex(1);
        Vertex endVertex = new Vertex(2);
        graph.addNode(startVertex);
        graph.addNode(endVertex);
        graph.addEdge(startVertex,endVertex,5);
        assertEquals("LinkedList{head=Node{val=Edge{vertex=Vertex{value=2}, weight=5}, next=null}}",graph.getNeighbors(startVertex).toString());
    }

    @Test public void neighborsWeightFromEdges(){
        Graph graph = new Graph();
        Vertex startVertex = new Vertex(1);
        Vertex endVertex = new Vertex(2);
        graph.addNode(startVertex);
        graph.addNode(endVertex);
        graph.addEdge(startVertex,endVertex,5);
        assertEquals(5,((Edge)graph.getNeighbors(startVertex).head.val).getWeight());
    }

    @Test public void getSizeOfTheGraph(){
        Graph graph = new Graph();
        Vertex startVertex = new Vertex(3);
        Vertex endVertex = new Vertex(4);
        graph.addNode(startVertex);
        graph.addNode(endVertex);
        assertEquals(2,graph.size());
    }

    @Test public void checkGraphWithOneNode(){
        Graph graph = new Graph();
        Vertex startVertex = new Vertex(3);
        graph.addNode(startVertex);
        assertEquals("One Node can be returned","[Vertex{value=3}]",graph.getNodes().toString());
    }

    @Test public void getNullWhenEmptyNode(){
        Graph graph = new Graph();
        assertNull(graph.getNodes());
    }
}