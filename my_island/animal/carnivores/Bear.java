package my_island.my_island.animal.carnivores;

import my_island.my_island.animal.Animal;
import my_island.my_island.maths.MayIEat;


//Bear eat boa 80%
//Bear eat horse 40%
//Bear eat deer 80%
//Bear eat rabbit 80%
//Bear eat mouse 90%
//Bear eat goat 70%
//Bear eat sheep 70%
//Bear eat boar 50%
//Bear eat buffalo 20%
//Bear eat duck 10%
//Bear eat caterpillar 0% [Not needed]
//Bear eat plant 0% [Not needed]

//Random => from 0-9 = 0% - 90%

public class Bear extends Animal {

    public void iAmEating() {
        if ((eat() && (MayIEat.generateEatProbability(0, 90) > 80))) {
            System.out.println("I'm eating 'mouse'");
        } else if ((eat() && (MayIEat.generateEatProbability(0, 90) > 70))) {
            System.out.println("I'm eating 'boa' or 'deer' or 'rabbit'");
        }  else if ((eat() && (MayIEat.generateEatProbability(0, 90) > 20))) {
            System.out.println("I'm eating 'boar'");
        } else if ((eat() && (MayIEat.generateEatProbability(0, 90) > 20))) {
            System.out.println("I'm eating 'boar'");
        } else if ((eat() && (MayIEat.generateEatProbability(0, 90) > 0))) {
            System.out.println("I'm eating 'duck'");
        }
    }

    public void move() {}

    public void breed() {}

    public void die() {}

    public static void main(String[] args) {
        Bear bear = new Bear();
        bear.iAmEating();
    }
}
