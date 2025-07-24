import java.util.*;
public class Factorial
{
	public static void main(String args[])
{
int num;
Scanner sc=new Scanner(System.in);

System.out.println("Enter number");
num=sc.nextInt();
int fact=1;
for(int i=num;i>0;i--)
{
	fact*=i;
}
	System.out.println("Factorial is:"+fact);

}
}