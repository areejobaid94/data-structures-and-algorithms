package utilities.Models;

public abstract class Animals {
    private String name;
    private Double age;
    private String species;
    private String color;


    public Animals() {
    }

    public Animals(String name, Double age, String species, String color) {
        this.name = name;
        this.age = age;
        this.species = species;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getAge() {
        return age;
    }

    public void setAge(Double age) {
        this.age = age;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", species='" + species + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

}
