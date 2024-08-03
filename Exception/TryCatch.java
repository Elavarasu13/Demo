package Exception;
import java.util.Scanner;

public class TryCatch {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		TryCatch tc =  new TryCatch();
		tc.calculate();
	}

	private void calculate() {
		// TODO Auto-generated method stub
		Scanner sc =  new Scanner(System.in);
		int a = sc.nextInt();
		int b =  sc.nextInt();
		try {
			System.out.println(a/b);
		}
		catch(Exception e) {
			System.out.println("Check the divisor");
			calculate();
			
		}
	
	}

}
