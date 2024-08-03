package Collections;  

import java.util.*;

public class Stacks {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Stack<Integer> in = new Stack<>();
		
		for(int i=0;i<10;i++)
		{
			in.push(i);
			
		}
		System.out.println(in);
		
		
		
		Stack<Integer> stk = new Stack<>();
		
		stk.push(1);
		stk.push(2);
		stk.push(3);
		stk.push(4);
		stk.push(5);
		stk.push(6);
		
		System.out.println(stk);
		
		//Stack<String> s = new Stack<>();
		for(int i : stk )
		{
			System.out.println(i);
		}
		
		stk.pop();
		System.out.println(stk);
		stk.peek();
		System.out.println(stk);
		
	}
	    
	    
}
	    


