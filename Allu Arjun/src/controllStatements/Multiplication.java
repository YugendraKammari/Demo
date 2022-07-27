package controllStatements;
import java.util.Scanner;
public class Multiplication {

	public static void main(String[] args) {
		// Program to print multiplication table
		Scanner sc=new Scanner(System.in);
		int mul=1;
		System.out.println("Enter Multiplication Value:");
		int n=sc.nextInt();
		for(int i=1;i<=10;i++)
		{
         mul=n*i;
         System.out.println(n+"*"+i+"="+mul);
		}
	}

}
