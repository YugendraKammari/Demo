
import java.util.Scanner;
public class Circlescanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter pi value:");
		float pi=sc.nextFloat();
		System.out.println("Enter Radius value:");
		int r=sc.nextInt();
		float a=(pi*r*r);
		System.out.println("Area of circle="+a);
		

	}

}
