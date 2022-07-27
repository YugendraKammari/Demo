package com.tcs.testing;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Test3 {
	
	
	@Test(enabled = false)
	public void test6()
	{
		System.out.println("In Test6");
	}
	
	@Test
	public void test7()
	{
		System.out.println("In Test7");
	}
	
	@Test(groups = "GroupB")
	public void test8()
	{
		System.out.println("In Test8");
	}



    @BeforeClass
    public void beforeClass()
    {
          System.out.println("Before Test3 Class");
    }
    
    @AfterClass
    public void afterClass()
    {
   	 System.out.println("After Test3 Class");
    }
}
