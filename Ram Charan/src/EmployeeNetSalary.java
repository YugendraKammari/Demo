
import java.util.Scanner;
public class EmployeeNetSalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Basic Salary:");
		double basic=sc.nextDouble();
		System.out.println("Enter HRA Amt:");
		double hra=sc.nextDouble();
		System.out.println("Enter DA Amt:");
		double da=sc.nextDouble();
		System.out.println("Enter PF Amt");
		double pf=sc.nextDouble();
		System.out.println("Enter Tax Amt:");
		double tax=sc.nextDouble();
		double net=(basic+hra+da-pf-tax);
		System.out.println("Employee Net Salary="+net);

	}

}
