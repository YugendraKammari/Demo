package files;
import java.io.*;
public class WriterFileinJava {

	public static void main(String[] args) throws  IOException {
		//open the physical file abc.txt
		File f=new File("abc.txt");
		//To connect the java and physical file
		FileWriter fw=new FileWriter(f,true);
	   //To write Data into file
		fw.write(70);
		fw.write(" welcome to india ");
		char ch[]= {'a','b','c'};
		fw.write(ch);
		
		//to flush the data into file
		fw.flush();
		
		//to close the opened file
		fw.close();
		
		System.out.println("Data Inserted Successfully");
	}

}
