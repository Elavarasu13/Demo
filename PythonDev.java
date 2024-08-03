package Abstraction;

public class PythonDev extends Worker {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		PythonDev p = new PythonDev();
		p.work();
		

	}
	public void work()
	{
		System.out.println("Developed a project using python");
		//in this case method overriding(Polymorphism) is compulsory because 
		// abstract class extends another class using inheritance then we use
		//the abstract method in child class and we create the object
		
	}

}
