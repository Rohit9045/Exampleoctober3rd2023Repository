package Assignment;

public class Longarray {

	public static void main(String[] args) {
	long[] longarray = {1001,2001,3001,4001,5001};
	System.out.println("longarray:");
	int i = longarray.length/2;
	do {
		System.out.println(longarray[i]);
		i++;
	   }while(i < longarray.length);
	}

}
