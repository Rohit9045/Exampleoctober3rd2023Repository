package methodAssignment;
class array
{
	void arraychar(char a[][])
	{
		for(int i = 0;i < a.length;i++)
		{
			for(int j = 0;j < a.length;j++)
			{
				System.out.print(a[j][i]+" ");
			}
			System.out.println();
		}
	}
}
public class Transposemethod {
	public static void main(String[] args) {
		array ad = new array();
		char ch[][] = {{'A','B','C'},{'D','E','F'},{'G','H','I'}};
		ad.arraychar(ch);
	}
}


