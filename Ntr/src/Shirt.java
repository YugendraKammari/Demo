
public class Shirt {
	int id=12358;
	String name= "MR SEHWAG";
	String profile= "System Engineer";
	byte age= 26;
	char gender='M';
	long mobileno= 8524796458L;
	int basicsalary= 70000;
	int DA= 6000;
	int HRA= 5000;
	int PF= 8000;
	int avg=(basicsalary+DA+HRA+PF/5);
	int Tax=9000;
	double netsalary=(basicsalary+DA+HRA+PF-Tax);
	 
		public static void main(String[] args) {
		// TODO Auto-generated method stub
			Shirt obj=new Shirt();
		System.out.println(obj.id);
		System.out.println(obj.name);
		System.out.println(obj.age);
		System.out.println(obj.profile);
		System.out.println(obj.gender);
		System.out.println(obj.mobileno);
		System.out.println(obj.basicsalary);
		System.out.println(obj.DA);
		System.out.println(obj.HRA);
		System.out.println(obj.PF);
		System.out.println(obj.avg);
		System.out.println(obj.Tax);
		System.out.println(obj.netsalary);
		
		
	}
	
   }


	
		
		
	


