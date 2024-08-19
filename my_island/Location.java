package my_island.my_island;

public class Location {
    private int latitude;
    private int longitude;

    public Location(int latitude, int longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public static boolean hasSuitableFood() {
            return ((int)(Math.random() * 10)) == 0 ? false : true;
        }
}
