
import java.util.Scanner;
public class Solution9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter a number all odd numbers divisible by 5");
      int n= scan.nextInt();
      Displayoddnumberdivisibleby5(n);
         
	}
 public static void Displayoddnumberdivisibleby5(int n) {
	 for(int i=1;i<=n;i++) {
		 if(i%2!=0&&i%5==0) {
			 System.out.println(i);
		 }
	 }
 }
}
