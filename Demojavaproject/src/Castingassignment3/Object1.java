package Castingassignment3;
class Employee
{
	int Employeeid;
	String Employeename;
	int phoneNumber;
	int Salary;
	String gender;
}
class Department
{
	int Departmentid;
	String Departmentname;
	String Floor;
}
class Insurance
{
	int Insuranceid;
	String Insurancename;
	int year;
}
public class Object1 {

	public static void main(String[] args) {
		Employee obj1 = new Employee();
		obj1.Employeeid = 01;
		obj1.Employeename = "Rohit";
		obj1.phoneNumber = 944925818;
		obj1.Salary = 25000;
		obj1.gender = "Male";
		System.out.println("Employeeid:"+obj1.Employeeid);
		System.out.println("Employeename:"+obj1.Employeename);
		System.out.println("phonenumber:"+obj1.phoneNumber);
		System.out.println("Salary:"+obj1.Salary);
		System.out.println("gender:"+obj1.gender);
		System.out.println("------------------------------------------");
		obj1.Employeeid = 02;
		obj1.Employeename = "Rishab";
		obj1.phoneNumber = 944926485;
		obj1.Salary = 10000;
		obj1.gender = "Male";
		System.out.println("Employeeid:"+obj1.Employeeid);
		System.out.println("Employeename:"+obj1.Employeename);
		System.out.println("phonenumber:"+obj1.phoneNumber);
		System.out.println("Salary:"+obj1.Salary);
		System.out.println("gender:"+obj1.gender);
		System.out.println("------------------------------------------");
		obj1.Employeeid = 03;
		obj1.Employeename = "ganesh";
		obj1.phoneNumber = 855925818;
		obj1.Salary = 24000;
		obj1.gender = "Male";
		System.out.println("Employeeid:"+obj1.Employeeid);
		System.out.println("Employeename:"+obj1.Employeename);
		System.out.println("phonenumber:"+obj1.phoneNumber);
		System.out.println("Salary:"+obj1.Salary);
		System.out.println("gender:"+obj1.gender);
		System.out.println("------------------------------------------");
		obj1.Employeeid = 04;
		obj1.Employeename = "pallavi";
		obj1.phoneNumber = 900925818;
		obj1.Salary = 60000;
		obj1.gender = "Female";
		System.out.println("Employeeid:"+obj1.Employeeid);
		System.out.println("Employeename:"+obj1.Employeename);
		System.out.println("phonenumber:"+obj1.phoneNumber);
		System.out.println("Salary:"+obj1.Salary);
		System.out.println("gender:"+obj1.gender);
		System.out.println("------------------------------------------");
		Department obj2 = new Department();
		obj2.Departmentid = 01;
		obj2.Departmentname = "Accounts";
		obj2.Floor = "Forth";
		System.out.println("Departmentid:"+obj2.Departmentid);
		System.out.println("Departmentname:"+obj2.Departmentname);
		System.out.println("Floor:"+obj2.Floor);
		System.out.println("------------------------------------------");
		obj2.Departmentid = 02;
		obj2.Departmentname = "Research";
		obj2.Floor = "first";
		System.out.println("Departmentid:"+obj2.Departmentid);
		System.out.println("Departmentname:"+obj2.Departmentname);
		System.out.println("Floor:"+obj2.Floor);
		System.out.println("------------------------------------------");
		obj2.Departmentid = 03;
		obj2.Departmentname = "production";
		obj2.Floor = "third";
		System.out.println("Departmentid:"+obj2.Departmentid);
		System.out.println("Departmentname:"+obj2.Departmentname);
		System.out.println("Floor:"+obj2.Floor);
		System.out.println("------------------------------------------");
		Insurance obj3 = new Insurance();
		obj3.Insuranceid = 01;
		obj3.Insurancename = "Lifeinsurance";
		obj3.year = 2023;
		System.out.println("Insuranceid:"+obj3.Insuranceid);
		System.out.println("Insurancename:"+obj3.Insurancename);
		System.out.println("year:"+obj3.year);
		System.out.println("------------------------------------------");
		obj3.Insuranceid = 02;
		obj3.Insurancename = "Homeinsurance";
		obj3.year = 2019;
		System.out.println("Insuranceid:"+obj3.Insuranceid);
		System.out.println("Insurancename:"+obj3.Insurancename);
		System.out.println("year:"+obj3.year);
		System.out.println("------------------------------------------");
		obj3.Insuranceid = 03;
		obj3.Insurancename = "Carinsurance";
		obj3.year = 2013;
		System.out.println("Insuranceid:"+obj3.Insuranceid);
		System.out.println("Insurancename:"+obj3.Insurancename);
		System.out.println("year:"+obj3.year);
		System.out.println("------------------------------------------");
	}

}
