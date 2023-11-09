package assignment4;
class Addition1
{
	static int[] add(int a[],int b[])
	{
		int x[] = new int [a.length];
		for(int i=0;i<a.length;i++) 
		{
			x[i] = a[i] + b[i];
		}
		return x;
	}
}

public class Addition {

	public static void main(String[] args) {
		int x[] = {10,20,30,40,50,60};
		int y[] = {11,12,13,14,15,16};
        int res[] = Addition1.add(x,y);
        for(int i = 0;i<res.length;i++) 
        {
		System.out.println(res[i]);

	}
  }
}
