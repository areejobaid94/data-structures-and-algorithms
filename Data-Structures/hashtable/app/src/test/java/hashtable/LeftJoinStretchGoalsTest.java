package hashtable;

import LeftJoin.JoinStretchGoals;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;

public class LeftJoinStretchGoalsTest {
    @Test
    public void testJoinHashTablesAsALeftJoin(){
        HashMap hashtableLeft = new HashMap();
        HashMap hashtableRight = new HashMap();

        hashtableLeft.put("areej",10);
        hashtableLeft.put("areej1",20);
        hashtableLeft.put("areej2",30);
        hashtableLeft.put("areej6",30);

        hashtableRight.put("areej6",40);

        assertEquals("test Join HashTables As A LeftJoin","[[areej2, 30, null], [areej1, 20, null], [areej, 10, null], [areej6, 30, 40]]", JoinStretchGoals.join(hashtableLeft,hashtableRight,"l").toString());
    }

    @Test
    public void testJoinHashTablesAsARightJoin(){
        HashMap hashtableLeft = new HashMap();
        HashMap hashtableRight = new HashMap();

        hashtableLeft.put("areej",10);
        hashtableLeft.put("areej1",20);
        hashtableLeft.put("areej2",30);
        hashtableLeft.put("areej6",30);

        hashtableRight.put("areej6",40);

        assertEquals("test Join HashTables As A LeftJoin","[[areej6, 40, 30]]", JoinStretchGoals.join(hashtableLeft,hashtableRight,"r").toString());
    }

    @Test
    public void testJoinHashTablesAsAUnKnownJoin(){
        HashMap hashtableLeft = new HashMap();
        HashMap hashtableRight = new HashMap();

        hashtableLeft.put("areej",10);
        hashtableLeft.put("areej1",20);
        hashtableLeft.put("areej2",30);
        hashtableLeft.put("areej6",30);

        hashtableRight.put("areej6",40);

        assertEquals("test Join HashTables As A LeftJoin","[UNKNOWN TYPE OF JOIN]", JoinStretchGoals.join(hashtableLeft,hashtableRight,"p").toString());
    }
}
