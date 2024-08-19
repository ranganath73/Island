package my_island.my_island.animal.herbivores;

import my_island.my_island.animal.Animal;
import my_island.my_island.plants.Plant;

public class Boar extends PlantEater {

//    public void eat() {
//        if (hasSuitableFood()) {
//            if (Plant.isEdible()) {
//                System.out.println("I'm the \"Boar\" who is eating plant.");
//            }
//        }
//    }

    public void run() {
        eat();
    }
    public void move() {}

    public void breed() {}

    public void die() {}
}
