package main;

public class Animal {
    private String species;
    private String name;
    private int age;


    public Animal(String species, String name, int age) {
        this.species=species;
        this.name=name;
        this.age=age;

    }

    public String getSpecies() {

        return species;
    }

    public String getName() {
        
        return name;
    }
    
    public int getAge() {

        return age;
    }

    public String toString(){
        return species+": " + name + ", " + age + " vuotta";
    }
}
