import java.util.Scanner;

public class TwoDiamensionalarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of rows");
        int rows = sc.nextInt();
        System.out.println("enter number of students in each coloumn");
        int col = sc.nextInt();

        String names[][] = new String[rows][col];
        System.out.println("enter names ");
        for (int i = 0; i < names.length; i++) {
            for (int j = 0; j < names[i].length; j++) {
                names[i][j] = sc.nextLine();
            }
        }

        System.out.println("Names of the students ");
        for (int i = 0; i < names.length; i++) {
            for (int j = 0; j < names[i].length; j++) {
                System.out.println(names[i][j] + " ");
            }
            System.out.println("");

        }

    }
}
