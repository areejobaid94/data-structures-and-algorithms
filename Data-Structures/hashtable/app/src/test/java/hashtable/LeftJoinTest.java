package hashtable;

import LeftJoin.LeftJoin;
import RepeatedWord.RepeatedWord;
import TreeIntersection.TreeIntersection;
import org.junit.Test;
import tree.BinaryTree;

import static org.junit.Assert.assertEquals;

public class LeftJoinTest {
    @Test
    public void testLeftJoinMethodForEmptyLeftHashTable(){
        Hashtable hashtableLeft = new Hashtable();
        Hashtable hashtableRight = new Hashtable();
        hashtableRight.add("areej",10);
        hashtableRight.add("areej1",20);
        hashtableRight.add("areej2",30);
        hashtableRight.add("areej6",30);

        assertEquals("Test LeftJoin Method For Empty LeftHashTable","[]", LeftJoin.leftJoin(hashtableLeft,hashtableRight).toString());
        assertEquals("Test LeftJoin Method For Empty LeftHashTable",0, LeftJoin.leftJoin(hashtableLeft,hashtableRight).size());
    }

    @Test
    public void testLeftJoinMethodForEmptyRightHashTable(){
        Hashtable hashtableLeft = new Hashtable();
        Hashtable hashtableRight = new Hashtable();
        hashtableLeft.add("areej",10);
        hashtableLeft.add("areej1",20);
        hashtableLeft.add("areej2",30);
        hashtableLeft.add("areej6",30);

        assertEquals("Test LeftJoin Method For Empty RightHashTable","[[areej6, 30, null], [areej1, 20, null], [areej, 10, null], [areej2, 30, null]]", LeftJoin.leftJoin(hashtableLeft,hashtableRight).toString());
        assertEquals("Test LeftJoin Method For Empty RightHashTable",4, LeftJoin.leftJoin(hashtableLeft,hashtableRight).size());
    }

    @Test
    public void testLeftJoinMethodForBothHashTableEmpty(){
        Hashtable hashtableLeft = new Hashtable();
        Hashtable hashtableRight = new Hashtable();

        assertEquals("Test LeftJoin Method For Both HashTables Empty","[]", LeftJoin.leftJoin(hashtableLeft,hashtableRight).toString());
        assertEquals("Test LeftJoin Method For Empty RightHashTable",0, LeftJoin.leftJoin(hashtableLeft,hashtableRight).size());
    }

    @Test
    public void testLeftJoinMethodForNoSharedValuesOfTheHashTables(){
        Hashtable hashtableLeft = new Hashtable();
        Hashtable hashtableRight = new Hashtable();
        hashtableLeft.add("areej",10);
        hashtableLeft.add("areej1",20);
        hashtableLeft.add("areej2",30);
        hashtableLeft.add("areej3",30);

        hashtableRight.add("areej10",1);
        hashtableRight.add("areej20",2);
        hashtableRight.add("areej30",3);
        hashtableRight.add("areej40",4);

        assertEquals("Test LeftJoin Method For No Shared Values Of The HashTables","[[areej1, 20, null], [areej3, 30, null], [areej, 10, null], [areej2, 30, null]]", LeftJoin.leftJoin(hashtableLeft,hashtableRight).toString());
        assertEquals("Test LeftJoin Method For No Shared Values Of The HashTables",4, LeftJoin.leftJoin(hashtableLeft,hashtableRight).size());
    }

    @Test
    public void testLeftJoinMethodWithAllSharedValues(){
        Hashtable hashtableLeft = new Hashtable();
        Hashtable hashtableRight = new Hashtable();
        hashtableLeft.add("areej",10);
        hashtableLeft.add("areej1",20);
        hashtableLeft.add("areej2",30);
        hashtableLeft.add("areej3",30);

        hashtableRight.add("areej",1);
        hashtableRight.add("areej1",2);
        hashtableRight.add("areej2",3);
        hashtableRight.add("areej3",4);

        assertEquals("Test LeftJoin Method With All Shared Values","[[areej1, 20, 2], [areej3, 30, 4], [areej, 10, 1], [areej2, 30, 3]]", LeftJoin.leftJoin(hashtableLeft,hashtableRight).toString());
        assertEquals("Test LeftJoin Method With All Shared Values",4, LeftJoin.leftJoin(hashtableLeft,hashtableRight).size());
    }

    @Test
    public void testLeftJoinMethodWithNotAllSharedValues(){
        Hashtable hashtableLeft = new Hashtable();
        Hashtable hashtableRight = new Hashtable();
        hashtableLeft.add("areej",10);
        hashtableLeft.add("areej1",20);
        hashtableLeft.add("areej2",30);
        hashtableLeft.add("areej3",30);

        hashtableRight.add("areej",1);
        hashtableRight.add("areej1",2);
        hashtableRight.add("areej2",3);
        hashtableRight.add("areej4",4);

        assertEquals("Test LeftJoin Method With Not All Shared Values","[[areej1, 20, 2], [areej3, 30, null], [areej, 10, 1], [areej2, 30, 3]]", LeftJoin.leftJoin(hashtableLeft,hashtableRight).toString());
        assertEquals("Test LeftJoin Method With Not All Shared Values",4, LeftJoin.leftJoin(hashtableLeft,hashtableRight).size());
    }
}
