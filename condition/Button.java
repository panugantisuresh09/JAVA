import java.util.Scanner;

public class Button {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the button ");
        int n = sc.nextInt();
        if (n == 1) {
            System.out.println("the colour red");
        } else if (n == 2) {
            System.out.println("the colour black");
        } else if (n == 3) {
            System.out.println(" the colour is yellow");
        } else {
            System.out.println("the colour brown");
        }

    }
}
