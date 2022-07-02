package String;

public class Strnum {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String s =  "Thiruvidaimarudur 612104";
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>='0')
				if(s.charAt(i)<='9')
					System.out.print(s.charAt(i));
		}
	}


}
