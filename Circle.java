public class Circle
{
   private double radius;
   private final double pi = 3.14159;
   
   public Circle(double rad)
   {
      radius = rad;
   }
   
   public void setRadius(double rad)
   {
      radius = rad;
   }
   
   public double getRadius()
   {
      return radius;
   }
   
   public double getArea()
   {
      double area;
      area = radius * radius * pi;
      return area;
   }
   
   public double getDiameter()
   {
      double diameter;
      diameter = radius * 2;
      return diameter;
   }
   
   public double getCircumference()
   {
      double circumference;
      circumference = 2 * pi * radius;
      return circumference;
   }
}
   