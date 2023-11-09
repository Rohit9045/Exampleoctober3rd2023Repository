package noargsconstructor;

class Employee
{
	int EmployeeId;
	String EmployeeName;
	int phoneNumber;
	int Salary;
	String gender;
    Employee()
    {
       EmployeeId = 01;
       EmployeeName = "Rohit";
       phoneNumber = 944925818;
       Salary = 25000;
       gender = "Male";
        System.out.println("Employeeid:"+EmployeeId);
		System.out.println("Employeename:"+EmployeeName);
		System.out.println("phonenumber:"+phoneNumber);
		System.out.println("Salary:"+Salary);
		System.out.println("gender:"+gender);
		System.out.println("------------------------------------------");
	}
}
class Department
{
	int Departmentid;
	String Departmentname;
	String Floor;
	Department()
	{
	Departmentid = 01;
	Departmentname = "Accounts";
	Floor = "Forth";
	System.out.println("Departmentid:"+Departmentid);
	System.out.println("Departmentname:"+Departmentname);
	System.out.println("Floor:"+Floor);
	System.out.println("------------------------------------------");
	}
}
class Insurance
{
	int Insuranceid;
	String Insurancename;
	int year;
	Insurance()
      {
         Insuranceid = 01;
         Insurancename = "Lifeinsurance";
         year = 2023;
         System.out.println("Insuranceid:"+Insuranceid);
         System.out.println("Insurancename:"+Insurancename);
         System.out.println("year:"+year);
         System.out.println("------------------------------------------");
      }
}
public class Demo1NoArgs {

	public static void main(String[] args) {
		Employee obj= new Employee();
		Department obj2 = new Department();
		Insurance obj3 = new Insurance();
	}

}
