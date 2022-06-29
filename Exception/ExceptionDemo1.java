package Exception;

import java.util.Scanner;

public class ExceptionDemo1 {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		ExceptionDemo1 ed =  new ExceptionDemo1();
		ed.calculate(a,b);

	}

	private void calculate(int a, int b) 
	{
		// TODO Auto-generated method stub
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		
		/*
		Exception in thread "main" java.lang.ArithmeticException: / by zero
		at Exception.ExceptionDemo1.calculate(ExceptionDemo1.java:24)
		at Exception.ExceptionDemo1.main(ExceptionDemo1.java:14)
		*/

		
	}

}
