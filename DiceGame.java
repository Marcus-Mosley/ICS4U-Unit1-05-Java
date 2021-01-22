import java.lang.Math;
import java.util.Random;
import java.util.Scanner;

/**
* The DiceGame program implements an application that
* gets a user to guess the output of a die flip.
*
* @author  Marcus A. Mosley
* @version 1.0
* @since   2021-01-22
*/
public class DiceGame {
  /**
  * The DiceGame program implements an application that
  * gets a user to guess the output of a die flip.
  */
  public static void main(String[] args) {
    Random rand = new Random();
    int upperbound = 6;
    int randomNumber = 1 + rand.nextInt(upperbound);
    int counter = 0;
    int guess = 0;

    while (true) {
      counter += 1;
      while (true) {
        try {
          // Input
          Scanner input = new Scanner(System.in);
          System.out.print("Enter a guess between 1-6: ");
          guess = input.nextInt();
          if (guess >= 1 && guess <= 6) {
            break;
          } else {
            System.out.printf("That is not a valid input! \n");
          }
        } catch (Exception e) {
          System.out.printf("That is not a number, please input a number! \n");
        }
      }
      if (guess == randomNumber) {
        System.out.printf("That is correct, it took %d guesses.", new Object[] {counter});
        break;
      } else {
        System.out.printf("That is not correct, please try again! \n");
      }
    }
  }
}
