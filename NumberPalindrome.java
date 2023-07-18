//Write a program to check the given number is PALINDROME or not?
import java.util.Scanner;

public class NumberPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter value of n = ");
        int n = sc.nextInt();
        int temp = n;
        int rev=0;
        while(temp!=0)
        {
            rev=rev*10+(temp%10);
            temp = temp/10;
        }
        if(n==rev)
        {
            System.out.println(n+" is palindrome number");
        }
        else
        {
            System.out.println(n+" is not palindrome number");
        }
    }
}
