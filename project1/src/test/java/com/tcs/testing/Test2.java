package com.tcs.testing;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Test2 {
	
	@Test(priority = 4,groups = "GroupA")
	public void test4()
	{
		System.out.println("In Test4");
	}
	
	@Test(priority = 4,groups = "GroupA")
	public void test5()
	{
		System.out.println("In Test5");
	}


    @BeforeClass
    public void beforeClass()
    {
	 System.out.println("Before Test2 Class");
    }
    
    @AfterClass
    public void afterClass()
    {
   	 System.out.println("After Test2 Class");
    }
}