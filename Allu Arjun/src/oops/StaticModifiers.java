package oops;


public class StaticModifiers {
	   int a=10;  //Instance/Object Member
	   static int b=20;  //Class Member
	   
	   void method()
	   {
		   System.out.println(a);
		   System.out.println(b);
	   }
	   static void method2()  //Static Method
	   {
		   System.out.println(b);
	   }

	public static void main(String[] args) {
		//Static members can be access without creating objects.
		System.out.println(b);
		method2();
		//we cannot access the non static members without creating the objects
		StaticModifiers obj=new StaticModifiers();
		System.out.println(obj.a);
		System.out.println(obj.b);
		obj.method();
		obj.method2();

	}

}
