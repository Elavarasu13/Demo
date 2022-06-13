package Regex;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Regex3 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String words = "Tamil nadu";
		Pattern  p = Pattern.compile("^T");
		Matcher m = p.matcher(words);
		while(m.find())
		{ 
			System.out.println(m.group() + "Starts"  + m.start());
		}

	}

}
