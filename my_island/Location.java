package my_island.my_island;

public class Location {
    public boolean hasSuitableFood() {
        return ((int)(Math.random() * 10)) == 0 ? false : true;
    }
}
