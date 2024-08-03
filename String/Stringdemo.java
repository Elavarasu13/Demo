package String;

public class Stringdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stringdemo S = new Stringdemo();
		String[] names = {"Ela","Kavs","ela"};
		S.JoinWords(names);

	}

	private void JoinWords(String[] names) {
		// TODO Auto-generated method stub
		for(String name:names)
		{
			System.out.println(name);
		}
		
	}

}
