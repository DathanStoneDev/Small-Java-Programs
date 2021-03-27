package com.company;

public class Main {

    public static void main(String[] args) {
        int number = 4;
        int finishNumber = 20;
        int evenNumbersFound = 0;

        while (number <= finishNumber) {
            number++;
            if(!isEvenNumber(number)) {
                continue; //goes back to the start of the loop if false.
            }
            System.out.println("Even Number " + number);
            evenNumbersFound ++; //increments counter per each even number found
            if(evenNumbersFound >= 5) { //only prints the first 5 even numbers
                break;
            }

        }

        System.out.println("Total Even Numbers Found: " + evenNumbersFound );
    }
    public static boolean isEvenNumber(int number) {
        if(number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
