package exceptions;

public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=0;
		try
		{
		int c=a/b;
		System.out.println("Division="+c);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}
		finally
		{
			System.out.println("Finally Block");
		}
        System.out.println("hello world");
	}

}
