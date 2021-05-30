package LeftJoin;

import hashtable.HashTableNode;
import hashtable.Hashtable;
import linkedList.LinkedList;
import linkedList.Node;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;

public class JoinStretchGoals {
    public static ArrayList join(HashMap leftHashtable, HashMap rightHashtable, String typeOfJoin){
        ArrayList output = new ArrayList();
        if(typeOfJoin.toLowerCase() == "r" || typeOfJoin.toLowerCase() == "right"){
            output = LeftJoin.leftJoin(rightHashtable, leftHashtable);
        }else if(typeOfJoin.toLowerCase() == "l" || typeOfJoin.toLowerCase() == "left"){
            output = LeftJoin.leftJoin(leftHashtable, rightHashtable);
        }else {
            output.add("UNKNOWN TYPE OF JOIN");
        }
        return output;
    }
}
