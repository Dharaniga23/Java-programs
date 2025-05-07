import java.util.Random;
import java.util.Scanner;

public class numguess {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int guess;
        int attempts = 0;
        int min = 1;
        int max = 100;
        int randomNumber = random.nextInt(min, max + 1);

        System.out.println("NUMBER GUESSING GAME");
        System.out.printf("Guess a number between %d-%d\n", min, max);

        do {
            System.out.println("Enter a guess:");
            guess = scanner.nextInt();
            attempts++;

            if (guess < randomNumber) {
                System.out.println("too short,try again");
            } else if (guess > randomNumber) {
                System.out.println("too long,try again");
            } else {
                System.out.println("you are correct ,the number was " + randomNumber);
                System.out.println("No. of attempts:" + attempts);
            }

        } while (guess != randomNumber);
        scanner.close();
    }

}

