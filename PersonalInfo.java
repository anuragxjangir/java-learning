import java.util.Scanner;

public class PersonalInfo {

    public static void main(String[] args) {
        
      String name = "";
      int age = 0;
      String clgName = "";

      Scanner scanner = new Scanner(System.in); 
      
      System.out.println( "Enter your name: " );
      name = scanner.nextLine();
      System.out.println( "Enter your age: " );
      age = scanner.nextInt();
      scanner.nextLine();
      System.out.println( "Enter your college name: " );
      clgName = scanner.nextLine();

      System.out.println("Your name is:" + name);
      System.out.println("You are " + age + " years old");
      System.out.println("You study at " + clgName);

      scanner.close();

    }
    
}