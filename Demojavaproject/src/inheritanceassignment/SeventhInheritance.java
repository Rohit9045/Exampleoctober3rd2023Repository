package inheritanceassignment;
class Students
{
 Students(String firstname,String email,int rollno)
 {
  System.out.println("First Name:" +firstname);
  System.out.println("Roll No:" +rollno);
  System.out.println("Email:" +email);
 }
}
class Library1 extends Students
{
 String bookname;
 int bookid;
 Library1(String firstname,String email,int rollno,String bookname,int bookid)
 {
  super(firstname,email,rollno);
  this.bookname=bookname;
  this.bookid=bookid;
  System.out.println("Book Name:" +bookname);
  System.out.println("Book ID:"+ bookid);
 }
}
class Sports1 extends Library1
{
 String sportname;
 Sports1(String firstname,String email,int rollno,String bookname,int bookid,String sportname)
 {
  super(firstname,email,rollno,bookname,bookid);
  this.sportname =  sportname;
  System.out.println("Sport Name:" +sportname);
 }
}
class Canteen1 extends Students
{
 String canteenname;int canteenid;
 Canteen1(String firstname,String email,int rollno,String canteenname,int canteenid)
 {
  super(firstname,email,rollno);
  this.canteenname = canteenname;
  this.canteenid = canteenid;
  System.out.println("CanteenName:" + canteenname);
  System.out.println("CanteenID:" + canteenid);
 }
}
public class SeventhInheritance {
 public static void main(String[] args) {

  Sports1 o =new Sports1("Rohit","Rohit@gmail.com",500,"turbomachine",900,"Foot ball");
  Canteen1 o1 =new Canteen1("Rishab","Rishu@gmail.com",506,"suruchifoods",601);
 }
}

