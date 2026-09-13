import java.util.Scanner;

public class Results {

    public static void main(String[] args) {
        
     String name = "";
     double marks1 = 0;
     double marks2 = 0;
     double marks3 = 0;
     double tmarks = 0;
     double avgmarks = 0;
     

    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter name of student : ");
    name = scanner.nextLine();
    System.out.print("Enter marks of subject 1 : ");
    marks1 = scanner.nextDouble();
    System.out.print("Enter marks of subject 2 : ");
    marks2 = scanner.nextDouble();
    System.out.print("Enter marks of subject 3 : ");
    marks3 = scanner.nextDouble();

    tmarks = marks1 + marks2 + marks3;
    avgmarks = (marks1 + marks2 + marks3) / 3;

    System.out.println("Student : " + name );
    System.out.println("Total marks are : " + tmarks );
    System.out.println("Average marks are : " + avgmarks );

    scanner.close();

    }
}
