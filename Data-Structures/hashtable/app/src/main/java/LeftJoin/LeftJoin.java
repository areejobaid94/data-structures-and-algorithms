package LeftJoin;

import hashtable.HashTableNode;
import hashtable.Hashtable;
import linkedList.LinkedList;
import linkedList.Node;

import java.util.ArrayList;
import java.util.HashMap;

public class LeftJoin {
    public static ArrayList leftJoin(HashMap leftHashtable, HashMap rightHashtable){
        ArrayList output = new ArrayList();
        leftHashtable.forEach((k, v) -> {
            ArrayList inOutput = new ArrayList();
            inOutput.add(k);
            inOutput.add(v);
            inOutput.add(rightHashtable.get(k));
            output.add(inOutput);
        });
        return output;
    }
}
