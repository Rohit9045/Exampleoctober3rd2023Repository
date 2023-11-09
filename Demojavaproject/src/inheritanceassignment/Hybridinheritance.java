package inheritanceassignment;
class Grandfather
{
	void showA()
	{
		System.out.println("He's my grandfather.");
	}
}
class father extends Grandfather
{
	void showB()
	{
		System.out.println("He's my father.");
	}
}
class son extends father
{
	void showC()
	{
		System.out.println("He's my son");
	}
}
class daughter extends father
{
	void showD()
	{
		System.out.println("She's my Daughter");
	}
}
public class Hybridinheritance {

	public static void main(String[] args) {
		son o = new son();
		o.showC();
		o.showB();
		o.showA();
		daughter o1 = new daughter();
		o1.showD();
		o1.showB();
		o1.showA();
	}
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	


