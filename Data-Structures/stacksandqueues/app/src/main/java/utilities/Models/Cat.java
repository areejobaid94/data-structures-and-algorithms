package utilities.Models;

public class Cat extends Animals{

    public Cat() {
    }

    public Cat(String name, Double age, String species, String color) {
        super(name, age, species, color);
    }

    @Override
    public String toString() {
        return "Cat: "+ super.toString();
    }
}
