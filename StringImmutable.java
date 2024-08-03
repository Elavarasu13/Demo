package Strings;

public class StringImmutable {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String s1 = new String("Jav");
		String s2 = "Java";
		s1 = s1 + "a"; // immutable Bcz We cannot change or modified the string in memory it create another memory and s1 points the new s1;

		System.out.println(s2.hashCode());
		if(s1 == s2)
			System.out.println("==");
		else
			System.out.println("Not=");
		if(s1.equals(s2))
		{
			System.out.println("equals");
		}
		else
		{
			System.out.println("Not Equals");
		}

	}

	private static char[] getAddress(String s1) {
		// TODO Auto-generated method stub
		return null;
	}

}
