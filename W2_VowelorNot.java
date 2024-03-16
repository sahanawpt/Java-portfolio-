package Week_2;
public class W2_VowelorNot {
	public static void main(String[] args) {
		System.out.println("This program checks whether the given character is vowel or not");
		char ch='A';
		if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
			System.out.println("The given character is vowel");
		else if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			System.out.println("The given character is vowel");
		else
			System.out.println("The given character is not vowel");
	}

}