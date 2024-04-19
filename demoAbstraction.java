package week_10;
abstract class myCalculator{
	abstract void performArithmetic(int operand1, int operand2);
}
class performAddition extends myCalculator{
	void performArithmetic(int num1, int num2){
		System.out.println("The sum of two numbers is..."+(num1+num2));
	}
}
class performSubstraction extends myCalculator{
	void performArithmetic(int num1, int num2){
		System.out.println("The difference of two numbers is..."+(num1-num2));
	}
}
class performMultiplication extends myCalculator{
	void performArithmetic(int num1, int num2){
		System.out.println("The product of two numbers is..."+(num1*num2));
	}
}
class performDivision extends myCalculator{
	void performArithmetic(int num1, int num2){
		System.out.println("The remainder after division is..."+(num1%num2));
	}
}
public class demoAbstraction{
	public static void main(String[] args){
		performAddition sum = new performAddition();
		sum.performArithmetic(20, 30);
		performSubstraction diff = new performSubstraction();
		diff.performArithmetic(120, 30);
		performMultiplication product = new performMultiplication();
		product.performArithmetic(12, 33);
		performDivision rem = new performDivision();
		rem.performArithmetic(1213, 33);
	}
}