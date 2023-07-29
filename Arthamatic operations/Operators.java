import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any two numbers to perform operation");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int summation = a + b;
        int multiplication = a * b;
        int subtraction = a - b;
        int division = a / b;
        System.out.println("The operation be like ");
        System.out.println("The addition of two numbers " + summation);
        System.out.println("The multiplication of two numbers " + multiplication);
        System.out.println("The subtraction of two numbers " + subtraction);
        System.out.println("The division of two numbers " + division);
        System.out.println("The arthimatic operators ");

    }
}
