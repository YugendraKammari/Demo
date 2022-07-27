package oops;

class Associate {
	//Data
	private int id;
	private String name;
	private double salary;
	
	void display() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(salary);
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
}


public class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Associate a1=new Associate();
		a1.setId(100);
		a1.setName("Vasu");
		a1.setSalary(50000.589);
	
       System.out.println("Employee1 data");
       System.out.println("id="+a1.getId());
       System.out.println("name="+a1.getName());
       System.out.println("salary="+a1.getSalary());
}
	
}
