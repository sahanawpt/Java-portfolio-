package Week7;
import java.io.InputStreamReader;
import java.io.BufferedReader;
public class Student {
	String name , course ;int rno ;float ia1 , ia2,ia3,avg;
	Student()
	{
		try {
	
				InputStreamReader isr = new InputStreamReader (System.in);
				BufferedReader br = new BufferedReader(isr);
				System.out.println("Enter Roll number of Student.");
				rno = Integer.parseInt(br.readLine());
				System.out.println("Enter Name of Student.");
				name = br.readLine();
				System.out.println("Enter Course of Student.");
				course = br.readLine();
				System.out.println("Enter First CIE score of the Student:");
				ia1 = Float.parseFloat(br.readLine());
				System.out.println("Enter Second CIE score of the student:");
				ia2 = Float.parseFloat(br.readLine());
				System.out.println("Enter Third CIE score of the student:");
				ia3 = Float.parseFloat(br.readLine());
				avg = (ia1+ia2+ia3)/3;
			}
		catch(Exception e)
		{
			System.out.println("Run Time Error occured while reading intput...");e.printStackTrace();
		}
	}
	void displayStudentDetails()
	{
		System.out.println(rno+"\t"+name+"\t\t"+course+"\t"+ia1+"\t"+ia2+"\t"+ia3+"\t"+avg);
	}
}