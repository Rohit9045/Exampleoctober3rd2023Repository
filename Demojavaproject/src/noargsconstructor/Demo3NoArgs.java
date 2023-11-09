package noargsconstructor;
class Destop
{
	int DestopID;
	String MfrName;
	String DetpType;
	int DestopPrice;
	Destop()
	{
		DestopID = 111;
		MfrName = "HP";
		DetpType = "Home";
		DestopPrice = 25000;
		System.out.println("DestopID:"+DestopID);
		System.out.println("DesktopName:"+MfrName);
		System.out.println("DesktopType:"+DetpType);
		System.out.println("DesktopPrice:"+DestopPrice);
		System.out.println("-------------------------------------------");
	}
}	
class Laptop
{
	int LaptopID;
	String MfrName;
	String Madein;
	int LaptopPrice;
	Laptop()
	{
		LaptopID = 121;
		MfrName = "Lenovo";
		Madein = "JAPAN";
		LaptopPrice = 25000;
		System.out.println("LaptopID:"+LaptopID);
		System.out.println("ManufacturedName:"+MfrName);
		System.out.println("Madein:"+Madein);
		System.out.println("LaptopPrice:"+LaptopPrice);
		System.out.println("-------------------------------------------");	
	}
}
class Mobile
{
	int MobileNo;
	String MfrName;
	int Year;
	int M0bilePrice;
	Mobile()
	{
		MobileNo = 952158622;
		MfrName = "Lenovo";
		Year = 2018;
		M0bilePrice = 25000;
		System.out.println("MobileNo:"+MobileNo);
		System.out.println("ManufacturedName:"+MfrName);
		System.out.println("ManufacturedYear:"+Year);
		System.out.println("MobilePrice:"+M0bilePrice);
		System.out.println("-------------------------------------------");	
	}
} 
		
public class Demo3NoArgs {

	public static void main(String[] args) {
		Destop obj1 = new Destop();
		Laptop obj2 = new Laptop();
		Mobile obj3 = new Mobile();
	}

}
