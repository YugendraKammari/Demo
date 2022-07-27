package arrays;
import java.util.Scanner;
public class onedimensionarray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a[]=new int[6];
		System.out.println("Enter the Elements:");
		for(int b=0;b<6;b++)
		{
			a[b]=sc.nextInt();
		}
		for (int b=0;b<6;b++)
		{
			System.out.println(a[b]);
		}

	}

}
