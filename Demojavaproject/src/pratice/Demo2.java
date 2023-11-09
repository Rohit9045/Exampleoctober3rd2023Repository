package pratice;
class primeornot
{
	boolean isprime(int num)
	{
		int flag = 0;
		boolean result = false;
		for(int i=2;i<num;i++)
		{
			if(num%1==0)
			{
				flag+=1;
				break;
			}
		}
		    if(flag==0)
		    {
	          result = true;
            }
            return result;
     }	
 }
public class Demo2{
public static void main(String[] args) {
	primeornot o = new primeornot();
	boolean v1 = o.isprime(9);
	System.out.println(v1);
	boolean v2 = o.isprime(13);
	System.out.println(v2);
}

}
