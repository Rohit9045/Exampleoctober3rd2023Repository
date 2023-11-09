package Assignment2;

public class stringconcatinationarray {

	public static void main(String[] args) {
		String a[][]= {{"Rishab","rohan","Rohith"},{"Ganesh","Suma","Ravi"},{"Rakshitha","Raj","Kiran"}};
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]);
			}
		}
	}
}



