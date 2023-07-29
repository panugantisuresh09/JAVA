package Level1;

import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter the length of the array: ");
        int length = scanner.nextInt();

        int[] arr = new int[length];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < length; i++) {
            System.out.print((i + 1));
            arr[i] = scanner.nextInt();
        }

        for (int element : arr) {
            element += 5;
        }

        System.out.println("\nContents of the array after incrementing by 5:");
        for (int element : arr) {
            System.out.println(element);
        }

        scanner.close();
    }
}
