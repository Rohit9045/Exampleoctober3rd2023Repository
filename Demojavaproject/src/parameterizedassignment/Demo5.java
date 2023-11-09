package parameterizedassignment;
class Fruit
{
	String FruitName;
	String FruitWeight;
	int FruitPrice;
	String FruitColor;
	Fruit(String FrtName,String FrtWt,int FrtPrice,String FrtClr)
	{
		FruitName = FrtName;
		FruitWeight = FrtWt;
		FruitPrice = FrtPrice;
		FruitColor = FrtClr;
		System.out.println("Fruit Name:"+FruitName);
		System.out.println("FruitWeight:"+FruitWeight);
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
	Flower(String FlwrName,String FlwrWt,int FlwrPrice,String FlwrClr)
	{
		FlowerName = FlwrName;
		FlowerWeight =FlwrWt ;
		FlowerPrice = FlwrPrice;
		FlowerColor = FlwrClr;
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
	Vegetable(String VegName,String VegWt,int VegPrice,String VegClr)
	{
		VegetableName = VegName;
		VegetableWeight = VegWt;
		VegetablePrice = VegPrice;
		VegetableColor = VegClr;
		System.out.println("VegetableName:"+VegetableName);
		System.out.println("VegetableWeight:"+VegetableWeight);
		System.out.println("VegetablePrice:"+VegetablePrice);
		System.out.println("VegetableColor:"+VegetableColor);
		System.out.println("-------------------------------------------------");
	}
}

public class Demo5 {

	public static void main(String[] args) {
		Fruit obj1 = new Fruit("Apple","1KG",80,"Red");
		Flower obj2 = new Flower("Rose","1KG",100,"Red");
		Vegetable obj3 = new Vegetable("Onion","1 KG",60,"Purple");
	}

}
