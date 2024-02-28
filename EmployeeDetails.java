package week2;

class Employee{
	String empName;
    int empNo;
    byte expYrs;
    String gender;
    double basicSalary;
    double bonus;
    double netSalary;
    void setEmployee(String Name, int no, String sex, byte ex, double basicsalary){
    	empName=Name;
        empNo=no;
        gender=sex;
        expYrs=ex;
        basicSalary=basicsalary;
    }
    void getEmployeeDetails()
    {
    	if(gender=="female"){
    		bonus=basicSalary*10/100;
            netSalary=basicSalary+bonus;
            System.out.println(empName+"\t"+empNo+"\t"+gender+"\t"+expYrs+"\t" +basicSalary+"\t"+bonus+"\t"+netSalary+"\n");
        }
        else {
        	netSalary=basicSalary;
    	    System.out.println(empName+"\t"+empNo+"\t"+gender+"\t"+expYrs+"\t" +basicSalary+"\t"+bonus+"\t"+netSalary+"\n");
        }
    }
}
public class EmployeeDetails {

	public static void main(String[] args) {
		Employee Rahul=new Employee();
		Rahul.setEmployee("Rahul", 128966,"male", (byte)20,100000.0d);
		System.out.println("empName\tempNo\tgender\texpYrs\tbasicSalary\tbonus \tnetSalary\n");
		Rahul.getEmployeeDetails();
		Employee Rakesh=new Employee();
		Rakesh.setEmployee("Rakesh", 7851161,"male", (byte)25,200000.0d);
		Rakesh.getEmployeeDetails();
		Employee madhu=new Employee();
		madhu.setEmployee("Madhu", 7851161,"female", (byte)25,150000.0d);
		madhu.getEmployeeDetails();
	}

}
