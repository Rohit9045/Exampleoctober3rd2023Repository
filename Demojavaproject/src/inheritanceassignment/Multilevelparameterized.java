package inheritanceassignment;
class DemoA
{
	DemoA(String name, int age)
	{
		System.out.println("Name = "+ name);
		System.out.println("Age = "+ age);
	}
}
class DemoB extends DemoA
{
	DemoB(String name, int age)
	{
		super("Rohit",23);
		System.out.println("name = "+name);
		System.out.println("age ="+age);
	}
}
class DemoC extends DemoB
{
	DemoC()
	{
		super("Rishab",25);
	}
}
public class Multilevelparameterized {

	public static void main(String[] args) {
		DemoC o = new DemoC();
	}

}
