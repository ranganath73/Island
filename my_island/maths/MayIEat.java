package my_island.my_island.maths;

import java.util.Random;

public class MayIEat {

    public static int generateEatProbability(int min, int max) {
        Random r =  new Random();
        return r.nextInt((max - min) + 1) + min;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.out.println(generateEatProbability(0,90));
        }
    }
}
