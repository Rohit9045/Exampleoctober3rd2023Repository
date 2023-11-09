package pratice;
class factorial
{
	int getfactorial (int num)
		{
			if (num==1)
			{
			return 1;
			}
		return num * getfactorial(num-1);
	}
}

public class Demo1 {

	public static void main(String[] args) {
		factorial obj = new factorial();
		int result = obj.getfactorial(6);
		System.out.println(result);
	}

}
