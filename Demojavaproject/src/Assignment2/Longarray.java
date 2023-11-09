package Assignment2;

public class Longarray {

	public static void main(String[] args) {
		long a[][]= {{10,20,30},{40,50,60},{70,80,90}};
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				sum+=a[i][j];
			}
		}
		System.out.print(sum);
	}
}




