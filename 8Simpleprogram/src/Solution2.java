import java.util.*;
public class Solution2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter a number to print which are divisible by 2");
      int n= scan.nextInt();
      Displayeven(n);
         
	}
 public static void Displayeven(int n) {
	 for(int i=1;i<=n;i++) {
		 if(i%2==0) {
			 System.out.println(i);
		 }
	 }
 }
}
