package exceptions;

public class NestedTryException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         try
         {
           int a=20/0;
           System.out.println(a);
           
         try
         {
        	 String name=null;
        	 System.out.println(name.length());
         }catch(NullPointerException e)
         {
        	 System.out.println(e.getMessage());
         }
         }
         catch(ArithmeticException e)
         {
        	 System.out.println(e.getMessage());
         }finally
         {
        	 System.out.println("Finally Block");
         }
         
	}
	
}
          
         
  
	




