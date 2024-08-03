package Strings;

public class StringImmutable2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 =  "Jav";
		String s2 = "Java";
		s1 = s1 + "a";
		 System.out.println(s1.hashCode());
		 System.out.println(s2.hashCode());
		 
		 if(s1 == s2)
		 {
			 System.out.println("==");
		 }
		 else {
			 System.out.println("Not equals");
			
		 }
		 if(s1.equals(s2))
		 {
			 System.out.println("Equals");
		 }
		 else
		 {
			 System.out.println("Not Equals");
		 }

	}

}
