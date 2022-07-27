package exceptions;

public class ThrowException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age=15;
		if(age>18) {
			throw new ArithmeticException("Invalid age");
		}else
		{
			System.out.println("Valid age");
		}
		
		System.out.println("Welcome to Vote");

	}

}
