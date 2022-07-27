package arrays;
import java.util.Scanner;
public class SumofTwoMatrix {

	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int a[][]= new int[2][2];
	    int b[][]= new int[2][2];
	    int c[][]= new int[2][2];
	    System.out.println("Enter the Matrix Value:");
	    for(int i=0;i<2;i++)
	    {
	      for(int j=0;j<2;j++)
	      {
	    	  a[i][j]=sc.nextInt();
	      }
	    }
	    for(int i=0;i<2;i++)
	    {
		   for(int j=0;j<2;j++)
		   {
			   b[i][j]=sc.nextInt();
		   }
	    }
	    for(int i=0;i<2;i++)
	    {
		   for(int j=0;j<2;j++)
		   {
			   c[i][j]=a[i][j]+b[i][j]; 
	       }
        }
	    System.out.println("Matrix A:");
	    for(int i=0;i<2;i++)
	    {
	      for(int j=0;j<2;j++)
	      {
	    	 System.out.println(a[i][j]+" ");
	    }
	     System.out.println(" ");
	    }
	    System.out.println("Matrix B:");
	    for(int i=0;i<2;i++)
	    {
	      for(int j=0;j<2;j++)
	      {
	    	 System.out.println(b[i][j]+" ");
	    }
	     System.out.println(" ");
	    }
	    System.out.println("Matrix C:");
	    for(int i=0;i<2;i++)
	    {
	      for(int j=0;j<2;j++)
	      {
	    	 System.out.println(c[i][j]+" ");
	    }
	     System.out.println(" ");
	    }
    }
	    	
  }
	    
