import java.util.Scanner;

public class MinAndMaxInputChallenge{
    public static void MinAndMax(){

        Scanner scanner = new Scanner(System.in);
        //initializing min and max variables
        int min = 0;
        int max = 0;
        int count = 0; // will be used as place holder to assign first number as "min"

        while(true){
            System.out.println("Enter a number:");

            boolean isAnInt = scanner.hasNextInt(); //checks input for valid number.

            if(isAnInt){ //int is true
               int number = scanner.nextInt(); //assigns input as int.
               if(count == 0) { //first statement to execute to assign first number to "min"
                   min = number;
                   count++;
               }
               if (number < min) {
                   min = number;
               } else {
                   max = number;
               }
            } else {
                System.out.println("Invalid Number");
                break; //if invalid input, loop breaks
            }
               scanner.nextLine(); // handles the end of line key(enter)
        }
         System.out.println("Your min #: " + min + " and your max #: " + max);
            scanner.close();
    }
}
