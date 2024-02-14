package codePractice;

//package codePractice;
import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
 public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     Random rand = new Random();
     
     int range = 100; // Range of numbers to guess from
     int maxAttempts = 10; // Maximum number of attempts allowed
     int score = 0; // Score starts from 0
     
     // Game loop
     while (true) {
         // Generate a random number from the given range
         int randomNumber = rand.nextInt(range) + 1;

         System.out.println("Guess a number between 1 and " + range + ".");
         int numAttempts = 0; // Reset the number of attempts for each round
         
         // Round loop
         while (numAttempts < maxAttempts) {
             System.out.print("Attempt #" + (numAttempts + 1) + ": ");
             int guess = input.nextInt();

             if (guess == randomNumber) {
                 System.out.println("Congratulations! You guessed the number in " + (numAttempts + 1) + " attempts.");
                 score += (maxAttempts - numAttempts); // Add points based on the number of attempts
                 break; // End the current round
             } else if (guess < randomNumber) {
                 System.out.println("The number is higher than " + guess + ".");
             } else {
                 System.out.println("The number is lower than " + guess + ".");
             }
             
             numAttempts++;
         }

         if (numAttempts == maxAttempts) {
             System.out.println("Sorry, you did not guess the number. The number was " + randomNumber + ".");
         }

         System.out.println("Your current score is " + score + ".");
         
         // Prompt the user for another round
         System.out.println("Do you want to play another round? Press 'Y' for Yes or 'N' for No.");
         String playAgain = input.next();

         if (playAgain.equalsIgnoreCase("N")) {
             System.out.println("Thanks for playing! Your final score is " + score + ".");
             break; // End the game loop
         }
     }

     input.close();
 }
}