import java.util.Scanner;

public class All {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age ");
        int n = sc.nextInt();
        if (n > 18) {
            System.out.println(" the person is adult");
        } else {
            System.out.println("the person is  not adult");
        }
    }
}
