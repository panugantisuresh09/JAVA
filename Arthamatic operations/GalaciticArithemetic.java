import java.util.Scanner;

public class GalaciticArithemetic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter two numbers ");
        long num1 = sc.nextInt();
        long num2 = sc.nextInt();
        long result = galacticAddition(num1, num2);
        System.out.println(result);

    }

    public static long galacticAddition(long num1, long num2) {
        return num1 + num2;
    }
}
