package oops;

import java.util.Scanner;

interface First
{
	void input();
	void add();
}
interface Second extends First
{
	void input1();
	void add();
	void sub();
}

class Dude implements Second
{
	int a,b,c;
	Scanner sc=new Scanner(System.in);
	public void input()
	{
		System.out.println("Enter Two Numbers:");
		a=sc.nextInt();
		b=sc.nextInt();
	}
	public void add()
	{
		 c=a+b;
	}
	void display()
	{
		System.out.println("Sum:"+c);
	}
	@Override
	public void input1() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Two Numbers:");
		a=sc.nextInt();
		b=sc.nextInt();
	}
	@Override
	public void sub() {
		 c=a-b;		
	}
	void display1()
	{
		System.out.println("Sub:"+c);
	}
}

public class Interface2 {

	public static void main(String[] args) {
		Dude sc=new Dude();
		sc.input();
		sc.add();
		sc.display();
		sc.input1();
		sc.sub();
		sc.display1();
		
		

	}

}
