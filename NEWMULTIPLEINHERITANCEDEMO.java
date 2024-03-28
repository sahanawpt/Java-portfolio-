package week8;
interface allowance
{
	final double dearnessAllow=0.45;
	final double houseRentAllow=0.30;
	final double cityAllow=400.00;
	void calculategross();
}
class Employee
{
	double basicSalary,grossSalary;
	String empName;
	long empNumber;
	Employee(String name,long no, double sal){
		empName=name;
		empNumber=no;
		basicSalary=sal;
	}
	void displayEmployeeDetails() {
		System.out.println("**********************************");
		System.out.println("Employee name is\t:\t"+empName);
		System.out.println("Employee number is\t:\t"+empNumber);
		System.out.println("His basic salary is\t:\t"+basicSalary);
		System.out.println("His Gross Salary is \t:\t"+grossSalary);
		System.out.println("**********************************");
	}
}
class payRoll extends Employee implements allowance{
	payRoll(String name,long no,double sal){
		super(name,no,sal);
		calculateGross();
	}
	
	public void calculateGross() {
		grossSalary=basicSalary+(basicSalary*dearnessAllow)+(basicSalary*houseRentAllow)+(cityAllow);
		
	}
}

public class NEWMULTIPLEINHERITANCEDEMO {

	public static void main(String[] args) {
		payRoll virat=new payRoll("virat sharma",128966,45678.0d);
		virat.displayEmployeeDetails();
		payRoll suresh=new payRoll("suresh sing",129966,25678.0d);
		suresh.displayEmployeeDetails();
	}

}