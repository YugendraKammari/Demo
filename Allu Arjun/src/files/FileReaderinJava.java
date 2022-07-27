package files;
import java.io.*;
public class FileReaderinJava {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f=new File("abc.txt");
		FileReader fr=new FileReader(f);
		
		int i=fr.read();
		while(i!=-1)
		{
			System.out.print((char)i);
			i=fr.read();
		}
          fr.close();
	}

}
