import java.util.Scanner;

public class Forloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter the  name");
        String name = sc.nextLine();
        System.out.println("enter number of times");
        int n = sc.nextInt();
        for (int i = 1; i < n; i++) {
            System.out.println(name);

        }
    }
}
