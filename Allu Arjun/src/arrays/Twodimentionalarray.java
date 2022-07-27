package arrays;
import java.util.Scanner;
public class Twodimentionalarray {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 int a[][]=new int[2][2];	
		 System.out.println("Enter The Matrix Value:");
		 for(int b=0;b<2;b++)
		 {
		 for(int c=0;c<2;c++)
		 {
			  a[b][c]=sc.nextInt();
		 }
	}
		 System.out.println("Array Elements");
		 for(int b=0;b<2;b++)
		 {
		 for(int c=0;c<2;c++)
		 {
			 System.out.println(a[b][c]+" ");
		 }
		    System.out.println(" ");
	 }
		 }
	}


