package issuebook;
import student.Student;
import requestbook.requestBook;
public class IssueBook {
    private requestBook rb;

    public IssueBook(requestBook rb) {
        this.rb = rb;
    }

    public void issuebook() {
        System.out.println("issuing the book");
        System.out.println("with request id as " + this.rb.getrequestID() + " being issued to " + this.rb.getStudent().getname());
        System.out.println("book is to be delivered to: " + this.rb.getStudent().getregisterNo());
    }
}