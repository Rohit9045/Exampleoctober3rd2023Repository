package methodAssignment;
class primeNumbers1
{
	void Prime()
	{
		int i,j;
		for(i=50;i<=100;i++)
		{ 
		  for(j=2;j<i;j++)
			{
	       		if (i%j==0)
			    break;
			}
		    if (i==j)
		    {	
			    System.out.println(i);
			}
		  }
	   }
	}
public class Primenumbers {
	public static void main(String[] args) {
		primeNumbers1 o = new primeNumbers1();
		o.Prime();
	}
}