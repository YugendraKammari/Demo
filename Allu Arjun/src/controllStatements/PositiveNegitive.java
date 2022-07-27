package controllStatements;
import java.util.Scanner;
public class PositiveNegitive {

	public static void main(String[] args) {
		// Program to check the given value is possitive or negative
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Value:");
		int a=sc.nextInt();
		if(a>0)
		{
			System.out.println("Positive");
		}else
		 if(a<0)
		{
			System.out.println("Negative");
		}
		

	}

}
