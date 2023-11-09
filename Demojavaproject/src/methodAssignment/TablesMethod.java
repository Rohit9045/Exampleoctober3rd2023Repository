package methodAssignment;
class Demog
{
	Demog()
	{
		int a;
		for(int i = 1;i <= 20;i++)
		{
			for(int j = 1;j <= 10;j++)
			{
				a = i * j;
				System.out.println(i+ " x " +j+ " = " +a);
			}
			System.out.println();
		}
	}
}
public class TablesMethod {

	public static void main(String[] args) {
		// Complete Tables up to 20th
		new Demog();
	}
}
