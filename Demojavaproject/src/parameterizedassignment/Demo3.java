package parameterizedassignment;
class Destop
{
	int DestopID;
	String MfrName;
	String DestopType;
	int DestopPrice;
	Destop(int DtpID,String Mfr,String DetpType,int DetpPr)
	{
		DestopID = DtpID;
		MfrName = Mfr;
		DestopType = DetpType;
		DestopPrice = DetpPr;
		System.out.println("DestopID:"+DestopID);
		System.out.println("MfrName:"+MfrName);
		System.out.println("DestopType:"+DestopType);
		System.out.println("DestopPrice:"+DestopPrice);
		System.out.println("-------------------------------------------");
	}
}	
class Laptop
{
	int LaptopID;
	String MfrName;
	String Madein;
	int LaptopPrice;
	Laptop(int LapID,String MfrN,String Mi,int LapPrice)
	{
		LaptopID = LapID;
		MfrName = MfrN;
		Madein = Mi;
		LaptopPrice = LapPrice;
		System.out.println("LaptopID:"+LaptopID);
		System.out.println("MfrName:"+MfrName);
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
	int MobilePrice;
	Mobile(int MobNo,String Mfr,int Yr,int MobPrice)
	{
		MobileNo = MobNo;
		MfrName = Mfr;
		Year = Yr;
		MobilePrice = MobPrice;
		System.out.println("MobileNo:"+MobileNo);
		System.out.println("ManufacturedName:"+MfrName);
		System.out.println("ManufacturedYear:"+Year);
		System.out.println("MobilePrice:"+MobilePrice);
		System.out.println("-------------------------------------------");	
	}
}

public class Demo3 {

	public static void main(String[] args) {
		Destop obj1 = new Destop(111,"HP","Home",25000);
		Laptop obj2 = new Laptop(121,"Lenovo","JAPAN",25000);
		Mobile obj3 = new Mobile(201,"iphone",2022,45000);
	}
}
