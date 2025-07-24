import java.util.*;
public class EvenOdd
{
public static void main(String args[])
{
int num;
Scanner sc=new Scanner(System.in);
System.out.println("Enter no:");
num =sc.nextInt();
if(num%2==0)
{
	System.out.println("Even");
}
else
{
	System.out.println("Odd");
}


}
}