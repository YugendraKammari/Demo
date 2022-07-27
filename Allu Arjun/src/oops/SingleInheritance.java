package oops;

class A
{
	int a=10;
	void displayA()
	{
		System.out.println(a);
	}
}
class B extends A
{
	int b=50;
	void displayB()
	{
		System.out.println(b);
		System.out.println(a);
		displayA();
	}
}
public class SingleInheritance {

	public static void main(String[] args) {
	      A oa=new A();
	      oa.displayA();
	      
	      B ob=new B();
	      ob.displayB();
	      ob.displayA();
	      
		

	}

}
