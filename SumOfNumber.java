import java.util.*;

public class SumOfNumber {
    public static void main(String args[]) {
        int size, sum = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array:");
        size = sc.nextInt();

        int arr[] = new int[size]; 

        System.out.println("Enter the numbers:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt(); 
            sum += arr[i]; 
        }

        System.out.println("Sum of numbers: " + sum);
    }
}
