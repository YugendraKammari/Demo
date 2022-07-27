package collection;

import java.util.ArrayList;

public class Employee {
	int id;
	String name;
	double salary;
	public Employee(int id,String name,double salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
public String toString ()
{
	return id+" "+name+" "+salary;
}

	public static void main(String[] args) {
		
         ArrayList<Employee> l=new ArrayList<>();
         Employee e1=new Employee(100,"Guna",50000.836);
         Employee e2=new Employee(110,"Radha",60000.536);
         Employee e3=new Employee(120,"Sada",40000.326);
         Employee e4=new Employee(130,"Rana",80000.369);
         
         l.add(e1);
         l.add(e2);
         l.add(e4);
         l.add(e3);
         System.out.println(l);
	}


}