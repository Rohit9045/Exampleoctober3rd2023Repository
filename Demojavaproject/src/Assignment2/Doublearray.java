package Assignment2;

public class Doublearray {

	public static void main(String[] args) {
		Double a[][]= {{21.2,22.6,85.2},{65.1,48.3,96.1},{75.1,85.2,33.6}};
		  for (int i=a.length-1;i>=0;i--)
		  {
              for(int j=a[i].length-1;j>=0;j--)
              {
            	  System.out.print(a[i][j]+" ");
              }
                 System.out.println();
		  }
	}

}
