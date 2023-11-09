package abstractassignment;
abstract class College
{
	static void CollegeName(String name)
	{
		System.out.println(name);
	}
	static void CollegeLocation(String location)
	{
		System.out.println(location);
	}
}
public class Staticmethodfromclass {

	public static void main(String[] args) {
		
		College.CollegeName("SDMCET");
		College.CollegeLocation("Dharwad");
	}

}
