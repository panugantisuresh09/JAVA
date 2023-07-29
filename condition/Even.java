import java.util.Scanner;

public class Even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
        if (n % 2 == 0) {
            System.out.println("given number is even" + n);
        } else {
            System.out.println("given number is odd " + n);
        }
    }
}
