package my_island.my_island.animal.herbivores;

import my_island.my_island.animal.behavior.CanBreed;
import my_island.my_island.animal.behavior.CanEat;
import my_island.my_island.animal.behavior.CanMove;
import my_island.my_island.animal.behavior.MayDie;

public abstract class PlantEater implements CanEat, CanMove, CanBreed, MayDie {
}
