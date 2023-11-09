package Assignment2;

public class bytewhileloop {

	public static void main(String[] args) {
		byte a[][] = {{1,2,3},{4,5,6},{7,8,9}};
		int i = 0;
		while (i<a.length)
		{
			int j = 0;
			while(j<a[i].length)
			{
				System.out.print(a[i][j]+" ");
				j++;
			}
			System.out.println();
			i++;
		}
	}

}
