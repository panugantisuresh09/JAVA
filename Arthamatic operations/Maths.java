import java.util.Scanner;

public class Maths {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("enter any numbers ");
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(" all operation will be ");
            int sum = a + b;
            int sub = a - b;
            int mul = a * b;
            System.out.println("sum of two numbers is " + sum);
            System.out.println("sub of two numbers is " + sub);
            System.out.println("mul of two numbers is " + mul);
        }

    }
}
