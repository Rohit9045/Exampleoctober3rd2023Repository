package methodAssignment;
class primeNumbers2
{
	void Prime()
	{
		int i,j;
		for(i=250;i>=200;i--)
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
public class PrimeSecond {
	public static void main(String[] args) {
		primeNumbers2 o = new primeNumbers2();
		o.Prime();
	}
}

