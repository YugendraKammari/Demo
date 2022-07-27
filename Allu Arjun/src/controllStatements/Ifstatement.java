package controllStatements;

import java.util.Scanner;

public class Ifstatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the age:");
          int age=sc.nextInt();
          if(age>=22)
          {
        	  System.out.println("You are Eligible for Written Test");
          }
	}

}
