package controllStatements;

import java.util.Scanner;

public class IfelseStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the age:");
		int a=sc.nextInt();
		if(a>=25)
		{
			System.out.println("You are Eligible for Bank Exam");
		}else
		{
			System.out.println("You are Not Eligible for Bank Exam");
		}

	}

}
