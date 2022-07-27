
public class Data2 {
	 int id= 12854;
	 String name= "MR GOWTHAM";
	 byte age= 26;
	 String profile= "System Engineer";
	 long mobile= 8456123654L;
	 char gender= 'M';
	 int basicpay= 70000;
	 int pf= 8000;
	 int da= 4000;
	 int tax= 6000;
	 double netsalary=(basicpay+pf+da);
	 
	 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Data2 obj=new Data2();
        System.out.println(obj.id);
        System.out.println(obj.name);
        System.out.println(obj.age);
        System.out.println(obj.profile);
        System.out.println(obj.mobile);
        System.out.println(obj.gender);
        System.out.println(obj.basicpay);
        System.out.println(obj.pf);
        System.out.println(obj.da);
        System.out.println(obj.tax);
        System.out.println(obj.netsalary);
        
        
	}

}
