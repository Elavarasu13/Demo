package Maths;

public class BitwiseXor {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int n = 5;
		int s = 0;
		int res  = s;
		for(int i = 1;i<n;i++)
		{
			res = res^(s+2*i);
			System.out.println(res);
		}

	}

}
