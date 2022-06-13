package Regex;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Regex2 {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		String words =  "abcaabbcc";
		Pattern p = Pattern .compile("a");
		Matcher m = p.matcher(words);
		while(m.find())
		{
			System.out.println(m.group() + " Starts " + m.start());
		}
		
	}

}
