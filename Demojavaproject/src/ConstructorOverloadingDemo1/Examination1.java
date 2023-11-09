package ConstructorOverloadingDemo1;
class Examination
{
	Examination(String Exam)
	{
		System.out.println("Examination:"+Exam);
	}
	Examination(int Examcode)
	{
		System.out.println("ExaminationCode:"+Examcode);
	}
	Examination(String address,int Pincode)
	{
		System.out.println("Address:"+ address);
		System.out.println("Pincode:"+Pincode);
	}
}
public class Examination1 {

	public static void main(String[] args) {
		Examination e1 = new Examination("TenthBoardExam");
		Examination e2 = new Examination(1215);
		Examination e3 = new Examination("Hubli",580023);

	}

}


