import java.util.*;
public class GreaterLess
{
	public static void main(String args[])
{
int A,B;
Scanner sc= new Scanner(System.in);
System.out.println("Enter A:");
A=sc.nextInt();
System.out.println("Enter B:");
B=sc.nextInt();
if(A==B)
{
	System.out.println("Number are equal");
}
else if(A>B)
{
	System.out.println(A+" is greater ");
	System.out.println(B+" is smaller ");
}
else
{
	System.out.println(B+" is greater ");
	System.out.println(A+" is smaller ");
}

}
}