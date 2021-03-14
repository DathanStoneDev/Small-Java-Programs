public class SpeedConverter { //read from top to bottom
    //checks for invalid values and Converts kilometers to miles per hour
    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            return -1;
        }
        return Math.round(kilometersPerHour / 1.609);
    }

    public static void printConversion(double kilometersPerHour) {
    //checks for invalid values and takes the toMilesPerHour method as input
        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
        } else {
            long milesPerHour = toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour + " km/h= " + milesPerHour + " mi/h");
        }
    }
}
