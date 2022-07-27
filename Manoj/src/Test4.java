
public class Test4 {
        
	int a=50; //instance variable
    static int m=100; // static variable
    static String college="IIBS";
	
    public static void main(String args[])  {
    
    	Test4 obj=new Test4();
    	int b=150; //local variable
    	System.out.println(obj.m);
    	System.out.println(b);
    	System.out.println(obj.a);
    	System.out.println(Test4.college);
    }
    
	
}
