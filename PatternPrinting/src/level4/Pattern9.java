package level4;

public class Pattern9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++){
			//no of $'s
			for(int j=5;j>=i;j--)
			{
			System.out.print(" ");
			}
			//no of *'s
			System.out.print("*****");
			
			System.out.println();
		
			
	}
		
		for(int i=1;i<=5;i++){
			//no of spaces
			for(int j=1;j<=i;j++)
			{
			System.out.print(" ");
			}
			
			System.out.print("*****");
			
			System.out.println();
			
	}

}
}