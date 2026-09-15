import java.util.Scanner;

public class NestedLoops {
    public static void main(String[] args) {

        int row;
        int column;
        char symbol;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter no of rows : ");
        row = scanner.nextInt();
        System.out.print("Enter no of columns : ");
        column = scanner.nextInt();
        System.out.print("Select the symbol : ");
        symbol = scanner.next().charAt(0);

        for (int i = 0; i < row; i++) {

            for (int j = 0; j < column; j++) {
                System.out.print(symbol);
            }
            System.out.println();

        }
        scanner.close();
    }
}