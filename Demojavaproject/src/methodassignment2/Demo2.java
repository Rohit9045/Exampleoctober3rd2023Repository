package methodassignment2;
class OddNumber
{
	int first20()
	{
		int sum=0;
		for(int i=1;i<=20;i++)
			   sum+=i;
			{
				return sum;
			}
		}
	}
		public class Demo2 {

			public static void main(String[] args) {
				OddNumber o = new OddNumber();
				int a = o.first20();
				System.out.println(a);
			}
		}
