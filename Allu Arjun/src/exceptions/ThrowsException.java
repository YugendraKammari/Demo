package exceptions;

public class ThrowsException {

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
	 public static void m2() throws ArithmeticException,NullPointerException
	 {
		 System.out.println("m2() started");
		 m3();
		 System.out.println("m2() method completed");
	 }
	 public static void m3() throws ArithmeticException
	 {
		 System.out.println("m3() started");
		 
		 int a=10/0;
		 System.out.println(a);
		 
		 System.out.println("m3() method completed");
		 }
	 
     }


