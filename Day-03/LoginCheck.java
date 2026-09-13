import java.util.Scanner;

public class LoginCheck {
    public static void main(String[] args) {
        
        int pass;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Login password : ");
        pass = scanner.nextInt();
        
        if (pass == 1234){
            System.out.println("Access GRANTED!! ");
        }
        else {
            System.out.println("Access DENIED!! ");
        }
        scanner.close();
    }
}
