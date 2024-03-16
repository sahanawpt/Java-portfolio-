package Week_02;
class Student {
	String Name;
	String RegNo;
	float result;
	static byte sem=4;
    Student(){
    	Name=null;
    	RegNo=null;
    	result=35.0f;
    }
    Student(String n,String r,float res){
    	Name=n;
    	RegNo="119CS21002";
    	result=res;	
    }
    Student(String n,String r){
    	Name=n;
    	RegNo=r;
    	result=75.0f;
    }
    Student(Student sobj,Student sobj1,Student sobj2){
    	Name=sobj.Name;
    	RegNo=sobj1.RegNo;
    	result=sobj2.result;
    }
    void getStudent() {
    	System.out.println("Student name is... "+Name);
    	System.out.println("Student regNo is... "+RegNo);
    	System.out.println("Student result is... "+result);
    	System.out.println("Student studing in... "+sem);
    	System.out.println("Student Grade is..."+Grade(result));
    }
    boolean Grade(float result) {
    	if(result>=75 && result<100)
    		System.out.println("Passed in distinction");
    	else if(result>=60 && result<75)
    		System.out.println("Passed in first class");
    	else if(result>=50 && result<60)
    		System.out.println("Passed in second class");
    	else if(result>=35 && result<50)
    		System.out.println("Pass");
    	else if(result<=35 && result>0)
    		System.out.println("Fail");
    	else
    		System.out.println("Invalid input");
    	return true;
    }
}
public class demoStudentResult {

	public static void main(String[] args) {
		Student nikil=new Student();
		nikil.getStudent();
		Student Anusha=new Student("Anusha","119CS21003",45);
		Anusha.getStudent();
		Student gagana=new Student("Gagana","119CS21004",90);
		gagana.getStudent();
	}

}