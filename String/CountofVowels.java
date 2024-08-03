package String;

public class CountofVowels {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String s = "education";
		int count =0;
		for(int i =0;i<s.length();i++)
		{
			char s1 = s.charAt(i);
			switch(s1)
			{
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				count++;
			}
		}
		if(count == 0)
			System.out.println("Not vowels");
		else {
System.out.println("Count of Vowels are:"+count);
		}
		}

}
