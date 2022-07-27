package controllStatements;
import java.util.Scanner;
public class WhileLoopStatement {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter i Value:");
		int i=sc.nextInt();
		while(i<=10)
		{
			System.out.println(i);
			i++;
		}

	}

}
