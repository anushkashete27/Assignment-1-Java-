import java.util.*;

public class Swap {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a, b, temp;

        System.out.print("Enter first number (a): ");
        a = sc.nextInt();

        System.out.print("Enter second number (b): ");
        b = sc.nextInt();

        // Swapping
        temp = a;
        a = b;
        b = temp;

        System.out.println("After Swap:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
