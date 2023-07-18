//Write a program to find SUM OF PRIME numbers?
import java.util.*;

public class SumOfPrimeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the range to point sum of prime numbers ");
        int n = sc.nextInt();  //n=range
        int sum = 0;
        for(int i=1; i<=n; i++){
            if(isPrime(i))
            sum = sum + i;
        }
        System.out.println(sum);
    }

    public static boolean isPrime(int num){
        if(num==1)
        return false;
        for(int i=2; i<num; i++)
        {
            if(num%i==0)
            {
                return false;
            }
        }
        return true;
    }
}