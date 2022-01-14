import java.util.Scanner;

public class CircleDemo
{
   public static void main(String[] args)
   {
      
      System.out.println("user.dir: " + System.getProperty("user.dir"));
      System.out.println(java.util.Calendar.getInstance().getTime());
      System.out.println();
      
      Scanner circ = new Scanner(System.in);
      double radius;
      
      System.out.print("Enter the radius of a circle: ");
      radius = circ.nextDouble();
      
      Circle cir = new Circle(radius);
      
      System.out.println("The circle's area is " + String.format("%.2f",cir.getArea()));
      System.out.println("The circles diameter is " + String.format("%.2f",cir.getDiameter()));
      System.out.println("The circle's circumference is " + String.format("%.2f",cir.getCircumference()));
   }
}

      
      
      
