package oops;

class Ex1
{
	private int a=10;  //Access Modifier Private
	int b=20;  //Default Modifier 
	protected int c=30; //Protected Modifier
	public int d=40; //Public Modifier
	
	    private void display() {
		System.out.println(a);	
		System.out.println(b);	
		System.out.println(c);	
		System.out.println(d);
		}
	void greetings()
	{
		System.out.println("Hello");
	}
}

class Ex2 extends Ex1
{
	void display()
	{
		System.out.println(c);
		System.out.println(b);
		System.out.println(d);
	}
}
class Ex3
{
	void method()
	{
		Ex1 obj=new Ex1();
		obj.d=40;
	}
}
public class Modifiers {

	public static void main(String[] args) {
		 Ex1 obj=new Ex1();
		 Ex2 obj2=new Ex2();
		 System.out.println(obj.d);
		 System.out.println(obj2.b);
		 System.out.println(obj.c);
		 System.out.println(obj2.d);
		 System.out.println(obj.b);
		 System.out.println(obj2.c);
		 System.out.println("Hello world");
		 
		 
		 
		 
		 

	}

}
