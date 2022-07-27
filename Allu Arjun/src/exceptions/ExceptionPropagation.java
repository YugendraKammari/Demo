package exceptions;

public class ExceptionPropagation {

	public static void main(String[] args) {
		System.out.println("Main method started");
		m1();
        System.out.println("Main method completed");
	}
	
	public static void m1()
	{
		System.out.println("m1() started");
		m2();
		System.out.println("m1() method completed");
	}
	 public static void m2()
	 {
		 System.out.println("m2() started");
		 m3();
		 System.out.println("m2() method completed");
	 }
	 public static void m3()
	 {
		 System.out.println("m3() started");
		 try
		 {
		 int a=10/0;
		 System.out.println(a);
		 }
		 catch(ArithmeticException e)
		 {
			 System.out.println(e.getMessage());
		 }
		 System.out.println("m3() method completed");
		 }
	 }


