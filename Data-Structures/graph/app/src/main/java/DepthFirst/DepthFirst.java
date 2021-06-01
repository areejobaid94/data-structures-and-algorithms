package DepthFirst;

import com.google.common.collect.Multiset;
import graph.Edge;
import graph.Graph;
import graph.Vertex;
import linkedList.Node;
import linkedList.LinkedList;

import javax.swing.text.html.parser.Entity;
import java.util.*;

public class DepthFirst extends Graph {
    private static ArrayList  output = new ArrayList();
    public static ArrayList depthFirstGraph(Graph graph,Vertex startVertex){
        output = new ArrayList();
        MyEntry entry = new MyEntry(startVertex,graph.getSetOfVertexEdges().get(startVertex));
        depth(entry, graph.getSetOfVertexEdges());
        return output;
    }
    public static void depth (Map.Entry entry , HashMap graph){
        if(output.contains(((Vertex)entry.getKey()).getValue()))return;
        output.add(((Vertex)entry.getKey()).getValue());
        Node current = ((LinkedList) entry.getValue()).head;
        while (current != null){
            entry = new MyEntry(((Edge)current.val).getVertex(),graph.get(((Edge)current.val).getVertex()));
            depth(entry,graph);
            current = current.next;
        }
    };

    final static class MyEntry<K, V> implements Map.Entry<K, V> {
        private final K key;
        private V value;

        public MyEntry(K key, V value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public K getKey() {
            return key;
        }

        @Override
        public V getValue() {
            return value;
        }

        @Override
        public V setValue(V value) {
            V old = this.value;
            this.value = value;
            return old;
        }
    }
}
