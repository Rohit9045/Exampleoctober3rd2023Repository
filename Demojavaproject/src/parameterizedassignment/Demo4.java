
package parameterizedassignment;
class Student
{
	int StudentId;
	String StudentName;
	int Year;
	Student(int StudtId,String StudtName,int Yr)
	{
		StudentId = StudtId;
		StudentName = StudtName;
		Year = Yr;
		System.out.println("StudentId:"+StudentId);
		System.out.println("StudentName:"+StudentName);
		System.out.println("StudentYear:"+Year);
		System.out.println("------------------------------------------");
	}
}
class Library
{
	int LibraryId;
	String BookName;
	String Issue;
	Library(int LibId,String BkN,String issue)
	{
		LibraryId = LibId;
		BookName = BkN;
		Issue = issue;
		System.out.println("LibraryID:"+LibraryId);
		System.out.println("BookName:"+BookName);
		System.out.println("Issue:"+Issue);
		System.out.println("------------------------------------------");
	}
}

class Sports
{
	int SportsId;
	String SportsType;
	String SportsName;
	Sports(int SptsId,String SptsType,String SptsName)
	{
		SportsId = SptsId;
		SportsType = SptsType;
		SportsName = SptsName;
		System.out.println("SportsID:"+SportsId);
		System.out.println("SportsType:"+SportsType);
		System.out.println("SportsName:"+SportsName);
		System.out.println("----------------------------------------");
	}
}

class CSDepartment
{
	int CSDepartmentNo;
	String CSDepartmentName;
	String CSDepartmentDay;
	CSDepartment(int CSDeptNo,String CSDeptName,String CSDeptDay)
	{
		CSDepartmentNo = CSDeptNo;
		CSDepartmentName = CSDeptName;
		CSDepartmentDay = CSDeptDay;
		System.out.println("CSDepartmentID:"+CSDepartmentNo);
		System.out.println("CSDepartmentName:"+CSDepartmentName);
		System.out.println("CSDepartmentDay:"+CSDepartmentDay);
		System.out.println("-----------------------------------------");	
	}
}

public class Demo4 {

	public static void main(String[] args) {
		Student obj1 = new Student(01,"Anand",2019);
		Library obj2 = new Library(01,"Corejava","November");
		Sports obj3 = new Sports(10,"indore","chess");
		CSDepartment obj4 = new CSDepartment(201,"javalab","monday");


	}

}
