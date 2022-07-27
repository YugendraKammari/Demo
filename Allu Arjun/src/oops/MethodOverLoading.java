package oops;

class Adder
{
	int add(int a,int b)
	{
		return(a+b);
	}
	
	int add(int a,int b,int c)
	{
		return(a+b+c);
	}
	
	double add(double a,double b)
	{
		return(a+b);
	}
}
public class MethodOverLoading {

	public static void main(String[] args) {
		Adder a=new Adder();
		System.out.println(a.add(50, 60));
		System.out.println(a.add(50, 60, 80));
		System.out.println(a.add(50.85, 60.687));

	}

}
