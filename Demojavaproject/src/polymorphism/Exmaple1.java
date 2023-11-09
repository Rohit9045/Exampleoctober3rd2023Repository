package polymorphism;
abstract class figure
{
	abstract void calculatearea();
}
class Square extends figure
{
	void calculatearea()
	{
	int side = 5;
	System.out.println("Area of square:"+(side*side));
    }
}
class rectangle extends figure
{
	void calculatearea()
	{
		int l,b;
		l=10;b=20;
		System.out.println("Area of rectangle:"+(l*b));
	}
}
class circle extends figure
{
	void calculatearea()
	{
		double pi = 3.142;
		double radius = 2.1;
		System.out.println("Area of circle:"+(pi*radius*radius));
	}
}

public class Exmaple1 {

	public static void main(String[] args) {
		figure o = null;
		Square o1 = new Square();
		rectangle o2 = new rectangle();
        circle o3 = new circle();
         o = o1;
         o.calculatearea();
         o = o2;
         o.calculatearea();
         o = o3;
         o.calculatearea();
	}

}
