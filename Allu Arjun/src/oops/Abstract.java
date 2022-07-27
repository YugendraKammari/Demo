package oops;

abstract class Shape
{
	Shape()
	{
		
	}
	abstract void draw();
	void message() //Non-Abstract method or concrete method
	{
		System.out.println("Welcome to the world of Java");
	}
}

class Rectangle extends Shape
{
	void draw()
	{
		System.out.println("Draw Rectangle");
	}
}

class Circle extends Shape
{
	void draw()
	{
		System.out.println("Draw Circle");
	}
}

class Square extends Shape
{
	void draw()
	{
		System.out.println("Draw Square");
	}
}



public class Abstract {

	public static void main(String[] args) {
		Shape s=new Rectangle();
		s.message();
		s.draw();
		
		Shape s1=new Circle();
		s1.message();
		s1.draw();
		
		Shape s2=new Square();
		s2.message();
		s2.draw();
		
	}

}
