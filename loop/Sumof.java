import java.util.Scanner;

public class Sumof {
    public static void main(String[] args) {

        {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter the number to find sum of natural number");
            int n = sc.nextInt();
            int sum = 0;
            for (int i = 0; i <= n; i++) {
                sum = sum + i;
            }
            System.out.println(sum);
        }
    }
}