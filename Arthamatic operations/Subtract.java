import java.util.Scanner;

public class Subtract {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter two numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = a - b;
        System.out.println("The results " + c);

    }
}
