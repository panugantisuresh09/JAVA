import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any number between 1_4");
        int num = sc.nextInt();
        switch (num) {
            case 1:
                System.out.println("naven");
                break;
            case 2:
                System.out.println("suresh");
                break;
            case 3:
                System.out.println("rajesh");
                break;
            case 4:
                System.out.println("ramesh");
                break;
        }
    }
}
