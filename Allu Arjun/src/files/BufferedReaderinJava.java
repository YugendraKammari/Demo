package files;
import java.io.*;
public class BufferedReaderinJava {

	public static void main(String[] args) throws IOException {
		 File f=new File("abc.txt");
		 FileReader fr=new FileReader(f);
		 BufferedReader br=new BufferedReader(fr);
		 
		 String s=br.readLine();
		 while(s!=null)
		 {
			 System.out.println(s);
		 }
		 
		 br.close();
		 fr.close();
	}

}

	


