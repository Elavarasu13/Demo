package Strings;

public class StringLiterals2 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String s1 =  new String ("Java");
		String s2 =  s1;
		System.out.println(s2);
		 s1 = new String("Python");
		 s2 =  new String ("Python");
		 if(s1 == s2)
		 {
			 System.out.println("==");
		 }
		 else {
			 System.out.println("Not=");
		 }
		 if(s1.equals(s2))
		 {
			 System.out.println("Equals");
		 }
		 else { 
			 System.out.println("Not Equals");
		 }

	}

}
