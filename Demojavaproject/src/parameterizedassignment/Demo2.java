package parameterizedassignment;

class Product
{
	int Productid;
	String Productname;
	int Price;
	Float Rating;
	Product(int Prodtid,String Prodtn,int price,Float Ratg)
	{
		Productid = Prodtid;
		Productname = "Prodtn";
		Price = price;
		Rating = Ratg;
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
	Order(int Ordid,String Ordn,int size)
	{
		Orderid = Ordid;
		Ordername = Ordn;
		Size = size;
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
	Sales(int Salid,String Salname,int Yr,int amt)
	{
		Salesid = Salid;
		Salesname = Salname;
		Year = Yr;
		Price = amt;
		System.out.println("Salesid:"+Salesid);
		System.out.println("Salesname:"+Salesname);
		System.out.println("year:"+Year);
		System.out.println("Price:"+Price);
		System.out.println("------------------------------------------");
	}
}

public class Demo2 {

	public static void main(String[] args) {
		Product obj1 = new Product(01,"keyboard",1200,4.2f);
		Order obj2 = new Order(01,"keyboard",20);
		Sales obj3 = new Sales(101,"keyboard",2012,1200);
	}


}


