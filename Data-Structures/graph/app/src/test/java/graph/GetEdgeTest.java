package graph;

import getEdge.GetEdge;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;

public class GetEdgeTest {
    @Test
    public void getEdgeTestOneTrip(){
        Vertex Pandora = new Vertex("Pandora");
        Vertex Arendelle = new Vertex("Arendelle");
        Vertex Metroville = new Vertex("Metroville");
        Vertex Monstroplolis = new Vertex("Monstroplolis");
        Vertex Narnia = new Vertex("Narnia");
        Vertex Naboo = new Vertex("Naboo");

        GetEdge getEdge = new GetEdge();
        getEdge.addNode(Pandora);
        getEdge.addNode(Arendelle);
        getEdge.addNode(Metroville);
        getEdge.addNode(Monstroplolis);
        getEdge.addNode(Narnia);
        getEdge.addNode(Naboo);

        getEdge.addEdge(Pandora,Arendelle,150);
        getEdge.addEdge(Pandora,Metroville,82);
        getEdge.addEdge(Arendelle,Metroville,99);
        ArrayList trip = new ArrayList();
        trip.add("Pandora");

        assertEquals("Wrong Input for trip",GetEdge.checkFullTripPossibility(getEdge,trip));
    }

    @Test
    public void getEdgeTestFullTripPossible(){
        Vertex Pandora = new Vertex("Pandora");
        Vertex Arendelle = new Vertex("Arendelle");
        Vertex Metroville = new Vertex("Metroville");
        Vertex Monstroplolis = new Vertex("Monstroplolis");
        Vertex Narnia = new Vertex("Narnia");
        Vertex Naboo = new Vertex("Naboo");

        GetEdge getEdge = new GetEdge();
        getEdge.addNode(Pandora);
        getEdge.addNode(Arendelle);
        getEdge.addNode(Metroville);
        getEdge.addNode(Monstroplolis);
        getEdge.addNode(Narnia);
        getEdge.addNode(Naboo);

        getEdge.addEdge(Pandora,Arendelle,150);
        getEdge.addEdge(Pandora,Metroville,82);
        getEdge.addEdge(Arendelle,Metroville,99);
        ArrayList trip = new ArrayList();
        trip.add("Pandora");
        trip.add("Metroville");
        trip.add("Arendelle");
        assertEquals("True, 181$",GetEdge.checkFullTripPossibility(getEdge,trip));
    }


    @Test
    public void getEdgeTestFullTripNotPossible(){
        Vertex Pandora = new Vertex("Pandora");
        Vertex Arendelle = new Vertex("Arendelle");
        Vertex Metroville = new Vertex("Metroville");
        Vertex Monstroplolis = new Vertex("Monstroplolis");
        Vertex Narnia = new Vertex("Narnia");
        Vertex Naboo = new Vertex("Naboo");

        GetEdge getEdge = new GetEdge();
        getEdge.addNode(Pandora);
        getEdge.addNode(Arendelle);
        getEdge.addNode(Metroville);
        getEdge.addNode(Monstroplolis);
        getEdge.addNode(Narnia);
        getEdge.addNode(Naboo);

        getEdge.addEdge(Pandora,Arendelle,150);
        getEdge.addEdge(Pandora,Metroville,82);
        getEdge.addEdge(Arendelle,Metroville,99);
        ArrayList trip = new ArrayList();
        trip.add("Pandora");
        trip.add("Metroville");
        trip.add("Naboo");
        assertEquals("False, 0$",GetEdge.checkFullTripPossibility(getEdge,trip));
    }
}
