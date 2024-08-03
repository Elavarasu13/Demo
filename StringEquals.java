package Strings;

public class StringEquals {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String s1 =  new String("Ela"); //Heap
		String s2 ="Ela"; //Scp  
		//(if string s2 = s1 ---> its equals bcz s2 pointing to heap memory)
		// s2 = "Ela"; //bcz s2 create new meomry in scp for value ela.
		// s1 = "python"; // bcz its replace s1 vaue
		if(s1==s2)
		System.out.println("==");
		else
			System.out.println("not =");
		
		if(s1.equals(s2)) 
		{
			System.out.println("Eqauls");
			
		}
		else {
			System.out.println("Not Equals");
		}
		

	}

}
