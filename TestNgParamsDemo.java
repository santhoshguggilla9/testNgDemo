package testNGParameterDemo;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNgParamsDemo {

	@Test
	@Parameters({"i","j"})
	public void add(int a, int b)
	{
		System.out.println("addition :" + (a+b));
	}
	@Test
	@Parameters({"i","j"})
	public void sub(int a, int b)
	{
		System.out.println("Subtraction :" + (a-b));
	}
	@Test
	@Parameters({"i","j"})	
	public void mul(int a, int b)
	{
		System.out.println("Multilication :" + (a*b));
	}
}
