package Maths;
import java.util.Scanner;
public class AddDigits {
	public static int adddigits(int num)
	{
		while(num>9)
		{
	    int res =0;
		while(num >0)
			{
		 res += num %10;
		 num  = num /10;
		}
		num = res;
		}
		return num;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc = new Scanner(System.in);
      System.out.println("enter the number:");
      int num = sc.nextInt();
      System.out.println(adddigits(num));
      
	}

}
