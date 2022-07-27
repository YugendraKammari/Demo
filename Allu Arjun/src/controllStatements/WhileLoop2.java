package controllStatements;

public class WhileLoop2 {

	public static void main(String[] args) {
        int i=1; //initialization
		while(i<=100) //condition
		{
		   int j=1;
		   while(j<=10)	
		   {
			   System.out.println(i+"-"+j);
			   j++;
			   }
		   i++; //increment
		   }

	}

}
