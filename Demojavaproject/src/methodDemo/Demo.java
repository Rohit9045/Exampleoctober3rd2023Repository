package methodDemo;
class Demo1
{
	String GetName()
	{
		String s = "Rohit";
		return s;
	}
	 int getage()
	 {
		 int age = 21;
		 return age;	 
	 }
	 String[] gethobbies(String hobbies[])
	 {
		 return hobbies;
	 }
}

public class Demo {

	public static void main(String[] args) {
		Demo1 ob = new Demo1();
		String s1 = ob.GetName();
		System.out.println(s1);
		int a=ob.getage();
		System.out.println(a);
		String str[]= {"Reading","Programming"};
		String s2[]= ob.gethobbies(str);
		for(String kk:s2)
		{
			System.out.println(kk);
		}
	}
}



		
		



