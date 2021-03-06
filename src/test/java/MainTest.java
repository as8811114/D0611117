package main.java;


import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

import junit.framework.Assert;
public class MainTest {

	@Test(expected = Exception.class)
	public void test() throws Exception
	{
		Main a = new Main();
		a.triangleType(1, 3, -3);
	}
	
	@Test(expected = Exception.class)
	public void test2() throws Exception
	{
		Main a = new Main();
		a.triangleType(1,2, 3);
	}
	
	@Test
	public void test3() 
	{
		Main a = new Main();
		try
		{
			assertEquals("B triangle",a.triangleType(1,3,3));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
}