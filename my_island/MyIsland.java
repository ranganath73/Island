package my_island.my_island;

import my_island.my_island.animal.Animal;
import my_island.my_island.animal.herbivores.*;

public class MyIsland {

    public static void main(String[] args) {
        Boar boar = new Boar();
        Buffalo buffalo = new Buffalo();
        Caterpillar caterpillar = new Caterpillar();
        Deer deer = new Deer();
        Duck duck = new Duck();
        Goat goat = new Goat();
        Horse horse = new Horse();
        Mouse mouse = new Mouse();
        Rabbit rabbit = new Rabbit();
        Sheep sheep = new Sheep();
//        boar.eat();
//        buffalo.eat();
//        caterpillar.eat();
//        deer.eat();
//        duck.eat();
//        goat.eat();
//        horse.eat();
//        mouse.eat();
//        rabbit.eat();
//        sheep.eat();
        Thread t1 = new Thread(boar);
        Thread t2 = new Thread(buffalo);
        Thread t3 = new Thread(caterpillar);
        Thread t4 = new Thread(deer);
        Thread t5 = new Thread(duck);
        Thread t6 = new Thread(goat);
        Thread t7 = new Thread(horse);
        Thread t8 = new Thread(mouse);
        Thread t9 = new Thread(rabbit);
        Thread t10 = new Thread(sheep);
        //
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();
        t8.start();
        t9.start();
        t10.start();
    }
}
