import java.util.Scanner;
   
public class AgeCheck {

 public static void main(String[] args) {
    
    String name;
    int age;
   
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter your name : ");
    name = scanner.nextLine();
    System.out.print("Enter your age : "); 
    age = scanner.nextInt();

    System.out.println("Hi! " + name);

    if(age >= 18){
        System.out.println("You are an Adult! ");
    }
    else{
        System.out.println("You are a Minor! ");
    }
    scanner.close();
}
}