package stacksandqueues;
import org.junit.Test;
import static org.junit.Assert.*;

public class StackTest {
    @Test public void testStackPush() {
        Stack classUnderTest = new Stack();
        classUnderTest.push(1);
        assertEquals("Stack after push value","Stack{top=Node{value=1, next=null}}" ,classUnderTest.toString());
        classUnderTest.push(2);
        assertEquals("Stack after push value","Stack{top=Node{value=2, next=Node{value=1, next=null}}}" ,classUnderTest.toString());
    }

    @Test public void testStackPop() {
        Stack classUnderTest = new Stack();
        classUnderTest.push(1);
        classUnderTest.push(2);
        assertEquals("Stack pop last node",2 ,classUnderTest.pop());
        assertEquals("Stack after pop the last node","Stack{top=Node{value=1, next=null}}" ,classUnderTest.toString());
        assertEquals("Stack pop last node",1 ,classUnderTest.pop());
        assertEquals("empty a stack after multiple pops","Stack{top=null}" ,classUnderTest.toString());
        assertEquals("Stack pop Empty Stack","java.lang.NullPointerException" ,classUnderTest.pop().toString());
    }


    @Test public void testStackPeek() {
        Stack classUnderTest = new Stack(1);
        assertEquals("Stack peek last node value",1 ,classUnderTest.peek());
    }

    @Test public void testStackInstantiateEmptyStack() {
        Stack classUnderTest = new Stack();
        assertEquals("Instantiate Empty Stack",true ,classUnderTest instanceof Stack);
    }

    @Test public void testStackPopOrPeekEmptyStack() {
        Stack classUnderTest = new Stack();
        assertEquals("Calling pop on empty stack raises exception","java.lang.NullPointerException" ,classUnderTest.pop().toString());
        assertEquals("Calling peek on empty stack raises exception","java.lang.NullPointerException" ,classUnderTest.peek().toString());
    }
}
