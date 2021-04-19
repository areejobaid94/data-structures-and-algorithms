package utilities;

import stacksandqueues.Node;
import stacksandqueues.Queue;
import utilities.Models.Animals;
import utilities.Models.Cat;
import utilities.Models.Dog;

import java.net.CacheRequest;

public class AnimalShelter {
    Queue cats = new Queue();
    Queue dogs = new Queue();
    public AnimalShelter() {
    }

    public void enqueue(Animals animal){
        try {
            if(animal instanceof Cat)
                cats.enqueue(animal);
            else if(animal instanceof Dog)
                dogs.enqueue(animal);
        }catch (Exception ex){
            System.out.println(ex);
        }
    }

    public Object dequeue(String pref){
        try {
            if (pref.toLowerCase() == "cat"){
                if (cats.isEmpty())
                    return new NullPointerException();
                 return  cats.dequeue();
            }else if (pref.toLowerCase() == "dog"){
                if (dogs.isEmpty())
                    return new NullPointerException();
                return dogs.dequeue();
            }
        }catch (NullPointerException ex){
            System.out.println(ex);
        }
        return null;
    }
    public Queue getCats() {
        return cats;
    }

    public void setCats(Queue cats) {
        this.cats = cats;
    }

    public Queue getDogs() {
        return dogs;
    }

    public void setDogs(Queue dogs) {
        this.dogs = dogs;
    }
    @Override
    public String toString() {
        return "Animal Shelter => { " +
                "cats = " + cats + " " +
                ", dogs = " + dogs+ " " +
                '}';
    }
}
