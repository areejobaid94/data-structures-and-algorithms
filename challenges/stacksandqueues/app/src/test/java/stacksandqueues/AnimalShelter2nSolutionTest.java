package stacksandqueues;
import org.junit.Test;
import utilities.AnimalShelter;
import utilities.AnimalShelter2nSolution;
import utilities.Models.Cat;
import utilities.Models.Dog;

import static org.junit.Assert.*;

public class AnimalShelter2nSolutionTest {
    @Test public void testAnimalShelter2nSolutionEnqueue() {
        AnimalShelter2nSolution classUnderTest = new AnimalShelter2nSolution();
        Cat cat = new Cat("Mew",2.4,"anything","anything");
        Cat cat1 = new Cat("anything",2.5,"anything","anything");
        Dog dog = new Dog("anything",2.5,"anything","anything");
        classUnderTest.enqueue(cat);
        assertEquals("enqueue cat in empty AnimalShelte 2nd solution","Queue{front=Node{value=Cat: {name='Mew', age=2.4, species='anything', color='anything'}, next=null}, Rear=Node{value=Cat: {name='Mew', age=2.4, species='anything', color='anything'}, next=null}}",classUnderTest.toString());
        classUnderTest.enqueue(dog);
        assertEquals("enqueue dog in AnimalShelte 2nd solution","Queue{front=Node{value=Cat: {name='Mew', age=2.4, species='anything', color='anything'}, next=Node{value=Dog: {name='anything', age=2.5, species='anything', color='anything'}, next=null}}, Rear=Node{value=Dog: {name='anything', age=2.5, species='anything', color='anything'}, next=null}}",classUnderTest.toString());
    }

    @Test public void testAnimalShelter2nSolutionDequeueEmptyAnimalShelter() {
        AnimalShelter2nSolution classUnderTest = new AnimalShelter2nSolution();
        assertEquals("enqueue cat in empty AnimalShelte","java.lang.NullPointerException",classUnderTest.dequeue("cat").toString());
    }

    @Test public void testAnimalShelter2nSolutionDequeueAnimalShelter() {
        AnimalShelter2nSolution classUnderTest = new AnimalShelter2nSolution();
        Cat cat = new Cat("Mew",2.4,"anything","anything");
        Cat cat1 = new Cat("anything",2.5,"anything","anything");
        Dog dog = new Dog("anything",2.5,"anything","anything");
        classUnderTest.enqueue(cat);
        classUnderTest.enqueue(dog);
        classUnderTest.enqueue(cat1);
        assertEquals("dequeue dog from AnimalShelte","Dog: {name='anything', age=2.5, species='anything', color='anything'}",classUnderTest.dequeue("dog").toString());
        assertEquals("dequeue cow from AnimalShelte",null,classUnderTest.dequeue("cow"));
        assertEquals("AnimalShelter after dequeue dog","Queue{front=Node{value=Cat: {name='Mew', age=2.4, species='anything', color='anything'}, next=Node{value=Cat: {name='anything', age=2.5, species='anything', color='anything'}, next=null}}, Rear=Node{value=Cat: {name='anything', age=2.5, species='anything', color='anything'}, next=null}}",classUnderTest.toString());
        assertEquals("dequeue cat from AnimalShelte","Cat: {name='Mew', age=2.4, species='anything', color='anything'}",classUnderTest.dequeue("cat").toString());
        assertEquals("dequeue another cat from AnimalShelte","Cat: {name='anything', age=2.5, species='anything', color='anything'}",classUnderTest.dequeue("cat").toString());
        assertEquals("AnimalShelte after dequeue all cats" ,"Queue{front=null, Rear=null}",classUnderTest.toString());
    }
}
