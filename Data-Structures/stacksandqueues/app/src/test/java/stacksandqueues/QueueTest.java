package stacksandqueues;
import org.junit.Test;
import static org.junit.Assert.*;
public class QueueTest {
    @Test public void testQueueEnqueue() {
        Queue classUnderTest = new Queue();
        classUnderTest.enqueue(1);
        assertEquals("enqueue into a queue", "Queue{front=Node{value=1, next=null}, Rear=Node{value=1, next=null}}",classUnderTest.toString());
        classUnderTest.enqueue(2);
        assertEquals("enqueue into a queue", "Queue{front=Node{value=1, next=Node{value=2, next=null}}, Rear=Node{value=2, next=null}}",classUnderTest.toString());
    }

    @Test public void testQueueDequeue() {
        Queue classUnderTest = new Queue();
        classUnderTest.enqueue(1);
        classUnderTest.enqueue(2);
        assertEquals("Dequeue first item in a queue", 1,classUnderTest.dequeue());
        assertEquals("Queue after dequeue","Queue{front=Node{value=2, next=null}, Rear=Node{value=2, next=null}}",classUnderTest.toString());
        assertEquals("dequeue last item in a queue",2,classUnderTest.dequeue());
    }

    @Test public void testQueuePeek() {
        Queue classUnderTest = new Queue();
        classUnderTest.enqueue(1);
        classUnderTest.enqueue(2);
        assertEquals("Peek first item in a queue", 1,classUnderTest.peek());
    }

    @Test public void testQueueIsEmpty() {
        Queue classUnderTest = new Queue();
        assertEquals("Test empty queue using isEmpty", true,classUnderTest.isEmpty());
        classUnderTest.enqueue(1);
        assertEquals("Test not empty queue using isEmpty", false,classUnderTest.isEmpty());
    }

    @Test public void testQueueInstantiateEmptyQueue() {
        Queue classUnderTest = new Queue();
        assertEquals("Instantiate Empty Queue",true ,classUnderTest instanceof Queue);
    }

    @Test public void testQueuePopOrPeekEmptyQueue() {
        Queue classUnderTest = new Queue();
        assertEquals("Calling pop on empty queue raises exception","java.lang.NullPointerException" ,classUnderTest.dequeue().toString());
        assertEquals("Calling peek on empty queue raises exception","java.lang.NullPointerException" ,classUnderTest.peek().toString());
    }
}
