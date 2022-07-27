
public class Test3 {
	  int n=200; //instance variable
	  
	  static String college="IIBS"; //static variable

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Test3 obj=new Test3(); //obj created for sample class
		int a=500; //local variable
		System.out.println(obj.n);
		System.out.println(a);
		System.out.println(obj.college);
		System.out.println(Test3.college);

	}

}
