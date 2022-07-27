package exceptions;

public class CatchMultipleException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 try
		 {
         int arr[]= {10,20,30,40,50};
         System.out.println(arr[5]);
		 }
		 catch(ArithmeticException e)
		 {
			 System.out.println(e.getMessage());
		 }catch(NullPointerException e)
		 {
			 System.out.println(e.getMessage());
		 }catch(ArrayIndexOutOfBoundsException e)
		 {
			 System.out.println(e.getMessage());
		 }
		 catch(Exception e)
		 {
			 System.out.println(e.getMessage());
		 }

    }
}
	
	
	
