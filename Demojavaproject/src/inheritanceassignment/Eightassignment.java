package inheritanceassignment;
class Company
{
 void showname(String companyname)
 {
  System.out.println("company name:"+companyname);
 }
}
class Recruiter extends Company
{
 Recruiter(String recruitingcomp)
 {
  super.showname(recruitingcomp);
 }

 void showname(String recruitingcompany)
 {
  System.out.println("company name in sub class:"+recruitingcompany);
 }
}
class Employes extends Recruiter
{
 Employes(String name)
 {
  super(name);
  super.showname(name); 
 }
 void showname(String employeename)
 {
  System.out.println("Employee name is :"+employeename);
 }
}
public class Eightassignment {
 public static void main(String[] args) {
  Employes obj=new Employes("TCS");
  obj.showname("Rohit");
 }
}


