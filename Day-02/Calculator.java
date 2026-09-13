import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        
         double first = 0;
         double second = 0;
         double sum = 0;
         double difference = 0;
         double product = 0;

         Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number: ");
        first = scanner.nextDouble();
        System.out.println("Enter second number: ");
        second = scanner.nextDouble();

        sum = first + second;
        difference = first - second;
        product = first * second;

        System.out.println("sum of two numbers is : " + sum);
        System.out.println("difference of two numbers is : " + difference);
        System.out.println("product of two numbers is : " + product);
           
        scanner.close();
    }


    
}
