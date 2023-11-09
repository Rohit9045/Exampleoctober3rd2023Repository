package methodDemo;
class maths1
{
	void addition()
	{
		int x,y,res;
		x=20;
		y=50;
		res=x+y;
		System.out.println("Addition Result:"+res);
	}
}
public class Method1 {

	public static void main(String[] args) {
		maths1 o = new maths1();
		o.addition();
		o.addition();
	}
}
