package inheritanceassignment;
class sample1
{
	String names;
	int rollno;
	int pincode;
	sample1(String name,int rollno,int collegecode) 
	{
		names = name;
		this.rollno = rollno;
		pincode = collegecode;
		System.out.println("Super Class name : " + names);
		System.out.println("Roll no : " + rollno);
		System.out.println("College Code : " + pincode);
	}
}

class sample2 extends sample1 
{
	String names;
	int rollno;
	int pincode;

	sample2(String name, int rollno, int collegecode) {
		super(name, rollno, collegecode);
		names = name;
		this.rollno = rollno;
		pincode = collegecode;
		System.out.println("Child Class 1 name : " + names);
		System.out.println("Roll no : " + rollno);
		System.out.println("College Code : " + pincode);
	}
}

class sample3 extends sample1
{
	String names;
	int rollno;
	int pincode;

	sample3(String name, int rollno, int collegecode) 
	{
		super(name, rollno, collegecode);
		names = name;
		this.rollno = rollno;
		pincode = collegecode;
		System.out.println("Child Class 2 name : " + names);
		System.out.println("Roll no : " + rollno);
		System.out.println("College Code : " + pincode);
	}
}
public class Sixthassignment {
	public static void main(String[] args) {
		sample2 o = new sample2("Rohit", 84, 560072);
		sample3 o1 = new sample3("Rishab", 44, 560017);
	}
}

