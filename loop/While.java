import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter name ");
        String s = sc.nextLine();
        System.out.println("enter how many times");
        int n = sc.nextInt();
        int i = 1;
        while (i <= n) {
            System.out.println(s);
            i++;

        }
    }
}
