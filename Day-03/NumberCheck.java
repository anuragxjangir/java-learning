import java.util.Scanner;

public class NumberCheck {
    public static void main(String[] args) {
        
        int no;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number : ");
        no = scanner.nextInt();

        if (no > 0 ){
            System.out.println("Entered number is POSITIVE ");
        }
        else if (no < 0 ){
            System.out.println("Entered number is NEGATIVE ");
        }
        else {
            System.out.println("Entered number is ZERO ");
        }
        scanner.close();

    }
    
}
