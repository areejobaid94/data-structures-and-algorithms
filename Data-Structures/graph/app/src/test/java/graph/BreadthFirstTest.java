package graph;

import BreadthFirst.BreadthFirst;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BreadthFirstTest {
    @Test
    public void oneItemGraph(){
        BreadthFirst graph = new BreadthFirst();
        Vertex vertex = new Vertex(1);
        graph.addNode(vertex);
        assertEquals("[1]",graph.breadthFirstMethod(vertex).toString());
    }

    @Test
    public void multipleItemsWithSharedEdges(){
        BreadthFirst graph = new BreadthFirst();
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

        assertEquals("[Pandora, Arendelle, Monstroplolis, Metroville, Naboo, Narnia]",graph.breadthFirstMethod(Pandora).toString());
        assertEquals("Pandora",graph.breadthFirstMethod(Pandora).get(0));
        assertEquals("Arendelle",graph.breadthFirstMethod(Pandora).get(1));
        assertEquals("Monstroplolis",graph.breadthFirstMethod(Pandora).get(2));
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

        assertEquals("[Pandora, Arendelle, Metroville, Monstroplolis]",graph.breadthFirstMethod(Pandora).toString());
        assertEquals("Pandora",graph.breadthFirstMethod(Pandora).get(0));
        assertEquals("Arendelle",graph.breadthFirstMethod(Pandora).get(1));
        assertEquals("Metroville",graph.breadthFirstMethod(Pandora).get(2));
    }
}
