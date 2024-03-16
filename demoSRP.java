package Week06;
import student.Student;
import issuebook.IssueBook;
import requestbook.*;
class demoSRP {
    public static void main(String[] args) {
        Student sony = new Student();
        sony.setname("Sony Mathew");
        sony.setregisterNO("119cs22048");
        requestBook rb = new requestBook();
        rb.setbookName("java programming");
        rb.setduration(2);
        rb.setStudent(sony);
        rb.searchBook();
        IssueBook ibOrder = new IssueBook(rb);
        ibOrder.issuebook();
    }
}