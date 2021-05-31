package getEdge;

import graph.Edge;
import graph.Graph;
import graph.Vertex;
import linkedList.LinkedList;
import linkedList.Node;

import java.util.ArrayList;
import java.util.Map;

public class GetEdge extends Graph {
    private static ArrayList visited = new ArrayList();
    public static String checkFullTripPossibility(Graph plan, ArrayList<String> trip){
        visited = new ArrayList();
        if (trip.size() < 2 )return "Wrong Input for trip";
        int sumWeight = 0;
        for(int i = 0 ; i < trip.size() -1 ; i++){
            ArrayList checkIfNeighbor = checkIfNeighbor(plan,trip.get(i),trip.get(i+1));
            if((int)checkIfNeighbor.get(0) != 1 )return "False, 0$";
            sumWeight = sumWeight +(int) checkIfNeighbor.get(1);
        }
        return "True," +" "+ sumWeight +"$";
    }
    public static ArrayList<Integer> checkIfNeighbor(Graph plan,String start,String end){
        ArrayList<Integer> outputArray = new ArrayList();
        outputArray.add(0);
        outputArray.add(0);
        for (Map.Entry<Vertex, LinkedList> item : plan.getSetOfVertexEdges().entrySet()) {
            if(item.getKey().getValue() == start){
                Node current = item.getValue().head;
                checkValue(current,outputArray,end);
            }else if(item.getKey().getValue() == end){
                Node current = plan.getNeighbors(item.getKey()).head;
                checkValue(current,outputArray,start);
            }
        }
        return outputArray;
    }

    private static void checkValue(Node current,ArrayList<Integer> outputArray, String value){
        while(outputArray.get(0) == 0 && current != null){
            if(((Edge)current.val).getVertex().getValue() == value){
                outputArray.set(0,1);
                outputArray.set(1,outputArray.get(1)+((Edge)current.val).getWeight());
            }
            current = current.next;
        }

    }
}
