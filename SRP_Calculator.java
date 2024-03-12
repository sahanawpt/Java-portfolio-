package Week_6;
import java.util.Scanner;
public class SRP_Calculator {
	public static void main(String[] args) {
		double result = 0;
		read_Input_Values input = new read_Input_Values(); 
		switch(input.operation) {
			case '+':
				result=Addition.sum(input);break;
			case'-':
				result=Substraction.difference (input); break;
			case'*':
				result=Multiplication.product(input);break;
			case'/':
				result=Division.quotient (input);break;
			case'%':
				result=Modulus.remainder (input); break;
			default:
				System.out.println("Enter valid choice..."); break;
		}
		if (result>0)System.out.println("The result is..."+result);
	}
}
class read_Input_Values{
	double numl, num2;
	char operation;
	read_Input_Values() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any non zero number...");
		numl = sc.nextDouble();
		System.out.println("Enter any non integer number...");
		num2 = sc.nextDouble();
		System.out.println("Enter your choice...");
		operation = sc.next().charAt(0);
		sc.close();
	}
}
class Addition{
	public static double sum(read_Input_Values ip) {
		return(ip.numl + ip.num2);
	}
}
class Substraction{
	public static double difference (read_Input_Values ip) {
		return(ip.numl - ip.num2);
	}
}
class Multiplication{
	public static double product (read_Input_Values ip) {
		return(ip.numl * ip.num2);
	}
}
class Division{
	public static double quotient (read_Input_Values ip) {
		return(ip.numl / ip.num2);
	}
}
class Modulus {
	public static double remainder (read_Input_Values ip) {
		return(ip.numl % ip.num2);
	}
}