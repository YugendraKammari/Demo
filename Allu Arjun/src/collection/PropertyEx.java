package collection;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyEx {

	public static void main(String[] args) throws IOException {
		File f=new File("Student.txt");
		FileInputStream fis=new FileInputStream(f);
		
		Properties p=new Properties();
        p.load(fis);
        System.out.println(p);
        System.out.println(p.getProperty("NTR"));
        
     }
}