package files;
import java.io.*;
public class FileCreationinJava {

	public static void main(String[] args) throws IOException {
		File f=new File("Folder");
		if(!f.exists())
		{
			f.mkdir();
		}
		 File f1=new File(f,"abc.txt");
		 if(!f.exists())
		 {
			 f1.createNewFile();
		 }
	
          String list[]=f.list();
          for(String s:list)
          {
        	  System.out.println();
          }
	}

}


	


