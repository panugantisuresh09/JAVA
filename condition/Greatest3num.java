import java.util.Scanner;

public class Greatest3num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter three numbers ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a > b && a > c) {
            System.out.println("value a greater =" + a);
        } else if (b > a && b > c) {
            System.out.println("value b is greater =" + b);
        } else {
            System.out.println(" value c is grater =" + c);
        }

    }
}
