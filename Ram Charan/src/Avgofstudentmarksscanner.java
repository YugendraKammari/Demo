
import java.util.Scanner;
public class Avgofstudentmarksscanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter m1 marks:");
		float m1=sc.nextFloat();
		System.out.println("Enter m2 marks:");
		double m2=sc.nextDouble();
		System.out.println("Enter m3 marks:");
		int m3=sc.nextInt();
		System.out.println("Enter m4 marks:");
		double m4=sc.nextDouble();
		System.out.println("Enter m5 marks:");
		int m5=sc.nextInt();
		double avg=(m1+m2+m3+m4+m5)/5;
		System.out.println("Avg marks of student="+avg);

	}

}
