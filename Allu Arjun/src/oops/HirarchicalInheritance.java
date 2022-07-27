package oops;

class Z
{
	int p=80;
	void displayP()
	{
		System.out.println(p);
	}
}
class Y extends Z
{
	int q=100;
	void displayQ()
	{
		System.out.println(p);
		System.out.println(q);
		displayP();
	
	}
}
class X extends Z
{
	int r=150;
	void displayR()
	{
		System.out.println(r);
		System.out.println(p);
		displayP();
	}
}

public class HirarchicalInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Z oz=new Z();
         oz.displayP();
         
         Y oy=new Y();
         oy.displayQ();
         oy.displayP();
         
         X ox=new X();
         ox.displayP();
         ox.displayR();
         
         
	}

}

	


