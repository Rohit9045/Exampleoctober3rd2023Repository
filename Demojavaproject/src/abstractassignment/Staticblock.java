package abstractassignment;
abstract class Resturant
{
	static
	{
		System.out.println("its a static block");
	}
	
}
class Bakery extends Resturant
{
	
}

public class Staticblock{

	public static void main(String[] args) {
		
		Bakery ob=new Bakery();
		
	}

}

