package main;
import java.util.ArrayList;
public class Zoo {
    private String name;
    private ArrayList<Animal> animals;

    public Zoo(String name) {
        this.name=name;
        this.animals=new ArrayList<>();

    }

    public void addAnimal(Animal animal){
        animals.add(animal);

    }

    public void listAnimals(){
        for (Animal animal : animals){
            System.out.println(animal);

        }
    }

    public void runAnimals(int laps){
        for (Animal animal : animals){
            for (int i=0; i<laps;i++){
                System.out.println(animal.getName()+" juoksee kovaa vauhtia!");
            }
        }
    }
}
