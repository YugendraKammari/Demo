
public class Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int a=500;
		 int b=600;
		 int c=a+b;
		 int d=b-a;
		 int e=a*b;
		 int f=b/a;
		 System.out.println("First="+c);
		 System.out.println("Second="+d);
		 System.out.println(e);
		 System.out.println(f);

	}
     private static int sum(int a, int b) {
    	 return a+b;
     }
     private static int sub(int a, int b) {
    	 return a-b;
     }
     private static int mul(int a, int b) {
    	 return a*b;
     }
     private static int div (int a, int b) {
    	 return a/b;
     }
}
