import java.util.Scanner;

public class Evenodd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check wheather odd or even");
        int n = sc.nextInt();

        if (n % 2 == 0) {
            System.out.println("entered number " + n + " is even ");
        } else {
            System.out.println("enteerd number " + n + " is odd");
        }
    }
}