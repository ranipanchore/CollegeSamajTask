//import packages
import java.util.Scanner;
import java.lang.Math;

public class GuessGaming {
  public static void main(String[] args) {
	  //Random Number between 1 to 100 for Answer
    int answer = (int)(Math.random() * 100) + 1;
    // Limitation of user Entered a guess number to trial 
    int limit = 5;   
    // create a scanner object to read user input
    Scanner input = new Scanner(System.in);
    // TO check if the user has guessed the number
    boolean correct = false;
    System.out.println("You can guess number between 1 and 100: You have 5 tries to guess the number.");
//    System.out.println(answer); @@ uncomment to see the exact answer
    while (limit > 0) {
      System.out.println("Please Guess the Number: ");
     int guess = input.nextInt();
      if (guess == answer) {
        System.out.println("You Guessed the Correct number- !You win");
        correct=true;
        break;
      }
      else if (guess > answer) {
        System.out.println("You Guessed is Bigger number- !You have " + (limit - 1) + " tries left.");
        limit--;
      }
      else {
        System.out.println("You Guessed is Smaller number- !You have " + (limit - 1) + " tries left.");
      }
      limit--;
    }

    if (correct == false) {
      System.out.println("You reached to the limit- !You lose");
    }
  }
}
