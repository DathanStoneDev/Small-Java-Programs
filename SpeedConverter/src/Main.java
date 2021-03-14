public class Main {

    public static void main(String[] args) {
        //prints kilometers per hour to miles per hour since method does not
        // print out this output. uses a parameter
        long miles = SpeedConverter.toMilesPerHour(10.5);
        System.out.println("miles = " + miles);
        //calls the printConversion method (which has printing) with an a parameter
        SpeedConverter.printConversion(10.5);
    }
}
