package week8;
import Employee.*;
class payRoll extends Employee implements allowance{
	payRoll (String name, long no, double sal){
		super (name, no, sal);
		calculateGross();
	}
	public void calculateGross()
	{
		grossSalary=basicSalary +(basicSalary+dearnessAllow)+(basicSalary*houseRentAllow)+(cityAllow);
	}
}
class multipleInheritanceDemo
{
	public static void main(String args[])
	{
		payRoll virat=new payRoll ("Virat Sharma",128966,45678.0d);
		virat.displayEmployeeDetails();
		payRoll suresh=new payRoll ("uresh Singh", 329966,25678.0d);
		suresh.displayEmployeeDetails();
	}
}