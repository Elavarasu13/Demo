package Maths;

public class Oddlength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Given an array of positive integers arr, calculate the sum of all possible odd-length subarrays.
         // A subarray is a contiguous subsequence of the array.
		//Return the sum of all odd-length subarrays of arr.
    
		int arr[] = { 1,4,2,5,3};
		int res =0;
		int n = arr.length;
         for(int i =0;i<arr.length;i++)
         {
        	int end = i+1; 
        	System.out.println("end:"+end);
        	int start = n-1;
        	System.out.println("start:"+start);
        	int total = start * end;
        	System.out.println("Total:"+total);
        	int odd = total/2;
        	if(total %2 == 1)
        	{
        		odd++;
        	}
        	System.out.println("odd is:"+odd);
        	res += odd*arr[i];
        	System.out.println("res is:"+res);
         }
		 

	}

}
