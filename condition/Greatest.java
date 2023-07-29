import java.util.Scanner;

public class Greatest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the numbers");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        if (num1 > num2) {
            System.out.println("number 1" + num1 + "is greater");
        } else {
            System.out.println("number2 " + num2 + "is greater");

        }
    }
}
