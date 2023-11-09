package noargsconstructor;
class Fruit
{
	String FruitName;
	String FruitWeight;
	int FruitPrice;
	String FruitColor;
	Fruit()
	{
		FruitName = "Apple";
		FruitWeight = "1 KG";
		FruitPrice = 80;
		FruitColor = "Red";
		System.out.println("Fruit Name:"+FruitName);
		System.out.println("FruitQuantity:"+FruitWeight);
		System.out.println("FruitPrice:"+FruitPrice);
		System.out.println("FruitColor:"+FruitColor);
		System.out.println("-------------------------------------------------");
	}
}
class Flower
{
	String FlowerName;
	String FlowerWeight;
	int FlowerPrice;
	String FlowerColor;
	Flower()
	{
		FlowerName = "Rose";
		FlowerWeight = "1 KG";
		FlowerPrice = 100;
		FlowerColor = "Red";
		System.out.println("FlowerName:"+FlowerName);
		System.out.println("FlowerWeight:"+FlowerWeight);
		System.out.println("FlowerPrice:"+FlowerPrice);
		System.out.println("FlowerColor:"+FlowerColor);
		System.out.println("-------------------------------------------------");
	}
}
class Vegetable
{
	String VegetableName;
	String VegetableWeight;
	int VegetablePrice;
	String VegetableColor;
	Vegetable()
	{
		VegetableName = "Onion";
		VegetableWeight = "1 KG";
		VegetablePrice = 60;
		VegetableColor = "Purple";
		System.out.println("VegetableName:"+VegetableName);
		System.out.println("VegetableWeight:"+VegetableWeight);
		System.out.println("VegetablePrice:"+VegetablePrice);
		System.out.println("VegetableColor:"+VegetableColor);
		System.out.println("-------------------------------------------------");
	}
}
public class Demo5NoArgs {

	public static void main(String[] args) {

		Fruit obj1 = new Fruit();
		Flower obj2 = new Flower();
		Vegetable obj3 = new Vegetable();

	}

}
