package methodDemo;
class maths2
{
	void Multiplication(int x,int y)
	{
		int res=x*y;
		System.out.println(" Multiplication Result:"+res);
	}
    void Addition(int x,int y)
    {
	    int res=x+y;
	    System.out.println("Addition Result:"+res);
    }
}
public class Method2 {

	public static void main(String[] args) {
		maths2 o = new maths2();
		o.Multiplication(12,10);
		o.Addition(120,40);
		o.Multiplication(5,15);
		o.Addition(50,70);
		

	}

}
