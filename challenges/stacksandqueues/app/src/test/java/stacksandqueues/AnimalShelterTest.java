package stacksandqueues;
import org.junit.Test;
import utilities.AnimalShelter;
import utilities.Models.Cat;
import utilities.Models.Dog;

import static org.junit.Assert.*;

public class AnimalShelterTest {
    @Test public void testAnimalShelterEnqueue() {
        AnimalShelter classUnderTest = new AnimalShelter();
        Cat cat = new Cat("Mew",2.4,"anything","anything");
        Cat cat1 = new Cat("anything",2.5,"anything","anything");
        Dog dog = new Dog("anything",2.5,"anything","anything");
        classUnderTest.enqueue(cat);
        assertEquals("enqueue cat in empty AnimalShelte","Animal Shelter => { cats = Queue{front=Node{value=Cat: {name='Mew', age=2.4, species='anything', color='anything'}, next=null}, Rear=Node{value=Cat: {name='Mew', age=2.4, species='anything', color='anything'}, next=null}} , dogs = Queue{front=null, Rear=null} }",classUnderTest.toString());
        assertEquals("cat queue after adding","Queue{front=Node{value=Cat: {name='Mew', age=2.4, species='anything', color='anything'}, next=null}, Rear=Node{value=Cat: {name='Mew', age=2.4, species='anything', color='anything'}, next=null}}" ,classUnderTest.getCats().toString());
        classUnderTest.enqueue(dog);
        assertEquals("dog queue after adding","Queue{front=Node{value=Dog: {name='anything', age=2.5, species='anything', color='anything'}, next=null}, Rear=Node{value=Dog: {name='anything', age=2.5, species='anything', color='anything'}, next=null}}" ,classUnderTest.getDogs().toString());
        assertEquals("enqueue dog in AnimalShelte","Animal Shelter => { cats = Queue{front=Node{value=Cat: {name='Mew', age=2.4, species='anything', color='anything'}, next=null}, Rear=Node{value=Cat: {name='Mew', age=2.4, species='anything', color='anything'}, next=null}} , dogs = Queue{front=Node{value=Dog: {name='anything', age=2.5, species='anything', color='anything'}, next=null}, Rear=Node{value=Dog: {name='anything', age=2.5, species='anything', color='anything'}, next=null}} }",classUnderTest.toString());
    }

    @Test public void testAnimalShelterDequeueEmptyAnimalShelter() {
        AnimalShelter classUnderTest = new AnimalShelter();
        assertEquals("enqueue cat in empty AnimalShelte","java.lang.NullPointerException",classUnderTest.dequeue("cat").toString());
    }

    @Test public void testAnimalShelterDequeueAnimalShelter() {
        AnimalShelter classUnderTest = new AnimalShelter();
        Cat cat = new Cat("Mew",2.4,"anything","anything");
        Cat cat1 = new Cat("anything",2.5,"anything","anything");
        Dog dog = new Dog("anything",2.5,"anything","anything");
        classUnderTest.enqueue(cat);
        classUnderTest.enqueue(dog);
        classUnderTest.enqueue(cat1);
        assertEquals("dequeue dog from AnimalShelte","Dog: {name='anything', age=2.5, species='anything', color='anything'}",classUnderTest.dequeue("dog").toString());
        assertEquals("dequeue cow from AnimalShelte",null,classUnderTest.dequeue("cow"));
        assertEquals("AnimalShelter after dequeue dog","Animal Shelter => { cats = Queue{front=Node{value=Cat: {name='Mew', age=2.4, species='anything', color='anything'}, next=Node{value=Cat: {name='anything', age=2.5, species='anything', color='anything'}, next=null}}, Rear=Node{value=Cat: {name='anything', age=2.5, species='anything', color='anything'}, next=null}} , dogs = Queue{front=null, Rear=null} }",classUnderTest.toString());
        assertEquals("dequeue cat from AnimalShelte","Cat: {name='Mew', age=2.4, species='anything', color='anything'}",classUnderTest.dequeue("cat").toString());
        assertEquals("dequeue another cat from AnimalShelte","Cat: {name='anything', age=2.5, species='anything', color='anything'}",classUnderTest.dequeue("cat").toString());
        assertEquals("AnimalShelte after dequeue all cats" ,"Animal Shelter => { cats = Queue{front=null, Rear=null} , dogs = Queue{front=null, Rear=null} }",classUnderTest.toString());
    }
}
