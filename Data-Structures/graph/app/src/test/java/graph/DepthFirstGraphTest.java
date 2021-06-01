package graph;

import BreadthFirst.BreadthFirst;
import DepthFirst.DepthFirst;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DepthFirstGraphTest {
    @Test
    public void oneItemGraph(){
        Graph graph = new Graph();
        Vertex vertex = new Vertex(1);
        graph.addNode(vertex);
        assertEquals("[1]", DepthFirst.depthFirstGraph(graph,vertex).toString());
    }

    @Test
    public void multipleItemsWithSharedEdges(){
        Graph graph = new Graph();
        Vertex Pandora = new Vertex("Pandora");
        graph.addNode(Pandora);
        Vertex Arendelle = new Vertex("Arendelle");
        graph.addNode(Arendelle);
        Vertex Metroville = new Vertex("Metroville");
        graph.addNode(Metroville);
        Vertex Monstroplolis = new Vertex("Monstroplolis");
        graph.addNode(Monstroplolis);
        Vertex Narnia = new Vertex("Narnia");
        graph.addNode(Narnia);
        Vertex Naboo = new Vertex("Naboo");
        graph.addNode(Naboo);

        graph.addEdge(Pandora,Arendelle,0);
        graph.addEdge(Arendelle,Metroville,0);
        graph.addEdge(Arendelle,Monstroplolis,0);
        graph.addEdge(Metroville,Monstroplolis,0);
        graph.addEdge(Metroville,Narnia,0);
        graph.addEdge(Metroville,Naboo,0);
        graph.addEdge(Monstroplolis,Naboo,0);
        graph.addEdge(Narnia,Naboo,0);

        assertEquals("[Pandora, Arendelle, Monstroplolis, Naboo, Metroville, Narnia]",DepthFirst.depthFirstGraph(graph,Pandora).toString());
        assertEquals("Pandora",DepthFirst.depthFirstGraph(graph,Pandora).get(0));
        assertEquals("Arendelle",DepthFirst.depthFirstGraph(graph,Pandora).get(1));
        assertEquals("Monstroplolis",DepthFirst.depthFirstGraph(graph,Pandora).get(2));
    }

    @Test
    public void multipleItemsWithNoSharedEdges(){
        BreadthFirst graph = new BreadthFirst();
        Vertex Pandora = new Vertex("Pandora");
        graph.addNode(Pandora);
        Vertex Arendelle = new Vertex("Arendelle");
        graph.addNode(Arendelle);
        Vertex Metroville = new Vertex("Metroville");
        graph.addNode(Metroville);
        Vertex Monstroplolis = new Vertex("Monstroplolis");
        graph.addNode(Monstroplolis);

        graph.addEdge(Pandora,Arendelle,0);
        graph.addEdge(Arendelle,Metroville,0);
        graph.addEdge(Metroville,Monstroplolis,0);

        assertEquals("[Pandora, Arendelle, Metroville, Monstroplolis]",DepthFirst.depthFirstGraph(graph,Pandora).toString());
        assertEquals("Pandora",DepthFirst.depthFirstGraph(graph,Pandora).get(0));
        assertEquals("Arendelle",DepthFirst.depthFirstGraph(graph,Pandora).get(1));
        assertEquals("Metroville",DepthFirst.depthFirstGraph(graph,Pandora).get(2));
    }
}
