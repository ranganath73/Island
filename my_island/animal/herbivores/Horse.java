package my_island.my_island.animal.herbivores;

import my_island.my_island.animal.Animal;
import my_island.my_island.plants.Plant;

public class Horse extends Animal implements Runnable{

    public void eat() {
        if (hasSuitableFood()) {
            if (Plant.isEdible()) {
                System.out.println("I'm the \"Horse\" who is eating plant.");
            }
        }
    }

    public void run() {
        eat();
    }
    public void move() {}

    public void breed() {}

    public void die() {}
}
