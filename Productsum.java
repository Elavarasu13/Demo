package Maths;

public class Productsum {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int num = 234;
		int rem = 0;
		int pd =1;
		int sum = 0;
		while(num!=0)
		{
			rem = num %10;
			pd =  pd*rem;
			sum = sum+rem;	
			num  = num/10;
		}
		System.out.println(pd);
		System.out.println(sum);
		int result = pd - sum;
		System.out.println(result);
	}
}
