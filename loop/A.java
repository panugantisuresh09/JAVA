import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any name ");
        String name = sc.nextLine();
        System.out.println("enter number of times ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println(name);

        }
    }
}
