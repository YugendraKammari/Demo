package controllStatements;

public class Factorial {

	public static void main(String[] args) {
		//Program to print the factorial number based on the given number.
		int fact=1;
		for(int i=8;i>=1;i--)
		{
			fact=fact*i;
		}
		  System.out.println("Factorial Value of 8:"+fact);
	}

}
