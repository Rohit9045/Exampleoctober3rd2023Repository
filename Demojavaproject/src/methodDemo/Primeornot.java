package methodDemo;
class Primeornot1
{
	void isprime(int num)
	{
		int flag=0;
		for(int i=2;i<=num;i++)
		{
			if(num%i==0)
			{
				 flag+=1;
				 break;
			}
		}
	if(flag==0)
	{
		System.out.println(num+"is a prime number");
	}
	else
	{
		System.out.println(num+"is not a prime number");
	}
  }
}
public class Primeornot {

	public static void main(String[] args) {
		Primeornot1 o = new Primeornot1();
		o.isprime(7);
		o.isprime(1276);
		o.isprime(43);
		o.isprime(7899);
		o.isprime(11);
	}

}
