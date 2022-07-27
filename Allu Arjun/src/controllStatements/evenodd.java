package controllStatements;
import java.util.Scanner;
public class evenodd {

	public static void main(String[] args) {
		// Program to check the given value is even or odd.
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number:");
		int a=sc.nextInt();
		if(a%2==0)
		{
			System.out.println("Even");
		}else
		{
			System.out.println("Odd");
		}

	}

}
