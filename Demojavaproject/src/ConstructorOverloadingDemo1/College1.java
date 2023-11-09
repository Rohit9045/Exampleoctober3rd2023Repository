package ConstructorOverloadingDemo1;
class College
{
	College(String clgName)
	{
		System.out.println("collegeName:"+clgName);
	}
	College(int Code)
	{
		System.out.println("Collegecode:"+Code);
	}
	College(String address,int pincode)
	{
		System.out.println("Address:"+address);
		System.out.println("Pincode:"+pincode);
	}
}
public class College1 {

	public static void main(String[] args) {
		College c1 = new College("SDMCET");
  		College c2 = new College(117);
  		College c3 = new College("Dharwad",580035);
	}

}
