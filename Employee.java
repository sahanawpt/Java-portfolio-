package week3;

public class Employee {
	String empName;
	int empNo;
	String empDesig;
	byte expYrs;
	double basicSalary;
	double netSalary;
	double grossSalary;
	double dearnessAllowance;
	double HRA;
	double PA;
	double IT;
	Employee()
	{
		empName=null;
		empNo=0;
		empDesig=null;
		expYrs=0;
		basicSalary=0.0d;
	}
	Employee(String name,int no,String des,byte ex,double basicsalary)
	{
		empName=name;
		empNo=no;
		empDesig=des;
		expYrs=ex;
	    basicSalary=basicsalary;
	}
	Employee(Employee obj1,Employee obj2)
	{
		empName=obj1.empName;
		empNo=obj2.empNo;
		empDesig=obj1.empDesig;
		expYrs=obj2.expYrs;
		basicSalary=obj2.basicSalary;
	}
	void getemployee()
	{
		dearnessAllowance=basicSalary*0.40;
		HRA=basicSalary*0.25;
		PA=basicSalary*10;
		grossSalary=basicSalary+dearnessAllowance+HRA+PA;
		
		IT=basicSalary*10;
		netSalary=grossSalary-IT;
		
		System.out.println(empName+"\t"+empNo+"\t"+empDesig+"\t\t"+expYrs+"\t"+basicSalary+"\t\t"+grossSalary+"\t\t"+netSalary);
	}
	public static void main(String[] args){
		System.out.println("empName\tempNo\tempDesig\texpYrs\tbasicSalary\tgrossSalary\tnetSalary");
		Employee rakesh=new Employee( );
		rakesh.getemployee();
		Employee rahul=new Employee("Rahul",100,"PM",(byte)10,1000.0d);
		rahul.getemployee();
		Employee ramya=new Employee(rakesh,rahul);
		ramya.getemployee();
	}


}
