package week8;
class Fortuner extends Toyota
{
	private String model;
	Fortuner (String vType, int ms, String br, String mod) {
		super (ms);
		vehicleType=vType;
		model=mod;
		brand = br;
	}		
	public void display()
	{
		System.out.println("The name of the vehicle is "+model); 
		System.out.println("It's brand is "+brand); 
		System.out.println("The type of vehicle is "+vehicleType); 
		this.speed();
	}
}
public class DemoMultiLevel{
	public static void main(String args[]) {
		Fortuner sigma=new Fortuner ("Four Wheeler", 280, "Toyota", "Fortuner"); 
		sigma.display();
	}
}