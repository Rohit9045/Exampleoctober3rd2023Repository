package abstractassignment;
abstract class Student
{
	Student(String firstname)
	{
		System.out.println(firstname);
	}
}
 class library extends Student
{
	library(String fname1,String location)
	{
		super(fname1);
		System.out.println(location);
	}
}
class Book extends library
{	
	Book(String fname11,String location1,String Bookname)
	{
		super(fname11,location1);
		System.out.println(Bookname);
	}
}

public class MultilevelInheritancesuperclass {

	public static void main(String[] args) {
		
		Book o = new Book("chaitra","karnataka","corejava");
		
	}

}

