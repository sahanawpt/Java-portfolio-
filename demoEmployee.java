package Week_2;
class Employee {
	/* These are instance variables*/
	String empName;
	int empNo;
	float salary;
	String empDesig;
	byte expYrs;
	void setEmployee (String Name, int no, float sal, String des, byte ex)
	{
		empName=Name;
		empNo = no;
		salary=sal;
		empDesig=des;
		expYrs = ex;
	}
	void getEmployee ()
	{ 
		System.out.println(empName+"\t"+empNo+"\t"+empDesig+"\t"+salary+"\t"+expYrs+"\n");
	}
public class demoEmployee{
	public static void main(String args[])
	{
	Employee rahul=new Employee();
	/* Accessing instance variable using set Method */
	rahul.setEmployee ("Rahul",128966,99999.0f, "PM", (byte) 20);
	System.out.println("empName\tempNo\tempDesig\tsalary\texpYrs\n"); rahul.getEmployee();
	/* Accessing instance variable using dot operator */
	Employee rakesh = new Employee(); rakesh.empName = "Rakesh Batra";
	rakesh.empNo=785412;
	rakesh.salary=894576.0f;
	rakesh.empDesig = "Project Lead";
	rakesh.expYrs = (byte) 10;
	rakesh.getEmployee();
	}
}
}