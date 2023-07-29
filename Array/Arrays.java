import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please define size of arrray");
        int size = sc.nextInt();
        int numbers[] = new int[size];
        System.out.println("enter numbers");
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }
        System.out.println("students numbers ");
        for (int i = 0; i < size; i++) {

            System.out.println(numbers[i]);
        }
    }
}
