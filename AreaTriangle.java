import java.util.*;
public class AreaTriangle
{
double height,base,result;
public double area()
{
result=(0.5)*height*base;
return result;
}
public static void main(String args[])
{
 AreaTriangle a=new  AreaTriangle();
Scanner s=new Scanner(System.in);
System.out.println("Enter the height");
a.height=s.nextDouble();
System.out.println("Enter the base");
a.base=s.nextDouble();
System.out.println("Area of Triangle is"+a.area());

}
}
