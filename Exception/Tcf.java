package Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Tcf {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc =  new Scanner(System.in);
		try {
		System.out.println("Enter the account number");
		int a = sc.nextInt();
		System.out.println("Enter the pin number");
		int b = sc.nextInt();
		int arr[] =  new int[5];
		for(int i=0;i<10;i++)
		{
			arr[i] = 2000;
		}
		}
		catch(InputMismatchException ime) 
		{
			System.out.println("Enter the Correct Pin or Account No");
		}
		catch(Exception e) 
		{
		System.out.println("Check the array Length");	
		}
		finally 
		{
			System.out.println("End the process");
		}
	}

}
