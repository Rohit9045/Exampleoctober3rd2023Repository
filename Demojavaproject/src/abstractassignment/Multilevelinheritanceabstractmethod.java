package abstractassignment;
abstract class College1
{
	abstract void showCollegeName(String name);
	
}
class EngineeringCollege extends College1
{
	void showCollegeName(String name)
	{
		System.out.println("Engineering College name:"+name);
	}
	//abstract void displayCityName(String name);
	
}
class Branches extends EngineeringCollege
{
	void BranchName(String name)
	{
		System.out.println("Branch name:"+name);
	}
	void displayCityName(String name)
	{
		System.out.println("CityName:"+name);
	}
}
public class Multilevelinheritanceabstractmethod {

	public static void main(String[] args) {
		
		
		Branches ob1=new Branches();
		 ob1.BranchName("ME");
		 ob1.displayCityName("DHARWAD");
		 ob1.showCollegeName("SDMCET");

	}

}
