package strings;

public class StringBufferTest {

	public static void main(String[] args) {
		  StringBuffer name=new StringBuffer("yuga");
		  name.append("nath");
		  System.out.println(name);
		  name.insert(4, "master");
		  System.out.println(name);
		  System.out.println(name.replace(4, 4, " -"));
		  System.out.println(name.delete(6, 7));
		  System.out.println(name.reverse());
	}

}
