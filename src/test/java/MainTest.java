package main.java;

import java.util.Arrays;

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
			assertEquals("等腰三角形",a.triangleType(1,3,3));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		a.triangleType(1, 3, -3);
	}
}