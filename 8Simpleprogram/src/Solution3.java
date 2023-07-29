import java.util.Scanner;
public class Solution3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter a number to print which are divisible by 3");
      int n= scan.nextInt();
      Displayodd(n);
         
	}
 public static void Displayodd(int n) {
	 for(int i=1;i<=n;i++) {
		 if(i%3==0) {
			 System.out.println(i);
		 }
	 }
 }
}
