package controllStatements;

import java.util.Scanner;

public class NestedifStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter age:");
         int age=sc.nextInt();
         System.out.println("Enter Weight:");
         double weight=sc.nextDouble();
     if (age>=25)
     {
         if (weight>=60)
         {
        	 System.out.println("You are Eligible to Donate Blood");
         }
         else
         {
        	 System.out.println("Your weight is less So you are not Eligible to Donate Blood");
         }
     }else
         {
        	 System.out.println("You are Minor So you are not Eligible to Donate Blood");
         }
         }
	}


