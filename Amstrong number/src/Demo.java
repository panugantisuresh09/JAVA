class Demo{
	static int getCount(int num) {
		int Count =0;
		while(num!=0) {
			int digit=num%10;
			Count++;
			num= num/10;
		}
		return Count;
	}
	static int getSum(int num,int power) {
		int sum=0;
		if(num==0) {
			return 0;
		}
		while(num!=0) {
			int digit=num%10;
			int value=(int)Math.pow(digit,power );
					sum=sum+value;
			        num=num/10;
		}
		return sum;
	}
}