package Interfaces;

public class Company implements EmployeeRules,FamilyRules
{

	public static void main(String[] args) 
{
		// TODO Auto-generated method stub
		Company c = new Company();
		c.relocate();
		c.workinghours();
	    System.out.println(Company.leave); // calling the variables using class name
	    System.out.println(Company.salary); //class name
	    System.out.println(EmployeeRules.salary); // Calling the variable using interface name
	    System.out.println(EmployeeRules.leave);//interface name
	    
	    FamilyRules father =  new Company();//interface name with that reference pointing to the implements class
	    //Dynamic binding//
	    father.takecare(); 
	}
	public void workinghours()
	{
		System.out.println("40hrs");
	}
	public void relocate()
	{
	System.out.println("Yes");	
	}
	public void takecare()
	{
		System.out.println("Caring family");
	}
	public void help()
	{
		
	}
	@Override
	public void ObeyOrder() {
		// TODO Auto-generated method stub
		
	}
}
