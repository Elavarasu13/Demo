package Exception;

import java.util.Scanner;

public class Finally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Finally f =  new Finally();
		f.calculate();

	}

	private void calculate() {
		// TODO Auto-generated method stub
		Scanner sc =  new Scanner(System.in);
		int a = sc.nextInt();
		int b =  sc.nextInt();
		try {
			System.out.println(a/b);
		}
		finally {
			System.out.println("Finish the method");
			// if exception is present or not finally block will excecute once
            
		}
		
	}

}
