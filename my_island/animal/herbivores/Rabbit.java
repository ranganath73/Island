package my_island.my_island.animal.herbivores;

import my_island.my_island.animal.Animal;
import my_island.my_island.plants.Plant;

public class Rabbit extends PlantEater {

//    public boolean eat() {
//        if (hasSuitableFood()) {
//            if (Plant.isEdible()) {
//                System.out.println("I'm the \"Rabbit\" who is eating plant.");
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
