package Castingassignment3;
class Product
{
	int Productid;
	String Productname;
	int Price;
	Float Rating;
}
class Order
{
	int Orderid;
	String Ordername;
	int Size;	
}
class Sales
{
	int Salesid;
	String Salesname;
	int Year;
	int Price;
}
public class Object2 {

	public static void main(String[] args) {
		Product obj1 = new Product();
		obj1.Productid = 01;
		obj1.Productname = "Hairdryer";
		obj1.Price = 100;
		obj1.Rating = 4.2f;
		System.out.println("Productid:"+obj1.Productid);
		System.out.println("Productname:"+obj1.Productname);
		System.out.println("Price:"+obj1.Price);
		System.out.println("Rating:"+obj1.Rating);
		System.out.println("------------------------------------------");
		obj1.Productid = 02;
		obj1.Productname = "Fan";
		obj1.Price = 1499;
		obj1.Rating = 4.1f;
		System.out.println("Productid:"+obj1.Productid);
		System.out.println("Productname:"+obj1.Productname);
		System.out.println("Price:"+obj1.Price);
		System.out.println("Rating:"+obj1.Rating);
		System.out.println("------------------------------------------");
		obj1.Productid = 03;
		obj1.Productname = "Gasstove";
		obj1.Price = 4999;
		obj1.Rating = 3.1f;
		System.out.println("Productid:"+obj1.Productid);
		System.out.println("Productname:"+obj1.Productname);
		System.out.println("Price:"+obj1.Price);
		System.out.println("Rating:"+obj1.Rating);
		System.out.println("------------------------------------------");
		obj1.Productid = 04;
		obj1.Productname = "keyboard";
		obj1.Price = 500;
		obj1.Rating = 1.0f;
		System.out.println("Productid:"+obj1.Productid);
		System.out.println("Productname:"+obj1.Productname);
		System.out.println("Price:"+obj1.Price);
		System.out.println("Rating:"+obj1.Rating);
		System.out.println("------------------------------------------");
		Order obj2 = new Order();
		obj2.Orderid = 101;
		obj2.Ordername = "Hairdryer";
		obj2.Size = 25;
		System.out.println("Orderid:"+obj2.Orderid);
		System.out.println("Ordername:"+obj2.Ordername);
		System.out.println("Size:"+obj2.Size);
		System.out.println("------------------------------------------");
		obj2.Orderid = 102;
		obj2.Ordername = "Fan";
		obj2.Size = 20;
		System.out.println("Orderid:"+obj2.Orderid);
		System.out.println("Ordername:"+obj2.Ordername);
		System.out.println("Size:"+obj2.Size);
		System.out.println("------------------------------------------");
		obj2.Orderid = 103;
		obj2.Ordername = "Gasstove";
		obj2.Size = 8;
		System.out.println("Orderid:"+obj2.Orderid);
		System.out.println("Ordername:"+obj2.Ordername);
		System.out.println("Size:"+obj2.Size);
		System.out.println("------------------------------------------");
		Sales obj3 = new Sales();
		obj3.Salesid = 01;
		obj3.Salesname = "Hairdryer";
		obj3.Year = 2023;
		obj3.Price = 1400;
		System.out.println("Salesid:"+obj3.Salesid);
		System.out.println("Salesname:"+obj3.Salesname);
		System.out.println("year:"+obj3.Year);
		System.out.println("Price:"+obj3.Price);
		System.out.println("------------------------------------------");
		obj3.Salesid = 02;
		obj3.Salesname = "Fan";
		obj3.Year = 2019;
		obj3.Price = 5300;
		System.out.println("Salesid:"+obj3.Salesid);
		System.out.println("Salesname:"+obj3.Salesname);
		System.out.println("year:"+obj3.Year);
		System.out.println("Price:"+obj3.Price);
		System.out.println("------------------------------------------");
		obj3.Salesid = 03;
		obj3.Salesname = "Gasstove";
		obj3.Year = 2013;
		obj3.Price = 3000;
		System.out.println("Salesid:"+obj3.Salesid);
		System.out.println("Salesname:"+obj3.Salesname);
		System.out.println("year:"+obj3.Year);
		System.out.println("Price:"+obj3.Price);
		System.out.println("------------------------------------------");

	}

}
