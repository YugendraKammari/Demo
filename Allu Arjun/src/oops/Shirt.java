package oops;

class Employee {
	//Properties
		int id;
		String name;
		int age;
		int marks;
		
		//Methods
		void display()
		{
			System.out.println("id="+id);
			System.out.println("name="+name);
			System.out.println("age="+age);
			System.out.println("marks="+marks);
		}
		void message()
		{
			System.out.println("Welcome to India");
		}
		
	}

public class Shirt {

	public static void main(String[] args) {
		Student s1=new Student(); 
		s1.id=100;
		s1.name="Varun";
		s1.age=18;
		s1.marks=60;
		System.out.println("Student1 Data");
		s1.display();
		
		Student s2=new Student(); 
		s2.id=110;
		s2.name="Vinay";
		s2.age=19;
		s2.marks=70;
		System.out.println("Student2 Data");
		s2.display();
		
		Student s3=new Student();
		s3.id=120;
		s3.name="Vinayak";
		s3.age=20;
		s3.marks=80;
		System.out.println("Student3 Data");
		s3.display();

	}

}
