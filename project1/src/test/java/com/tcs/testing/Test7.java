package com.tcs.testing;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test7 {

	@Test
	public void testAssertNull()
	{
		String name=null;
		Assert.assertNull(name);
	}
	
	@Test
	public void testAssertNotNull()
	{
		String name="welcome";
		Assert.assertNotNull(name);
	}
	
	@Test
	public void testAssertSame()
	{
		String name1="welcome";
		String name2="welcome";
		Assert.assertSame(name1,name2);
	}

	@Test
	public void testAssertNotSame()
	{
		String name1="welcome";
		String name2="welcome";
		Assert.assertNotSame(name1,name2);
	}
}
