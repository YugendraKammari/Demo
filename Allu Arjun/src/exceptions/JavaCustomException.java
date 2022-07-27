package exceptions;


class InvalidAgeException extends Exception
{
	public InvalidAgeException(String massage)
	{
		super(massage);
	}
}


public class JavaCustomException {

	public static void main(String[] args) throws InvalidAgeException 
	{
	 int age=15;
	 if(age<18)
	 {
		 throw new InvalidAgeException("Invalid age");
	 }
	 else
	 {
		 System.out.println("Valid age");
	 }
	  System.out.println("Welcome to Vote");

	}

}
