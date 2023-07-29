package condition;

import java.util.Scanner;

public class Coordinate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter the  x and y values ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a > 0 && b > 0) {
            System.out.println("the points lies on the 1 quadrant");
        } else if (a < 0 && b > 0) {
            System.out.println(" the points lies on the 2 quadrant");
        } else if (a < 0 && b < 0) {
            System.out.println(" the points lies on the 3rd quadrant");
        } else {
            System.out.println("the points lies on the 4th quadrant ");
        }
    }
}
