package Week7;
public class arrayofstudents {
	public static void main (String[]args)
	{
		Student list[]=new Student [5];
		/*Initialize array of objects individually*/
		 for(int i=0;i<list.length;i++)
			 list [i]=new Student();
		 System.out.println("\n***********************************");
		 System.out.println("R.No\sName\t\tCourse\tCIE-I\tCIE-II\tCIE-III\tAvg");
		 System.out.println("\n***********************************");
		 for (int i=0;i<3;i++)
			 list[i].displayStudentDetails();
		 System.out.println("\n***********************************");
	}
}












