package inheritanceassignment;
class Demo1
{
	void student(String name, int age)
	{
		System.out.println("Name ="+name+","+"Age="+age);
	}
}
class Demo2 extends Demo1
{
    void College(String CollegeName,String Location)
   {
	System.out.println("College name ="+CollegeName+","+"Location="+Location);
   }
}
class Demo3 extends Demo2
{
   void Department(String Departmentname, int Departmentcode)
  {
	System.out.println("Name ="+Departmentname+","+"Departmentcode="+Departmentcode);
  }
}
public class MultilevelInheritance {

	public static void main(String[] args) {
		Demo3 o = new Demo3();
		o.student("Rohit",23);
		o.College("SDM","Dharwad");
		o.Department("Mechanical",874);
	}

}
