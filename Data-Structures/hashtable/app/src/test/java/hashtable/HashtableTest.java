package hashtable;
import org.junit.Test;
import static org.junit.Assert.*;

public class HashtableTest {
    @Test public void testHashTable(){
        Hashtable claasUnderTest= new Hashtable();
        assertEquals(true,claasUnderTest instanceof Hashtable);
    }

    @Test public void testGetHashOfString(){
        Hashtable claasUnderTest= new Hashtable();
        assertEquals(609,claasUnderTest.hash("areej"));
    }

    @Test public void testGetHashOfInt(){
        Hashtable claasUnderTest= new Hashtable();
        assertEquals(839,claasUnderTest.hash(100));
    }

    @Test public void testAddFirstTimeToIndex() {
        Hashtable claasUnderTest = new Hashtable();
        claasUnderTest.add("areej", "hello");
        assertEquals("{Node{key=areej, value=hello}}->Null", claasUnderTest.getHashNodesList()[609].toString());
    }

    @Test public void testAdd2valueToTheSameIndex() {
        Hashtable claasUnderTest = new Hashtable();
        claasUnderTest.add("areej", "hello");
        assertEquals("{Node{key=areej, value=hello}}->Null", claasUnderTest.getHashNodesList()[609].toString());
        claasUnderTest.add("jeera", "hi");
        assertEquals("{Node{key=jeera, value=hi}}->{Node{key=areej, value=hello}}->Null", claasUnderTest.getHashNodesList()[609].toString());
    }
    @Test public void testGetOneItemInIndex(){
        Hashtable claasUnderTest= new Hashtable();
        claasUnderTest.add("areej","hello");
        assertEquals("hello", claasUnderTest.get("areej"));
    }
    @Test public void testGetTwoItemInIndex(){
        Hashtable claasUnderTest= new Hashtable();
        claasUnderTest.add("jeera","hi");
        claasUnderTest.add("areej","hello");
        assertEquals("hello", claasUnderTest.get("areej"));
        assertEquals("hi", claasUnderTest.get("jeera"));
        assertEquals("{Node{key=areej, value=hello}}->{Node{key=jeera, value=hi}}->Null", claasUnderTest.getHashNodesList()[609].toString());
    }

    @Test public void testContains(){
        Hashtable claasUnderTest= new Hashtable();
        claasUnderTest.add("areej","hello");
        assertTrue( claasUnderTest.contains("areej"));
        assertFalse( claasUnderTest.contains("hello"));
    }
}
