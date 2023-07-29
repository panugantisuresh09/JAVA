import java.rmi.server.SocketSecurityException;
import java.util.Scanner;

public class Add2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the numbers ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double add = a + b;
        System.out.println(add);
    }
}
