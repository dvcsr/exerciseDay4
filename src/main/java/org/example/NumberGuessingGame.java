package org.example;
import java.util.*;

public class NumberGuessingGame {
    public static void main(String[] args) {

        char replay = 'y';
        char abort = 'x';
        int numOfAttempt = 0;

        do {
            int myNum = (int)(Math.random() * 10);

            Scanner myScan = new Scanner(System.in);
            numOfAttempt = 0;
            System.out.println("I have a number in my head.");
            System.out.println("Guess:");
            String snumGuess = myScan.nextLine();
            numOfAttempt = numOfAttempt+1;
            if (snumGuess.charAt(0) == abort) break;

            int numGuess = Integer.parseInt(snumGuess);
            System.out.println("So, your guess is " + numGuess);

            while(numGuess != myNum) {
                if(numGuess > myNum) {
                    System.out.println("guess lower boii");
                    System.out.println("\nGuess:");
                    snumGuess = myScan.nextLine();
                    numOfAttempt = numOfAttempt+1;
                    if (snumGuess.charAt(0) == abort) break;
                    numGuess = Integer.parseInt(snumGuess);
                }
                else if (numGuess < myNum) {
                    System.out.println("guess higher boii");
                    System.out.println("\nGuess:");
                    snumGuess = myScan.nextLine();
                    numOfAttempt = numOfAttempt+1;
                    if (snumGuess.charAt(0) == abort) break;
                    numGuess = Integer.parseInt(snumGuess);
                }

            }
            if (numGuess == myNum) {
                System.out.println("Correct aye!");
                System.out.println("Number of attempt(s): " + numOfAttempt);
            }

            if (snumGuess.charAt(0) != abort) {
                System.out.println("do you want to play again? (y/n)");
                replay = myScan.nextLine().charAt(0);

            }
            else break;


        }
        while (replay == 'y');

        System.out.println("Thank you for playing!");
    }



}
