package hashtable;


import LeftJoin.LeftJoin;
import RepeatedWord.RepeatedWord;
import TreeIntersection.TreeIntersection;
import org.junit.Test;
import tree.BinaryTree;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;

public class LeftJoinTest {
    @Test
    public void testLeftJoinMethodForEmptyLeftHashTable(){
        HashMap hashtableLeft = new HashMap();
        HashMap hashtableRight = new HashMap();
        hashtableRight.put("areej",10);
        hashtableRight.put("areej1",20);
        hashtableRight.put("areej2",30);
        hashtableRight.put("areej6",30);


        assertEquals("Test LeftJoin Method For Empty LeftHashTable","[]", LeftJoin.leftJoin(hashtableLeft,hashtableRight).toString());
        assertEquals("Test LeftJoin Method For Empty LeftHashTable",0, LeftJoin.leftJoin(hashtableLeft,hashtableRight).size());
    }

    @Test
    public void testLeftJoinMethodForEmptyRightHashTable(){
        HashMap hashtableLeft = new HashMap();
        HashMap hashtableRight = new HashMap();
        hashtableLeft.put("areej",10);
        hashtableLeft.put("areej1",20);
        hashtableLeft.put("areej2",30);
        hashtableLeft.put("areej6",30);

        assertEquals("Test LeftJoin Method For Empty RightHashTable","[[areej2, 30, null], [areej1, 20, null], [areej, 10, null], [areej6, 30, null]]", LeftJoin.leftJoin(hashtableLeft,hashtableRight).toString());
        assertEquals("Test LeftJoin Method For Empty RightHashTable",4, LeftJoin.leftJoin(hashtableLeft,hashtableRight).size());
    }

    @Test
    public void testLeftJoinMethodForBothHashTableEmpty(){
        HashMap hashtableLeft = new HashMap();
        HashMap hashtableRight = new HashMap();

        assertEquals("Test LeftJoin Method For Both HashTables Empty","[]", LeftJoin.leftJoin(hashtableLeft,hashtableRight).toString());
        assertEquals("Test LeftJoin Method For Empty RightHashTable",0, LeftJoin.leftJoin(hashtableLeft,hashtableRight).size());
    }

    @Test
    public void testLeftJoinMethodForNoSharedValuesOfTheHashTables(){
        HashMap hashtableLeft = new HashMap();
        HashMap hashtableRight = new HashMap();
        hashtableLeft.put("areej",10);
        hashtableLeft.put("areej1",20);
        hashtableLeft.put("areej2",30);
        hashtableLeft.put("areej3",30);

        hashtableRight.put("areej10",1);
        hashtableRight.put("areej20",2);
        hashtableRight.put("areej30",3);
        hashtableRight.put("areej40",4);

        assertEquals("Test LeftJoin Method For No Shared Values Of The HashTables","[[areej3, 30, null], [areej2, 30, null], [areej1, 20, null], [areej, 10, null]]", LeftJoin.leftJoin(hashtableLeft,hashtableRight).toString());
        assertEquals("Test LeftJoin Method For No Shared Values Of The HashTables",4, LeftJoin.leftJoin(hashtableLeft,hashtableRight).size());
    }

    @Test
    public void testLeftJoinMethodWithAllSharedValues(){
        HashMap hashtableLeft = new HashMap();
        HashMap hashtableRight = new HashMap();
        hashtableLeft.put("areej",10);
        hashtableLeft.put("areej1",20);
        hashtableLeft.put("areej2",30);
        hashtableLeft.put("areej3",30);

        hashtableRight.put("areej",1);
        hashtableRight.put("areej1",2);
        hashtableRight.put("areej2",3);
        hashtableRight.put("areej3",4);

        assertEquals("Test LeftJoin Method With All Shared Values","[[areej3, 30, 4], [areej2, 30, 3], [areej1, 20, 2], [areej, 10, 1]]", LeftJoin.leftJoin(hashtableLeft,hashtableRight).toString());
        assertEquals("Test LeftJoin Method With All Shared Values",4, LeftJoin.leftJoin(hashtableLeft,hashtableRight).size());
    }

    @Test
    public void testLeftJoinMethodWithNotAllSharedValues(){
        HashMap hashtableLeft = new HashMap();
        HashMap hashtableRight = new HashMap();
        hashtableLeft.put("areej",10);
        hashtableLeft.put("areej1",20);
        hashtableLeft.put("areej2",30);
        hashtableLeft.put("areej3",30);

        hashtableRight.put("areej",1);
        hashtableRight.put("areej1",2);
        hashtableRight.put("areej2",3);
        hashtableRight.put("areej4",4);

        assertEquals("Test LeftJoin Method With Not All Shared Values","[[areej3, 30, null], [areej2, 30, 3], [areej1, 20, 2], [areej, 10, 1]]", LeftJoin.leftJoin(hashtableLeft,hashtableRight).toString());
        assertEquals("Test LeftJoin Method With Not All Shared Values",4, LeftJoin.leftJoin(hashtableLeft,hashtableRight).size());
    }
}