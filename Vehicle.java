package week8;
class Vehicle{
	protected String vehicleType;
	private int maxSpeed;
	Vehicle(int mSpeed)
	{
		maxSpeed=mSpeed;
	}
	public void speed()
	{
		System.out.println("It can cruise up to maximum speed of "+maxSpeed+"km/hour");
	}
}
class Toyota extends Vehicle
{
	protected String brand;
	Toyota (int mSpeed)
	{
		super (mSpeed);
	}
}