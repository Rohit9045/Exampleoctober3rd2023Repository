package Assignment;

public class RererseEin2darray {

	public static void main(String[] args) {
			int a[][]= new int [2][3];
			a[0][0]=100;
			a[0][1]=200;
			a[0][2]=300;
			a[1][0]=400;
			a[1][1]=500;
			a[1][2]=600;
			for(int i=a.length-1;i>=0;i--)
			{
				for(int j=a[i].length-1;j>=0;j--)
				{
					System.out.print(a[i][j]+" ");
				}
				System.out.println();
				}
			}
		}




