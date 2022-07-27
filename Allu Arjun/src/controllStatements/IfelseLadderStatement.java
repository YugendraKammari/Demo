package controllStatements;

import java.util.Scanner;

public class IfelseLadderStatement {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Marks:");
		int marks=sc.nextInt();
		
		if(marks<35)
		{
			System.out.println("Fail");
		}
		else if ((marks>=35)&&(marks<=50))
		{
			System.out.println("Third Class");
		}
		else if ((marks>=50)&&(marks<=75))
		{
			System.out.println("Second Class");
		}
		else if ((marks>=75)&&(marks<=100))
		{
			System.out.println("Distinction");
		}
		else
		{
			System.out.println("Invalid Marks");
		}
	}

}
