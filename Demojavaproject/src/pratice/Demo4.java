package pratice;
class Demo
{
	int[][] getmatrixaddition(int x[][],int y[][])
		{
			int z[][]=new int[x.length][x[0].length];
			for(int i=0;i<y.length;i++)
			{
				for(int j=0;j<y[i].length;j++) 
				{
					z[i][j]= x[i][j]+y[i][j];
				}
			}
			return z;
		}
}
public class Demo4 {
	public static void main(String[] args) {
		Demo o = new Demo();
		int a[][]= {{1,2,3},{4,5,6},{7,8,9}};
		int b[][]= {{10,20,30},{40,50,60},{70,80,90}};
		int res[][]=o.getmatrixaddition(a,b);
		for (int i=0;i<res.length;i++)
		{
			System.out.println(res[0][i]+" ");
		}
		System.out.println();
		System.out.println("------------------------------");
	}
}
