package abstractassignment;
abstract class Chaistall
{
	void stallName(String name)
	{
		System.out.println("stall Name:"+name);
	}
	void stallLocation(String location)
	{
		System.out.println("stall Location:"+location);
	}
}
class Chef extends Chaistall
{
	
	void Chefspecial(String name)
	{
		System.out.println("Chefspecial Name:"+name);
	}
}
public class Instancemethods {

	public static void main(String[] args) {
		
		Chef ob=new  Chef();
		 ob.stallName("B.E chaiwala");//Instance method
		 ob.stallLocation("Attiguppe,banglore");//Instance method
		 ob.Chefspecial("Rosetea");//subclass method
		
		
	}
}

