package Week5;
import java.util.Scanner;
public class Grade{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in); 
		System.out.println("Enter marks");
		int result=sc.nextInt();
		char grade;
		if(result>=90)
		{
			grade='A';
		}
		else if (result>=80)
		{
			grade='B';
		}
		else if (result>=70)
		{
			grade='C';
		}
		else if (result>=60)
		{
			grade='D';
		}
		else {
			grade='F';
			System.out.println("Failed");
			//break:
		}
		System.out.println("grade of the student is "+grade);
	}
}