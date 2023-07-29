import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter two numbers ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = a + b;
        System.out.println("The addition of two numbers" + c);
        System.out.println("Enter two real numbers ");
        float d = sc.nextFloat();
        float e = sc.nextFloat();
        float f = d + e;
        System.out.println("the addition of real numbers " + f);

    }
}
