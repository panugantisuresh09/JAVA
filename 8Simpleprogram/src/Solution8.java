
import java.util.Scanner;
public class Solution8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter a number to print all even numbers divisible by 3");
      int n= scan.nextInt();
      Displaydivisibleby2and3(n);
         
	}
 public static void Displaydivisibleby2and3(int n) {
	 for(int i=1;i<=n;i++) {
		 if(i%2==0&&i%3==0) {
			 System.out.println(i);
		 }
	 }
 }
}
