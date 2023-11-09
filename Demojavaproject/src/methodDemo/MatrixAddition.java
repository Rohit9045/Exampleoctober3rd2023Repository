package methodDemo;
class methodDemo1
{
	void matrixAddition(int x[][],int y[][])
	{
	if(x.length==y.length && x[0].length==y[0].length)
	{
		for(int i=0;i<x.length;i++)
		{
			for(int j=0;j<x[i].length;j++)
			{
				int res =x[i][j]+y[i][j];
				System.out.print(res+" ");
			}
			System.out.println();
		}
	  }
   }
}
public class MatrixAddition {

	public static void main(String[] args) {
		methodDemo1 o = new methodDemo1();
		int a[][] = {{1,2,3},{4,5,6}};
		int b[][] = {{10,20,30},{40,50,60}};
		o.matrixAddition(a, b);
	}

}
