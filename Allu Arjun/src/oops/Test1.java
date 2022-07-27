package oops;

class Student {
	//Properties
	int id;
	String name;
	int age;
	int marks;
	
	//If you keep this function in Default then it will convert into Parameterized Constructor
	//If you keep this function in Parameterized then it will convert into Default Constructor
	//Default Constructor   
		Student()
		{
			this.id=100;
			this.name="Vinay";
			this.age=25;
			this.marks=90;
		}
		
		//Parameterized Constructor
		 Student(int id,String name,int age,int marks)
		 {
			 this.id=id;
			 this.name=name;
			 this.age=age;
			 this.marks=marks;
		 }
	
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

public class Test1 {

	public static void main(String[] args) {
		
		Student s1=new Student(150,"Vishwak",25,95);  //To Get Parameterized output
		System.out.println("Student1 Data");
		s1.display();
		
		Student s2=new Student();  //To Get Default output
		System.out.println("Student2 Data");
		s2.display();
		
		
		

	}

}
