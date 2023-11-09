package instanceandstatic;
class calculation
{
	static int getsumofallelements (int x[]) 
	{
		int sum = 0;
		for(int i=0;i<x.length;i++)
		{
			sum = sum + x[i];
		}
		return sum;
	}
	
}
public class Sumofallelements {

	public static void main(String[] args) {
		int a[]= {2,4,6,8,12};
		int res = calculation.getsumofallelements(a);
		System.out.println(res);
	}

}
