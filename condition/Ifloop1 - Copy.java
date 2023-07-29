import java.util.Scanner;

import javax.sound.midi.SysexMessage;

public class Ifloop1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n >= 2) {
            System.out.println("large");
        } else {
            System.out.println("small");
        }
    }
}
