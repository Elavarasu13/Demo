package Maths;
import java.util.Scanner;

public class Numberofsteps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =  new Scanner(System.in);
		System.out.println("enter the number:");
		int num = sc.nextInt();
		int count=0;
		while(num != 0)
		{
      if(num %2 == 0)
      {
    	  num = num /2;
    	  count++;
      }
      else if(num % 2 != 0)
      {
    	  num = num-1;
    	  count++;
      }
	}
		System.out.println(count);
	}
}
