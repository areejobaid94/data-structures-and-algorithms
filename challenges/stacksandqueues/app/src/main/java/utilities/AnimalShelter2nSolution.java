package utilities;

import stacksandqueues.Node;
import stacksandqueues.Queue;
import utilities.Models.Animals;
import utilities.Models.Cat;
import utilities.Models.Dog;

public class AnimalShelter2nSolution extends Queue {
    public AnimalShelter2nSolution(Object value) {
        super(value);
    }
    public AnimalShelter2nSolution() {
    }

    public Object dequeue(String pref ) {
        Node animal = null;
        try {
            if (isEmpty())
                return new NullPointerException();
            Node current = front;
               if((pref.toLowerCase() == "cat" && current.value instanceof Cat) || ( pref.toLowerCase() == "dog" && current.value instanceof Dog)){
                 return super.dequeue();
                };
                while (current.next != null){
                    if ( pref.toLowerCase() == "cat" && current.next.value instanceof Cat){
                        animal = current.next;
                        current.next = current.next.next;
                        animal.next = null;
                        return animal.value;
                    }else if( pref.toLowerCase() == "dog" && current.next.value instanceof Dog){
                        animal = current.next;
                        current.next = current.next.next;
                        animal.next = null;
                        return animal.value;
                    }
                    current = current.next;
                }
        }catch (NullPointerException ex){
            System.out.println(ex);
        }
        return animal;
    }
}
