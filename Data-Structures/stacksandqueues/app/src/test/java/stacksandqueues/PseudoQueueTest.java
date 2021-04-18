package stacksandqueues;
import org.junit.Test;
import static org.junit.Assert.*;

public class PseudoQueueTest {
    @Test public void testPseudoQueueEnqueue() {
        PseudoQueue classUnderTest = new PseudoQueue();
        classUnderTest.enqueue(1);
        assertEquals("enqueue into empty PseudoQueue", "PseudoQueue{stackQueue=Stack{top=Node{value=1, next=null}},stackHelper=Stack{top=null}}",classUnderTest.toString());
        assertEquals("enqueue into empty PseudoQueue top value", 1,classUnderTest.getStackQueue().getTop().value);

        classUnderTest.enqueue(2);
        assertEquals("enqueue into not empty PseudoQueue","PseudoQueue{stackQueue=Stack{top=Node{value=1, next=Node{value=2, next=null}}},stackHelper=Stack{top=null}}",classUnderTest.toString());
        assertEquals("enqueue into not empty PseudoQueue top value", 1,classUnderTest.getStackQueue().getTop().value);

    }

    @Test public void testPseudoQueueDequeue() {
        PseudoQueue classUnderTest = new PseudoQueue();
        classUnderTest.enqueue(1);
        classUnderTest.enqueue(2);
        classUnderTest.enqueue(3);
        assertEquals("Dequeue first item in a PseudoQueue", 1,classUnderTest.dequeue());
        assertEquals("PseudoQueue after PseudoQueue","PseudoQueue{stackQueue=Stack{top=Node{value=2, next=Node{value=3, next=null}}},stackHelper=Stack{top=null}}",classUnderTest.toString());
        assertEquals("dequeue mid item in a PseudoQueue",2,classUnderTest.dequeue());
        assertEquals("dequeue last item in a PseudoQueue",3,classUnderTest.dequeue());
    }



    @Test public void testPseudoQueueInstantiateEmptyPseudoQueue() {
        PseudoQueue classUnderTest = new PseudoQueue();
        assertEquals("Instantiate Empty Queue",true ,classUnderTest instanceof PseudoQueue);
    }

    @Test public void testPseudoQueuePopOrPeekEmptyPseudoQueue() {
        PseudoQueue classUnderTest = new PseudoQueue();
        assertEquals("Calling pop on empty queue raises exception","java.lang.NullPointerException" ,classUnderTest.dequeue().toString());
    }
}
