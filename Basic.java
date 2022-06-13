package Regex;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Basic {
	public static void main(String args[])
	{
		String s = "Elavarasu";
		Pattern p = Pattern.compile("Ela");
		Matcher m = p.matcher(s);
		while(m.find()) {
			System.out.println(m.group() +  "\nends " + m.end());
		}
		
	}

}
