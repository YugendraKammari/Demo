package exceptions;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int a[]= {10,20,30,40,50};
		 try
		 {
         System.out.println(a[5]);
		 }catch(ArrayIndexOutOfBoundsException e)
		 {
			 System.out.println(e.getMessage());
		 }
		   System.out.println("Hello World");
	}

}
