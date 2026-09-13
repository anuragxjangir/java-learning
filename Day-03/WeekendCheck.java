import java.util.Scanner;

public class WeekendCheck {
public static void main(String[] args) {
    
     Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int day = scanner.nextInt();

        switch (day) {
            case 1 -> {System.out.println("Day is Monday");
                      System.out.println("It is a Weekday");} 
            case 2 -> {System.out.println("Day is Tuesday");
                      System.out.println("It is a Weekday");}
            case 3 -> {System.out.println("Day is Wednesday");
                      System.out.println("It is a Weekday");} 
            case 4 -> {System.out.println("Day is Thursday");
                      System.out.println("It is a Weekday");}
            case 5 -> {System.out.println("Day is Friday");
                      System.out.println("It is a Weekday");} 
            case 6 -> {System.out.println("Day is Saturday");
                      System.out.println("It is a Weekend");}
            case 7 -> {System.out.println("Day is Sunday");
                      System.out.println("It is a Weekend");}
            default -> System.out.println("Invalid day.");          
        }
        scanner.close();
}
    
}
