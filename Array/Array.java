
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no of rows");
        int rows = sc.nextInt();
        System.out.println("enter no of columns");
        int col = sc.nextInt();

        int array[][] = new int[rows][col];
        System.out.println("enter numbers");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {

                array[i][j] = sc.nextInt();
            }
        }

        System.out.println("the two dimension arrays");
        for (int i = 0; i < rows; i++) {
            System.out.println("");
            for (int j = 0; j < col; j++) {
                System.out.println(array[i][j] + " ");
            }
            System.out.println();
        }

    }
}
