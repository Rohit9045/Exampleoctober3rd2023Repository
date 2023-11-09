package ConstructorOverloadingDemo1;
class University
{
	University(String UniName)
	{
		System.out.println("UniversityName:"+UniName);
	}
	University(int Code)
	{
		System.out.println("UniversityCode:"+Code);
	}
	University(String address,int Pincode)
	{
		System.out.println("Address:"+ address);
		System.out.println("Pincode:"+Pincode);
	}
}
public class University1 {

	public static void main(String[] args) {
		University u1 = new University("VTU");
		University u2 = new University(280);
		University u3 = new University("Belgavi",590018);

	}

}
