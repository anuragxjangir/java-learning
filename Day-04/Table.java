import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        int num = 0;
        int table = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the digit : ");
        num = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {

            table = num * i;

            System.out.println(table);

        scanner.close();
    }
}
}
