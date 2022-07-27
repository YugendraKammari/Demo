package strings;

public class StringMethods {

	public static void main(String[] args) {
		 String str1="welcome to college";
		 String str2="WELCOME TO COLLEGE";
		 String str3="All The Best for your Carrer";
		 System.out.println(str1.charAt(1));
		 System.out.println(str1.length());
		 System.out.println(str1.substring(3));
		 System.out.println(str1.substring(2,5));
		 
		 System.out.println(str1.contains("wels"));
		 System.out.println(str1.equalsIgnoreCase(str2));
		 System.out.println(str3.isEmpty());
		 System.out.println(str1.concat(str3));
		 System.out.println(str1.replace(" ", "-"));
		 
		 String str1A[]=str1.split(" ");
		 for(String s:str1A)
		 {
			 System.out.println(s);
		 }
		 
		 System.out.println(str1.indexOf('t'));
		 System.out.println(str1.toUpperCase());
		 System.out.println(str2.toLowerCase());
		 

	}

}
