package controllStatements;
import java.util.Scanner;
public class GenderLoop {

	public static void main(String[] args) {
		// 1)Program to check male or femare based on the gender.
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Gender(m/f):");
		String gender=sc.next();
		if(gender.equals("m"))
		{
			System.out.println("Male");
		}else
			System.out.println("Female");

	}

}
