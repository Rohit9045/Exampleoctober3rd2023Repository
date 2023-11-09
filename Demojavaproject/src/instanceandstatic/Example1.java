package instanceandstatic;
// 2classes d1 contains instancem,d2 contains ststicm can we call instancem d1 in staticm d2. 
class Example10
{
	void addition(int x,int y)
	{
		int res = (x+y);
		System.out.println("Addition result:"+res);
	}
}
class Example2
{
	static void multiplication(int x,int y)
	{
		Example10 o = new Example10();
		o.addition(100,400);
		int res = (x * y);
		System.out.println("multiplication Result:"+res);
	}
}
public class Example1 {

	public static void main(String[] args) {
		Example2.multiplication(15,20);
	}
}

		
		
		

	
