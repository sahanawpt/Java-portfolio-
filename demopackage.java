package emp;
import emp.Employee;
import bonus.issueBonus;
public class demopackage {
	public static void main(String[] args) {
		System.out.println("This program illustrates use of packages...");
		Employee list[]=new Employee [3];
		for (byte i=0;i<list.length;i++) 
			list[i]=new Employee ();
		System.out.println("\n۱*******************************");
		System.out.println("empId\tempName\texpYears\tsalary");
		System.out.println("**********************************");
		for (byte i=0;i<list.length;i++) {
			issueBonus.issueEmployeeBonus (list[i]);
			list[i].getEmployee();
			}
			System.out.println("**********************************");
	}
}
