package controllStatements;

public class DoWhileLoop2 {

	public static void main(String[] args) {
		int i=1;
		do
		{
			int j=1;
			do {
				System.out.println(i+"-"+j);
				j++;
			}while(j<=10);
			
			i++; //increment
		    }while(i<=10); //condition
		}

	}


