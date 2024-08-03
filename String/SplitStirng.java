package String;

public class SplitStirng {
	public static void main(String args[])
	{
		String str[]  = { "alice and bob love leetcode", "i think so too", "this is great thanks very much"} ;
		int maxi=0;
		int length=0;
		for (int i = 0;i<str.length;i++)
		{
			String words = str[i];
			length = Math.max(words.split(" ").length,maxi);
			maxi = length;
		}
		System.out.println(maxi);
	   
}
}