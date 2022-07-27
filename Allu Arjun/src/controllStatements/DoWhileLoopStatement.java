package controllStatements;
import java.util.Scanner;
public class DoWhileLoopStatement {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter i Value:");
		int i=sc.nextInt();
		do
		{
			System.out.println(i);
			i++;
		}while (i<=10);

	}

}
