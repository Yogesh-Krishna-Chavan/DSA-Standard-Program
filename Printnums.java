//Write a program to Print 1 to N numbers?
class Printnums {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("enter a value of n");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
    }
}