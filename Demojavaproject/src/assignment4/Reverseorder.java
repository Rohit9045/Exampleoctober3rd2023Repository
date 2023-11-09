package assignment4;
class Demo
{
	static int []array(int a[])
	{
	int x=0;
	int arr[] = new int [a.length];
	for (int i=a.length-1;i>=0;i--) 
	{
		arr[x] = a[i];
		x++;
	}
	return arr;
}
}

public class Reverseorder {

	public static void main(String[] args) {
		int q[]= {10,20,30,40,50,60};
		int res[]=Demo.array(q);
		for (int i=0;i<res.length;i++) 
		{
			System.out.println(res[i]);
		}
		for(int a : res)
		{
		
			System.out.println();
		}
		
	}

}
