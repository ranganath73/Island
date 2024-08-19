package my_island.my_island;

import my_island.my_island.animal.carnivores.Hunter;
import my_island.my_island.animal.herbivores.PlantEater;
import my_island.my_island.plants.Plant;

public class Launcher {
    public static void main(String[] args) {
        Location location1 = new Location(5,3);
        Hunter hunter = new Hunter();
        PlantEater plantEater = new PlantEater();
        Plant plant = new Plant();

        Island<Location, Hunter, PlantEater, Plant> region1 = new Island<Location, Hunter, PlantEater, Plant>(
                new Location(5,3), new Hunter(), new PlantEater(), new Plant()
        );
    }
}
