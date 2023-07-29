import java.util.*;
public class Amstrongapp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner scan = new Scanner(System.in);
       System.out.println("Enter a number ");
	   int num= scan.nextInt();
       int power= Demo.getCount(num);
       int res= Demo.getSum(num, power);
       if(num==res) {
    	   System.out.println("Entered Number "+num+" is amstrong");
    	   
       }
       else {
    	   System.out.println("Entered Number "+num+" is not amstrong");
       }
	
	}
	

}
