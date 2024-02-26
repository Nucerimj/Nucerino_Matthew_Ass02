import java.util.Random;
import java.util.Scanner;

public class Ass02_Craps {
    public static void main(String[] args) {
        Random rnd = new Random();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int die1 = rnd.nextInt(6) + 1;
            int die2 = rnd.nextInt(6) + 1;
            int sum = die1 + die2;

            System.out.println("Rolling the dice...");
            System.out.println("Die 1: " + die1);
            System.out.println("Die 2: " + die2);
            System.out.println("Sum: " + sum);

            if (sum == 2 || sum == 3 || sum == 12) {
                System.out.println("Craps! You lose.");
            } else if (sum == 7 || sum == 11) {
                System.out.println("Natural! You win.");
            } else {
                System.out.println("Point is set to " + sum);
                while (true) {
                    int nextRoll1 = rnd.nextInt(6) + 1;
                    int nextRoll2 = rnd.nextInt(6) + 1;
                    int nextSum = nextRoll1 + nextRoll2;

                    System.out.println("Rolling for point...");
                    System.out.println("Die 1: " + nextRoll1);
                    System.out.println("Die 2: " + nextRoll2);
                    System.out.println("Sum: " + nextSum);

                    if (nextSum == sum) {
                        System.out.println("Made the point! You win.");
                        break;
                    } else if (nextSum == 7) {
                        System.out.println("Got a seven! You lose.");
                        break;
                    } else {
                        System.out.println("Trying for point...");
                    }
                }
            }

            System.out.print("Do you want to play again? (yes/no): ");
            String playAgain = scanner.next().toLowerCase();

            if (!playAgain.equals("yes")) {
                System.out.println("Thanks for playing. Goodbye!");
                break;
            }
        }

        scanner.close();
    }
}
