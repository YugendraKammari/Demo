
public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a=20;
        int b=30;
        int c=40;
        int d=a+b+c;
        int e=(a-b)-c;
        int f=(a*b)*c;
        int g=(a/b)/c;
        
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
	}
   private static int sum(int a,int b) {
	   return a+b;
   }
   private static int sub(int a,int b) {
	   return b-a;
   }
   private static int mul(int a,int c) {
	   return a*c;
   }
   private static int div(int c,int b) {
	   return c/b;
   }
}
