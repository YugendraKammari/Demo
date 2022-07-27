package oops;

class RBI
{
	double getInterestRate()
	{
		return 6.5;
	}
}
class SBI extends RBI
{
	double getInterestRate()
	{
		return 7.0;
	}
}
class HDFC extends RBI
{
	double getInterestRate()
	{
		return 7.5;
	}
}
class ICICI extends RBI
{
	double getInterestRate()
	{
		return 8.0;
	}
}
class AXIS extends RBI
{
	double getInterestRate()
	{
		return 8.5;
	}
}
public class MethodOverriding {

	public static void main(String[] args) {
		RBI rbi=new RBI();
		RBI sbi=new SBI();
		RBI hdfc=new HDFC();
		RBI icici=new ICICI();
		RBI axis=new AXIS();
		
		System.out.println(rbi.getInterestRate());
		System.out.println(sbi.getInterestRate());
		System.out.println(hdfc.getInterestRate());
		System.out.println(icici.getInterestRate());
		System.out.println(axis.getInterestRate());
		 

	}

}
