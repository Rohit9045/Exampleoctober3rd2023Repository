package methodassignment2;
class demo
{
	int factorial(int n)
	{
	int fact = 1;
	for(int i=1;i<=n;i++)
	{
		fact = fact * i;
	}
     return fact;
    }
}
public class Demo1 {

	public static void main(String[] args) {
	   demo o = new demo();
	   int a = o.factorial(5);
	   System.out.println(a);
	}
}
