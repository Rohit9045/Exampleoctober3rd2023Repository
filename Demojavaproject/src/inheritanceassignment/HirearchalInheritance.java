package inheritanceassignment;
class maths
{
	void addition(int x,int y)
	{
		System.out.println("Addition:"+(x+y));
	}
}
class maths1 extends maths
{
	void substraction(int a,int b)
	{
		System.out.println("substraction:"+(a-b));
	}
}
class maths2 extends maths
{
	void multiplication(int c,int d)
	{
		System.out.println("multiplication:"+(c*d));
	}
}
class maths3 extends maths
{
	void Division(int x,int y)
	{
		System.out.println("Division:"+(x/y));
	}
}
public class HirearchalInheritance {

	public static void main(String[] args) {
		maths3 o = new maths3();
		o.addition(120, 50);
		o.Division(45, 20);
		maths2 o1 = new maths2();
		o1.addition(75, 10);
		o1.multiplication(86, 32);
		maths1 o2 = new maths1();
		o2.addition(47, 65);
		o2.substraction(54,46);
	}
}

		
		
		
		
		




