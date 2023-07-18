//Write a program to display PRIME NUMBERS from 1 to n?
import java.util.*;

public class DisplayPrimeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of n ");
        int n = sc.nextInt();
        for (int i = 1; i < n; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime)
                    System.out.print(i+" ");
        }
    }
}
