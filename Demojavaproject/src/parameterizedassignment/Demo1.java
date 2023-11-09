package parameterizedassignment;

class Employee
{
	int EmployeeId;
	String EmployeeName;
	int phoneNumber;
	int Salary;
	String gender;
    Employee(int EmpId,String EmpN,int PN,int Sal,String gend)
    {
       EmployeeId = EmpId;
       EmployeeName = EmpN;
       phoneNumber = PN;
       Salary = Sal;
       gender = gend;
        System.out.println("EmployeeId:"+EmployeeId);
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
	Department(int Deptid,String Deptn,String Flr)
	{
	Departmentid = Deptid;
	Departmentname = Deptn;
	Floor = Flr;
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
	Insurance(int Insuid,String Insun,int yr)
      {
         Insuranceid = Insuid;
         Insurancename = Insun;
         year = yr;
         System.out.println("Insuranceid:"+Insuranceid);
         System.out.println("Insurancename:"+Insurancename);
         System.out.println("year:"+year);
         System.out.println("------------------------------------------");
      }
}
public class Demo1 {

	public static void main(String[] args) {
		Employee obj= new Employee(01,"Rohit",944925818,25000,"male");
		Department obj2 = new Department(101,"Research","Second");
		Insurance obj3 = new Insurance(01,"lifeinsurance",2021);
	}
}
