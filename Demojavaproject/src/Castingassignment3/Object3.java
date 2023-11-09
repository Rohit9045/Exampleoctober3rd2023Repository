package Castingassignment3;
class Desktop
{
	int DestopID;
	String MfrName;
	String DetpType;
	int DestopPrice;
}

class Laptop
{
	int LaptopID;
	String MfrName;
	String Madein;
	int LaptopPrice;
}

class Mobile
{
	int MobileNo;
	String MfrName;
	int Year;
	int M0bilePrice;
} 
public class Object3 {

	public static void main(String[] args) {
	
		// Object Class For Desktop Laptop Mobile
		Desktop obj1 = new Desktop();
		obj1.DestopID = 111;
		System.out.println("DestopID:"+obj1.DestopID);
		obj1.MfrName = "HP";
		System.out.println("DesktopName:"+obj1.MfrName);
		obj1.DetpType = "Home";
		System.out.println("DesktopType:"+obj1.DetpType);
		obj1.DestopPrice = 25000;
		System.out.println("DesktopPrice:"+obj1.DestopPrice);
		System.out.println("-------------------------------------------");
		obj1.DestopID = 112;
		System.out.println("DestopID:"+obj1.DestopID);
		obj1.MfrName = "Dell";
		System.out.println("DesktopName:"+obj1.MfrName);
		obj1.DetpType = "Office";
		System.out.println("DesktopType:"+obj1.DetpType);
		obj1.DestopPrice = 28000;
		System.out.println("DesktopPrice:"+obj1.DestopPrice);
		System.out.println("--------------------------------------------");
		obj1.DestopID = 113;
		System.out.println("DesktopID:"+obj1.DestopID);
		obj1.MfrName = "Lenovo";
		System.out.println("DesktopName:"+obj1.MfrName);
		obj1.DetpType = "Gaming";
		System.out.println("DesktopType:"+obj1.DetpType);
		obj1.DestopPrice = 40000;
		System.out.println("DesktopPrice:"+obj1.DestopPrice);
		System.out.println("-------------------------------------------");
		obj1.DestopID = 114;
		System.out.println("DesktopID:"+obj1.DestopID);
		obj1.MfrName = "MSI";
		System.out.println("DesktopName:"+obj1.MfrName);
		obj1.DetpType = "Home";
		System.out.println("DesktopType:"+obj1.DetpType);
		obj1.DestopPrice = 35000;
		System.out.println("DesktopPrice:"+obj1.DestopPrice);
		System.out.println("-------------------------------------------");
		
		Laptop obj2 = new Laptop();
		obj2.LaptopID = 121;
		System.out.println("LaptopID: "+obj2.LaptopID);
		obj2.MfrName = "Lenovo";
		System.out.println("ManufacturedName: "+obj2.MfrName);
		obj2.Madein = "JAPAN";
		System.out.println("Madein: "+obj2.Madein);
		obj2.LaptopPrice = 25000;
		System.out.println("LaptopPrice: "+obj2.LaptopPrice);
		System.out.println("-------------------------------------------");
		obj2.LaptopID = 122;
		System.out.println("LaptopID:"+obj2.LaptopID);
		obj2.MfrName = "HP";
		System.out.println("ManufacturedName:"+obj2.MfrName);
		obj2.Madein = "UK";
		System.out.println("Madein:"+obj2.Madein);
		obj2.LaptopPrice = 30000;
		System.out.println("LaptopPrice: "+obj2.LaptopPrice);
		System.out.println("-------------------------------------------");
		obj2.LaptopID = 123;
		System.out.println("LaptopID:"+obj2.LaptopID);
		obj2.MfrName = "Aser";
		System.out.println("ManufacturedName:"+obj2.MfrName);
		obj2.Madein = "USA";
		System.out.println("Madein:"+obj2.Madein);
		obj2.LaptopPrice = 38000;
		System.out.println("LaptopPrice:"+obj2.LaptopPrice);
		System.out.println("-------------------------------------------");
		obj2.LaptopID = 124;
		System.out.println("LaptopID:"+obj2.LaptopID);
		obj2.MfrName = "Dell";
		System.out.println("ManufacturedName:"+obj2.MfrName);
		obj2.Madein = "India";
		System.out.println("Madein:"+obj2.Madein);
		obj2.LaptopPrice = 40000;
		System.out.println("LaptopPrice:"+obj2.LaptopPrice);
		System.out.println("-------------------------------------------");
		
		Mobile obj3 = new Mobile();
		obj3.MobileNo = 952158622;
		System.out.println("MobileNo:"+obj3.MobileNo);
		obj3.MfrName = "Lenovo";
		System.out.println("ManufacturedName:"+obj3.MfrName);
		obj3.Year = 2018;
		System.out.println("ManufacturedYear:"+obj3.Year);
		obj3.M0bilePrice = 25000;
		System.out.println("MobilePrice:"+obj3.M0bilePrice);
		System.out.println("-------------------------------------------");
		obj3.MobileNo = 952123522;
		System.out.println("MobileNo:"+obj3.MobileNo);
		obj3.MfrName = "One Plus";
		System.out.println("ManufacturedName:"+obj3.MfrName);
		obj3.Year = 2019;
		System.out.println("ManufacturedYear:"+obj3.Year);
		obj3.M0bilePrice = 22000;
		System.out.println("MobilePrice:"+obj3.M0bilePrice);
		System.out.println("-------------------------------------------");
		obj3.MobileNo = 952248622;
		System.out.println("MobileNo:"+obj3.MobileNo);
		obj3.MfrName = "Mi";
		System.out.println("ManufacturedName:"+obj3.MfrName);
		obj3.Year = 2021;
		System.out.println("ManufacturedYear:"+obj3.Year);
		obj3.M0bilePrice = 20000;
		System.out.println("MobilePrice:"+obj3.M0bilePrice);
		System.out.println("-------------------------------------------");
		obj3.MobileNo = 952137622;
		System.out.println("MobileNo:"+obj3.MobileNo);
		obj3.MfrName = "IPhone";
		System.out.println("ManufacturedName:"+obj3.MfrName);
		obj3.Year = 2020;
		System.out.println("ManufacturedYear:"+obj3.Year);
		obj3.M0bilePrice = 49000;
		System.out.println("MobilePrice:"+obj3.M0bilePrice);
		System.out.println("-------------------------------------------");
	}

}
