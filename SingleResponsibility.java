package Week_6;
import java.util.*;
public class SingleResponsibility {
	public static void main(String args[])
	{
		Student sony =new Student();
		sony.setName("Sony Mathew");
		sony.setregisterno("119CS20001");
		requestbook rb=new requestbook();
		rb.setbookName("java progrmming");
		rb.setduration(2);
		rb.setStudent(sony);
		rb.searchbook();
		Issuebook iborder=new Issuebook(rb);
		iborder.issuebook();
	}
}
class Student{
	private String name;
	private String registerno;
	public String getName() { return name;}
	public void setName(String name) {this.name=name;}
	public String getregisterno() {return registerno;}
	public void setregisterno(String rno)
	{
		this.registerno=rno;
	}
}
class requestbook{
	private Student student;
	private String requestID;
	private String bookName;
	private int duration;
	public Student getStudent() {return student;}
	
	public void setStudent(Student student)
	{
		this.student=student;
	}
	public String getrequestID() {return requestID;}
	public void setrequestID(String bookName)
	{
		Random random=new Random();
		this.requestID=(bookName +"-"+ random.nextInt(500));
	}
	public String getbookName() {return bookName;}
	public void setbookName(String bookName)
	{
		this.bookName=bookName;
		setrequestID(bookName);
	}
	public int getduration() {return duration;}
	public void setduration(int duration)
	{
		this.duration=duration;
	}
	public void searchbook()
	{
		System.out.println("searching book for student-"
	+this.getStudent().getName() +" who has requested "+this.getbookName());
	}
}
class Issuebook{
	private requestbook rb;
	public Issuebook(requestbook rb) {this.rb=rb;}
	public void issuebook()
	{
		System.out.println(" issuing the book");
		System.out.println(
				" with the request id as  "
		+this.rb.getrequestID()+" bieng issued to "
		+this.rb.getStudent().getName());
		System.out.println(" book is to be delivered to: "
		+this.rb.getStudent().getregisterno());
	}
}