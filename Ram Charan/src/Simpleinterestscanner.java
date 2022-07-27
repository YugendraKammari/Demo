
import java.util.Scanner;
public class Simpleinterestscanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Principal Value:");
		double p=sc.nextDouble();
		System.out.println("Enter Time:");
		int t=sc.nextInt();
		System.out.println("Enter Interest Rate:");
		float r=sc.nextFloat();
		double sim=(p*t*r)/100;
		System.out.println("Simple Interest="+sim);

	}

}
