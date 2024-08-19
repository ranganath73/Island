package my_island.my_island;

import my_island.my_island.Location;
import my_island.my_island.animal.carnivores.Hunter;
import my_island.my_island.animal.herbivores.PlantEater;
import my_island.my_island.plants.Plant;

public class Island <L extends Location, C extends  Hunter, H extends PlantEater, P extends Plant>{

    private L location;
    private C carnivores;
    private H herbivores;
    private P plant;

    public Island(L location, C carnivores, H herbivores, P plant) {
        this.location = location;
        this.carnivores = carnivores;
        this.herbivores = herbivores;
        this.plant = plant;
    }
}
