import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length and breadth for calculating area");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int area = a * b;
        System.out.println("The area of rectangle is " + area);
    }
}
