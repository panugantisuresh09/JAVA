import java.util.Scanner;
public class Solution4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter a number to print which are divisible by 5");
      int n= scan.nextInt();
      Displaydivisibleby5(n);
         
	}
 public static void Displaydivisibleby5(int n) {
	 for(int i=1;i<=n;i++) {
		 if(i%5==0) {
			 System.out.println(i);
		 }
	 }
 }
}
