import java.util.*;
public class Seriesprinter{
   public static void main(String[]args) {
	   Scanner scan = new Scanner(System.in);
	   System.out.println("Enter N to print the number");
	   int n= scan.nextInt();
	   Series series= new Series();
	   series.fibonacciSeries(n);
	   
   }
}
