package codingBlocks;

import java.util.Scanner;

public class SingleNumber {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc =  new Scanner(System.in);
		int arr[] =new int[5];
		System.out.println("Enter the array value:");
		{
			for(int i = 0; i<arr.length;i++)
			{
				 arr[i] = sc.nextInt();
			}
		}
		
		int xor = arr[0];
		for(int i =1; i<arr.length;i++)
		{
			xor = xor^arr[i];
		}
		System.out.println(xor);

	}

}
