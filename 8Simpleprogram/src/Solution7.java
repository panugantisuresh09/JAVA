
import java.util.Scanner;
public class Solution7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner scan = new Scanner(System.in);
      System.out.println("untill where you need prime numbers");
      int n= scan.nextInt();
      for (int i=3;i<=n;i++) {
    	  int res = checkprime(i);
    	  if (res!=0) {
    		  System.out.println(res);
    		  
    	  }
      }
      
         
	} 
 public static int checkprime(int n) {
	 for(int i=2;i<n;i++) {
		 if(n%i==0) {
			 return 0;
		 }
	 }
	 return n;
 }
} 
