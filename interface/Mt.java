package Interfaces;

public class Mt extends Bikes implements Vehicle,twowheelers{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mt veh = new Mt();
		veh.Service();
		veh.paint();
		veh.petrol();
		veh.types();

	}
	
	
public void petrol()
	{
		System.out.println("15ltrs capacity");
	}
	
public void Service()   //interface vehicle
{
	System.out.println("Free Service");
}


@Override
public void paint() //interface vehicle
{
	
	System.out.println("black");
	
}


@Override
public void types() {  //interface twowheelers
	System.out.println("Bikes,bicycles");
	
}

}
