package my_island.my_island.animal.herbivores;

// I am dead. I am not existing in this world.
//        I will eat Plant: 100%
//        I will starve to death 100%
//        So, my lifetime is very less than the lifetime of this Game.
//        ### SO I WON'T PARTICIPATE IN THIS GAME ###

import my_island.my_island.animal.Animal;
import my_island.my_island.plants.Plant;

public class Caterpillar extends Animal implements Runnable {

    public void eat() {
        if (hasSuitableFood()) {
            if (Plant.isEdible()) {
                System.out.println("I'm the \"Caterpillar\" who is eating plant.");
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
