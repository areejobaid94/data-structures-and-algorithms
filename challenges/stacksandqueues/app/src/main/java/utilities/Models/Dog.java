package utilities.Models;

public class Dog extends Animals{
    public Dog(String name, Double age, String species, String color) {
        super(name, age, species, color);
    }

    @Override
    public String toString() {
        return "Dog: "+ super.toString();
    }
}
