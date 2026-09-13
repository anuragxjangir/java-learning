import java.util.Scanner;

public class GradeCheck {
    public static void main(String[] args) {
        
        int marks;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter MARKS of Student : ");
        marks = scanner.nextInt();
        
        if (marks >= 90){
            System.out.println("You got a 'A' grade. ");
        }
        else if (marks >= 75){
            System.out.println("You got a 'B' grade. ");
       }
        else if (marks >= 60){
            System.out.println("You got a 'C' grade. ");
       }
        else if (marks >= 40){
            System.out.println("You got a 'D' grade. ");
       }
        else {
            System.out.println("You are FAILED. ");
       }
       scanner.close();
    }
}
