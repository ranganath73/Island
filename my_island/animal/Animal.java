package my_island.my_island.animal;

import my_island.my_island.Location;
import my_island.my_island.plants.Plant;

public abstract class Animal extends Location
{
    public boolean eat() {
        if (hasSuitableFood()) {
            if (Plant.isEdible()) {
                return true;
            }
        }
        return false;
    }


//--->   v1.0
//    public void eat() {
//        if (hasSuitableFood()) {
//            if (Plant.isEdible()) {
//                System.out.println("I'm the \"Animal\" who is eating food.");
//            }
//        }
//    }

    public abstract void move();

    public abstract void breed();

    public abstract void die();
}
