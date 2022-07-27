package oops;

interface I1
{
	public static final int x=100;  //variable
	public void draw();  //Abstract method
}

interface I2 extends I1
{
	public static final int y=100;  //variable
	public void shape();  //Abstract method
}

interface I3 extends I1,I2
{
	public static final int z=100;  //variable
	public void shape();  //Abstract method
	public void draw();

}

class Child1 implements I1
{
	public void draw() 
	{
		System.out.println("In Child1 Draw() method");
	}
}

class Child2 implements I2
{
	public void draw() 
	{
		System.out.println("In Child2 Draw() method");
	}

	@Override
	public void shape() {
		 System.out.println("In Child2 Shape() method");
		
	}
}

class Child3 implements I3
{
	public void draw() 
	{
		System.out.println("In Child3 Draw() method");
	}

	@Override
	public void shape() {
		 System.out.println("In Child3 Shape() method");
		
	}
}

public class Interface1 {

	public static void main(String[] args) {
		I1 i1=new Child1();
		i1.draw();
		
		I2 i2=new Child2();
		i2.draw();
        i2.shape();
        
        I3 i3=new Child3();
		i3.draw();
        i3.shape();
	}

}
