package Assignment;

public class integerarray {

	public static void main(String[] args) {
		int[] n = {10,20,30,40,50,60};
		int i,sum;
		sum = 0;
		for(i = 0;i < n.length;i++)
		{
			sum = sum + n[i];
		}
			System.out.println(sum);

	}

}
