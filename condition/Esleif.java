import java.util.Scanner;

public class Esleif {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any number between 1_4");
        int num = sc.nextInt();
        if (num == 1) {
            System.out.println("suresh");
        } else if (num == 2) {
            System.out.println("charan");
        } else if (num == 3) {
            System.out.println("venkat");
        } else {
            System.out.println("naveen");
        }
    }
}
