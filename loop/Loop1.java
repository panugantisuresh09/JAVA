import java.util.Scanner;

public class Loop1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter name ");
        String s = sc.nextLine();

        System.out.println("Enter number of times ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println(s);

        }
    }
}
