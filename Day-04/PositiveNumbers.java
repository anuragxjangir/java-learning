import java.util.Scanner;

public class PositiveNumbers {
    public static void main(String[] args) {
        int no = 0;

        Scanner scanner = new Scanner(System.in);
        while (no >= 0) {
            System.out.print("Enter a number : ");
            no = scanner.nextInt();
        }
        System.out.println("program ended ");

        scanner.close();
    }
}