package methodDemo;
class Factorial1
{
	void Fact (int num)
	{
	long s=1;
	int fact = 1; 
	 for(int i=1;i<=num;i++)
	     {
	       fact = fact * i;
	     }
	      System.out.println(fact);
	}
}

public class Factorial {

	public static void main(String[] args) {
		Factorial1 f = new Factorial1();
		f.Fact(5);

	}

}
