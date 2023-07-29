import java.util.Scanner;

public class All1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" define size of array ");
        int n = sc.nextInt();
        int marks[] = new int[n];
        System.out.println("enter the names");
        for (int i = 0; i < marks.length; i++) {
            marks[i] = sc.nextInt();
        }
        System.out.println("the array will be");
        for (int i = 0; i < marks.length; i++) {
            System.out.println("marks[i]");
        }
    }
}
