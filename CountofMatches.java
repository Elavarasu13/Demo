package Maths;

public class CountofMatches 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int n =7;
		 int matches= 0;
	        while(n!=1)
	        {
	        if(n%2 ==0)
	        {
	            matches += n/2;
	            n = n/2;
	        }
	            else{
	                matches += (n-1)/2;
	                n = (n-1)/2+1;
	            }
	        }
		System.out.println("Number of matches:" +matches);
			
	}
}
