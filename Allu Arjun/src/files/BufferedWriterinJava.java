package files;
import java.io.*;
public class BufferedWriterinJava {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f=new File("abc.txt");
		FileWriter fw=new FileWriter(f);
		BufferedWriter bw=new BufferedWriter(fw);
		
		bw.write(70);
		bw.newLine();
		bw.write("welcome to india");
		bw.newLine();
		char ch[]= {'a','b','c'};
		bw.write(ch);
		
		bw.flush();
		
		bw.close();
		fw.close();
	}

}
