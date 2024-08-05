package my_island.my_island;

public class Plant {

    // v1.2
    public static boolean isEdible() {
        return ((int)(Math.random() * 10)) == 0 ? false : true;
    }

    // /// v1.1
    // public static void isEdible() {
    //     int number = (int) (Math.random() * 10);
    //     if (number == 0) {
    //         System.out.println(number);
    //     } else {
    //         System.out.println(number);
    //     }
    // }

    /// v1.0
    // public static void isEdible() {
    //     System.out.println(Math.random() * 10 );
    // }

    public static void main(String args[]) {
        for (int i = 0; i < 100; i++) {

            System.out.println(isEdible());
        }

    }
}
