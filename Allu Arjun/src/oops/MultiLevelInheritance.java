package oops;

class C
{
	int i=80;
	void displayI()
	{
		System.out.println(i);
	}
}
class D extends C
{
	int j=100;
	void displayJ()
	{
		System.out.println(j);
		System.out.println(i);
		displayI();
	}
}
class E extends D
{
	int k=150;
	void displayK()
	{
		System.out.println(k);
		System.out.println(j);
		System.out.println(i);
		displayI();
		displayJ();
	}
}
public class MultiLevelInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         C oc=new C();
         oc.displayI();
         
         D od=new D();
         od.displayJ();
         od.displayI();
         
         E oe=new E();
         oe.displayK();
         od.displayJ();
         od.displayI();
         
	}

}
