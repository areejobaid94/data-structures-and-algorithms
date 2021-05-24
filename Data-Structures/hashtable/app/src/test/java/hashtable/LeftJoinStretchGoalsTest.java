package hashtable;

import LeftJoin.JoinStretchGoals;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LeftJoinStretchGoalsTest {
    @Test
    public void testJoinHashTablesAsALeftJoin(){
        Hashtable hashtableLeft = new Hashtable();
        Hashtable hashtableRight = new Hashtable();

        hashtableLeft.add("areej",10);
        hashtableLeft.add("areej1",20);
        hashtableLeft.add("areej2",30);
        hashtableLeft.add("areej6",30);

        hashtableRight.add("areej6",40);

        assertEquals("test Join HashTables As A LeftJoin","[[areej6, 30, 40], [areej1, 20, null], [areej, 10, null], [areej2, 30, null]]", JoinStretchGoals.join(hashtableLeft,hashtableRight,"l").toString());
    }

    @Test
    public void testJoinHashTablesAsARightJoin(){
        Hashtable hashtableLeft = new Hashtable();
        Hashtable hashtableRight = new Hashtable();

        hashtableLeft.add("areej",10);
        hashtableLeft.add("areej1",20);
        hashtableLeft.add("areej2",30);
        hashtableLeft.add("areej6",30);

        hashtableRight.add("areej6",40);

        assertEquals("test Join HashTables As A LeftJoin","[[areej6, 40, 30]]", JoinStretchGoals.join(hashtableLeft,hashtableRight,"r").toString());
    }

    @Test
    public void testJoinHashTablesAsAUnKnownJoin(){
        Hashtable hashtableLeft = new Hashtable();
        Hashtable hashtableRight = new Hashtable();

        hashtableLeft.add("areej",10);
        hashtableLeft.add("areej1",20);
        hashtableLeft.add("areej2",30);
        hashtableLeft.add("areej6",30);

        hashtableRight.add("areej6",40);

        assertEquals("test Join HashTables As A LeftJoin","[UNKNOWN TYPE OF JOIN]", JoinStretchGoals.join(hashtableLeft,hashtableRight,"p").toString());
    }
}
