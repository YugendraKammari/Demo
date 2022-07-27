package com.tcs.testing;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test4 {

	@Test
	@Parameters({"x","y"})
	public void test9(int x,int y)
	{
		int z=x+y;
		System.out.println("Sum="+z);
	}
}
