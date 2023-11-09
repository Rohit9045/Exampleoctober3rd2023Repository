package instanceandstatic;
//2classes d1 contains instancem,d2 contains ststicm can we call staticm d2 in instancem d1. 
class Demo11
{
	void addition(int x,int y)
	{
		Demo22.multiplication(15,20);
		int res = (x+y);
		System.out.println("Addition result:"+res);
	}
}
class Demo22
{
	static void multiplication(int x,int y)
	{
		Example10 o = new Example10();
		int res = (x * y);
		System.out.println("multiplication Result:"+res);
	}
}
public class Example3 {

	public static void main(String[] args) {
		Demo11 o = new Demo11();
		o.addition(100,400);
		
	}
}

