package week2;
class values
{
	byte Byte;
	int integer;
	long Long;
	short Short;
	boolean Boolean;
	String string;
	float Float;
	char ch;
	double Double;
	void getvalues()
	{
		System.out.println("The Default value of primitive datatype Byte: "+ Byte);
		System.out.println("The Default value of primitive datatype Integer: "+ integer);
		System.out.println("The Default value of primitive datatype long: "+ Long);
		System.out.println("The Default value of primitive datatype Short: "+ Short);
		System.out.println("The Default value of primitive datatype Boolean: "+Boolean);
		System.out.println("The Default value of primitive datatype string: "+ string); System.out.println("The Default value of primitive datatype Float: "+ Float);
		System.out.println("The Default value of primitive datatype char: "+ ch);
		System.out.println("The Default value of primitive datatype double: "+ Double);
	}
}
public class defaultvalues
{
	public static void main(String[] args)
	{
		values var=new values();
		var.getvalues();
	}
}

