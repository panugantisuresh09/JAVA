import java.util.Scanner;

public class Result1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n = sc.nextInt();
        int marks[] = new int[n];
        System.out.println("enter the marks of the students");
        for (int i = 0; i < marks.length; i++) {
            marks[i] = sc.nextInt();
        }
        System.out.println("marks of the students ");
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }
    }
}
