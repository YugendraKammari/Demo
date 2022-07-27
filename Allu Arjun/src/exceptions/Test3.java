package exceptions;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          String n="50a";
          //int num=Integer.parseInt(n);
          System.out.println();
          try
          {
        	  System.out.println(n.charAt(3));
          }catch(StringIndexOutOfBoundsException e)
          {
        	  System.out.println(e.getMessage());
          }
             System.out.println("Welcome to India");
	}

}
