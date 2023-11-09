package Assignment;

public class elementsforeachloop {

	public static void main(String[] args) {
		int a[][]= {{10,20,30},{40,50,60}};
		for(int b[]:a)
		{
			for(int kk:b)
			{
				System.out.print(kk+" ");
			}
		}System.out.println();
	}

}
