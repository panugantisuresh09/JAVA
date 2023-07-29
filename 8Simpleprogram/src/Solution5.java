import java.util.Scanner;
public class Solution5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter a number to print which are divisible by 2 and 5");
      int n= scan.nextInt();
      Displaydivisibleby2and5(n);
         
	}
 public static void Displaydivisibleby2and5(int n) {
	 for(int i=1;i<=n;i++) {
		 if(i%2==0&&i%5==0) {
			 System.out.println(i);
		 }
	 }
 }
}
