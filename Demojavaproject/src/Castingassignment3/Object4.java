package Castingassignment3;
class Student
{
	int StudentId;
	String StudentName;
	int Year;
}

class Library
{
	int LibraryId;
	String BookName;
	String Issue;
}

class Sports
{
	int SportsId;
	String SportsType;
	String SportsName;
}

class CSDepartment
{
	int CSDeptNo;
	String CSDeptName;
	String CSDeptDay;
}

public class Object4 {

	public static void main(String[] args) {
		Student obj1 = new Student();
		obj1.StudentId = 1;
		System.out.println("StudentId:"+obj1.StudentId);
		obj1.StudentName = "Anand";
		System.out.println("StudentName:"+obj1.StudentName);
		obj1.Year = 2000;
		System.out.println("StudentYear:"+obj1.Year);
		System.out.println("------------------------------------------");
		obj1.StudentId = 2;
		System.out.println("StudentId:"+obj1.StudentId);
		obj1.StudentName = "Nagaraj";
		System.out.println("StudentName:"+obj1.StudentName);
		obj1.Year = 2000;
		System.out.println("StudentYear:"+obj1.Year);
		System.out.println("------------------------------------------");
		obj1.StudentId = 3;
		System.out.println("StudentId:"+obj1.StudentId);
		obj1.StudentName = "Praveen";
		System.out.println("StudentName:"+obj1.StudentName);
		obj1.Year = 2001;
		System.out.println("StudentYear:"+obj1.Year);
		System.out.println("------------------------------------------");
		obj1.StudentId = 4;
		System.out.println("StudentId:"+obj1.StudentId);
		obj1.StudentName = "Prakash";
		System.out.println("StudentName:"+obj1.StudentName);
		obj1.Year = 2002;
		System.out.println("StudentYear:"+obj1.Year);
		System.out.println("------------------------------------------");
		
		Library obj2 = new Library();
		obj2.LibraryId = 21;
		System.out.println("LibraryID:"+obj2.LibraryId);
		obj2.BookName = "Core Java";
		System.out.println("BookName:"+obj2.BookName);
		obj2.Issue = "Nov";
		System.out.println("IssueedMonth:"+obj2.Issue);
		System.out.println("------------------------------------------");
		obj2.LibraryId = 22;
		System.out.println("LibraryID:"+obj2.LibraryId);
		obj2.BookName = "SQL";
		System.out.println("BookName:"+obj2.BookName);
		obj2.Issue = "Nov";
		System.out.println("IssueedMonth:"+obj2.Issue);
		System.out.println("-------------------------------------------");
		obj2.LibraryId = 23;
		System.out.println("LibraryID:"+obj2.LibraryId);
		obj2.BookName = "Python";
		System.out.println("BookName:"+obj2.BookName);
		obj2.Issue = "Nov";
		System.out.println("IssueedMonth:"+obj2.Issue);
		System.out.println("----------------------------------------");
		obj2.LibraryId = 24;
		System.out.println("LibraryID:"+obj2.LibraryId);
		obj2.BookName = "Selinium";
		System.out.println("BookName:"+obj2.BookName);
		obj2.Issue = "Nov";
		System.out.println("IssueedMonth:"+obj2.Issue);
		System.out.println("----------------------------------------");
		
		Sports obj3 = new Sports();
		obj3.SportsId = 51;
		System.out.println("SportsID:"+obj3.SportsId);
		obj3.SportsType = "Indore";
		System.out.println("SportsType:"+obj3.SportsType);
		obj3.SportsName = "Chess";
		System.out.println("SportsName:"+obj3.SportsName);
		System.out.println("----------------------------------------");
		obj3.SportsId = 52;
		System.out.println("SportsID:"+obj3.SportsId);
		obj3.SportsType = "Indore";
		System.out.println("SportsType:"+obj3.SportsType);
		obj3.SportsName = "Ludo";
		System.out.println("SportsName: "+obj3.SportsName);
		System.out.println("----------------------------------------");
		obj3.SportsId = 53;
		System.out.println("SportsID:"+obj3.SportsId);
		obj3.SportsType = "Outdoor";
		System.out.println("SportsType:"+obj3.SportsType);
		obj3.SportsName = "Hokey";
		System.out.println("SportsName: "+obj3.SportsName);
		System.out.println("-----------------------------------------");
		obj3.SportsId = 54;
		System.out.println("SportsID:"+obj3.SportsId);
		obj3.SportsType = "Outdoor";
		System.out.println("SportsType:"+obj3.SportsType);
		obj3.SportsName = "Basket Ball";
		System.out.println("SportsName:"+obj3.SportsName);
		System.out.println("-----------------------------------------");
		
		CSDepartment obj4 = new CSDepartment();
		obj4.CSDeptNo = 11;
		System.out.println("CSDepartmentID:"+obj4.CSDeptNo);
		obj4.CSDeptName = "Java Lab";
		System.out.println("CSDepartmentName:"+obj4.CSDeptName);
		obj4.CSDeptDay = "Mon";
		System.out.println("SportsName:"+obj4.CSDeptDay);
		System.out.println("-----------------------------------------");
		obj4.CSDeptNo = 1;
		System.out.println("CSDepartmentID:"+obj4.CSDeptNo);
		obj4.CSDeptName = "Python Lab";
		System.out.println("CSDepartmentName:"+obj4.CSDeptName);
		obj4.CSDeptDay = "Fri";
		System.out.println("SportsName:"+obj4.CSDeptDay);
		System.out.println("-----------------------------------------");
		obj4.CSDeptNo = 13;
		System.out.println("CSDepartmentID:"+obj4.CSDeptNo);
		obj4.CSDeptName = "C++ Lab";
		System.out.println("CSDepartmentName:"+obj4.CSDeptName);
		obj4.CSDeptDay = "Wed";
		System.out.println("SportsName:"+obj4.CSDeptDay);
		System.out.println("-----------------------------------------");
		obj4.CSDeptNo = 14;
		System.out.println("CSDepartmentID:"+obj4.CSDeptNo);
		obj4.CSDeptName = "Hacking";
		System.out.println("CS DepartmentName:"+obj4.CSDeptName);
		obj4.CSDeptDay = "Tue";
		System.out.println("SportsName:"+obj4.CSDeptDay);
		System.out.println("-----------------------------------------");

	}

}
