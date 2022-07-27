package exceptions;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name=null;
		try
		{
			System.out.println(name.length());
		}catch(NullPointerException e)
		{
			System.out.println(e.getMessage());
		}
          System.out.println("Welcome to India");
	}

}
