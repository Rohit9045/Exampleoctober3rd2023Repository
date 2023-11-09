package noargsconstructor;
class Student
{
	int StudentId;
	String StudentName;
	int Year;
	Student()
	{
		StudentId = 1;
		StudentName = "Anand";
		Year = 2000;
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
	Library()
	{
		LibraryId = 21;
		BookName = "Core Java";
		Issue = "Nov";
		System.out.println("LibraryID:"+LibraryId);
		System.out.println("BookName:"+BookName);
		System.out.println("IssueedMonth:"+Issue);
		System.out.println("------------------------------------------");
	}
}

class Sports
{
	int SportsId;
	String SportsType;
	String SportsName;
	Sports()
	{
		SportsId = 51;
		SportsType = "Indore";
		SportsName = "Chess";
		System.out.println("SportsID:"+SportsId);
		System.out.println("SportsType:"+SportsType);
		System.out.println("SportsName:"+SportsName);
		System.out.println("----------------------------------------");
	}
}

class CSDepartment
{
	int CSDeptNo;
	String CSDeptName;
	String CSDeptDay;
	CSDepartment()
	{
		CSDeptNo = 11;
		CSDeptName = "Java Lab";
		CSDeptDay = "Mon";
		System.out.println("CSDepartmentID:"+CSDeptNo);
		System.out.println("CSDepartmentName:"+CSDeptName);
		System.out.println("SportsName:"+CSDeptDay);
		System.out.println("-----------------------------------------");	
	}
}
public class Demo4NoArgs {

	public static void main(String[] args) {
		Student obj1 = new Student();
		Library obj2 = new Library();
		Sports obj3 = new Sports();
		CSDepartment obj4 = new CSDepartment();
	}

}
