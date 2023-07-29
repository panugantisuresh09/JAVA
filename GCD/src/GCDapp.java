import java.util.*;
public class GCDapp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner scan = new Scanner (System.in);
   System.out.println("Enter any two numbers to find GCD");
   int m= scan.nextInt(); 
   int n= scan.nextInt();
   GCD gcd = new GCD();
   int res= gcd.findGCD(m,n);
   System.out.println("GCD OF "+m+"AND "+n+"IS "+res);
   }

}
