
public class Logicaloperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=500;
		int b=400;
		int c=300;
		
		System.out.println((a<b)&&(b<c)); //logical AND
		System.out.println((a<b)||(b>c)); //logical OR
		System.out.println(!(a<b)); //logical NOT
		// Ternary Operator
		System.out.println((a>b)?a:b); //Ternary operator
		// Bitwise Operator
		System.out.println(a&b); //Bitwise AND
		System.out.println(a|b); //Bitwise OR
		System.out.println(a^b); //Bitwise XOR
		System.out.println(~a);  //Bitwise Compliment
		// Shirt Operator
		System.out.println(a<<1); //Left side
		System.out.println(a>>1); //Right side
				
	}

}
