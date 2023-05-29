import java.util.*;
public class Circle 
{
    double radius;
    double area; 
    double circumference;
    final double PI=3.14;
      
    
    public void setData()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter radius");
        radius=sc.nextDouble();
        
    }
    public void calArea()
    {
        area=PI*radius*radius;
        System.out.println("Area of the circle is:"+area);
    }
    public void calCircumference()
    {
        this.circumference=2*PI*this.radius;
        System.out.println("Circumference of the circle is:"+circumference);
    }
   public static void main(String args[])
   {
       Circle c1=new Circle();
       c1.setData();
       c1.calArea();
       Circle c2=new Circle();
       c2.setData();
       c2.calArea();
   }
}
