package LeftJoin;

import hashtable.HashTableNode;
import hashtable.Hashtable;
import linkedList.LinkedList;
import linkedList.Node;

import java.util.ArrayList;

public class LeftJoin {
    public static ArrayList leftJoin(Hashtable leftHashtable,Hashtable rightHashtable){
        ArrayList output = new ArrayList();
        for(int i = 0 ; i < leftHashtable.getHashNodesList().length ;i++){
            if(leftHashtable.getHashNodesList()[i] != null){
                Node current =((LinkedList) leftHashtable.getHashNodesList()[i]).head;
                ArrayList inOutput = new ArrayList();
                while (current != null){
                    HashTableNode node =  ((HashTableNode) current.val);
                    inOutput = new ArrayList();
                    inOutput.add(node.getKey());
                    inOutput.add(node.getValue());
                    inOutput.add(rightHashtable.get(node.getKey()));
                    current = current.next;
                }
                output.add(inOutput);
            }
        }
        return output;
    }
}
