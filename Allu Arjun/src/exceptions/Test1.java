package exceptions;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=0;
		try
		{
		int c=a/b;
		System.out.println("Division="+c);
		}catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}
        System.out.println("hello world");
	}

}
