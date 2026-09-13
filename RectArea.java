import java.util.Scanner;

public class RectArea {
 
    public static void main(String[] args) {
        

  double length =  0;
  double breadth =  0;
  double area =  0;

  Scanner scanner = new Scanner(System.in);
  System.out.println("Enter length of rectangle:");
  length = scanner.nextDouble();
  System.out.println("Enter breadth of rectangle:");
  breadth = scanner.nextDouble();

  area = length * breadth;

  System.out.println("Area of rectangle is: " + area);

  scanner.close();
  
}
}