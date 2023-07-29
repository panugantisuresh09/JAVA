import java.util.Scanner;

public class Addition1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter two numbers ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = a + b;
        System.out.println("Addition of two numbers" + c);
        int d = b - a;
        System.out.println("Subtraction of numbers" + d);
        int e = a * b;
        System.out.println("Multiplication of numbers" + e);
        int f = a / b;
        System.out.println("Division of two numbers " + f);

    }
}