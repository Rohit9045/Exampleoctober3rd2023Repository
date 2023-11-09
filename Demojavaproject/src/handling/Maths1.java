package handling;
class maths
{
	static void addition(int x,int y)
	{
		int Result = (x+y);
		System.out.println("Addition Result:"+Result);
	}
	static void multiplication(int x,int y)
	{
		int Result = (x*y);
		System.out.println("multiplication Result:"+Result);
	}
	static void substraction (int x,int y)
	{
		int Result = (x-y);
		System.out.println("substraction result:"+Result);
	}
	static void division(int x,int y)
	{
		int Result = (x/y);
		System.out.println("Division result:"+Result);
	}
	static void modulus(int x,int y)
	{
		int Result = (x%y);
		System.out.println("modulus result:"+Result);
	}
	static void isoddnumber(int x)
	{
		if(x%2==1)
		{
			System.out.println(x+" is a odd number");
		}
	}
	static void isevennumber(int x)
	{
		if(x%2==0)
		{
			System.out.println(x+" is a even nummber");
		}
	}
	
}
public class Maths1 {

	public static void main(String[] args) {
		maths.addition(120,80);
		maths.multiplication(5,5);
		maths.substraction(100,50);
		maths.division(2,2);
		maths.modulus(10,45);
		maths.isoddnumber(11);
		maths.isevennumber(20);
	}
}
