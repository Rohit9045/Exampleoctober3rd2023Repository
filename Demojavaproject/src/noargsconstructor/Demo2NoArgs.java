package noargsconstructor;
class Product
{
	int Productid;
	String Productname;
	int Price;
	Float Rating;
	Product()
	{
		Productid = 01;
		Productname = "Hairdryer";
		Price = 100;
		Rating = 4.2f;
		System.out.println("Productid:"+Productid);
		System.out.println("Productname:"+Productname);
		System.out.println("Price:"+Price);
		System.out.println("Rating:"+Rating);
		System.out.println("------------------------------------------");
	}
}
class Order
{
	int Orderid;
	String Ordername;
	int Size;
	Order()
	{
		Orderid = 101;
		Ordername = "Hairdryer";
		Size = 25;
		System.out.println("Orderid:"+Orderid);
		System.out.println("Ordername:"+Ordername);
		System.out.println("Size:"+Size);
		System.out.println("------------------------------------------");
	}
}
class Sales
{
	int Salesid;
	String Salesname;
	int Year;
	int Price;
	Sales()
	{
		Salesid = 01;
		Salesname = "Hairdryer";
		Year = 2023;
		Price = 1400;
		System.out.println("Salesid:"+Salesid);
		System.out.println("Salesname:"+Salesname);
		System.out.println("year:"+Year);
		System.out.println("Price:"+Price);
		System.out.println("------------------------------------------");
	}
}
public class Demo2NoArgs {

	public static void main(String[] args) {
		Order obj2 = new Order();
		Product obj1 = new Product();
		Sales obj3 = new Sales();
	}
}


		
		
		
		
		
		
		
		
		



	


