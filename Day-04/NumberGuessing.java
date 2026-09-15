import java.util.Random;
import java.util.Scanner;

public class NumberGuessing {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int guess;
        int attempts = 0;
        int min = 1;
        int max = 100;
        int randomNumber = random.nextInt(min, max + 1);

        System.out.println("NUMBER GUESSING GAME");
        System.out.printf("GUESS A NUMBER BETWEEN %d-%d\n", min, max);

        do {
            System.out.print("ENTER A GUESS : ");
            guess = scanner.nextInt();
            attempts++;

            if (guess > randomNumber) {
                System.out.println("TOO! HIGH TRY AGAIN");
            } else if (guess < randomNumber) {
                System.out.println("TOO! LOW TRY AGAIN");
            } else {
                System.out.println("CORRECT! THE NO WAS : " + randomNumber);
                System.out.println("YOU WON IN " + attempts + " ATTEMPTS ");

            }

        } while (guess != randomNumber);

        scanner.close();

    }

}
