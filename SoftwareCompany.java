package testNGParameterDemo;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SoftwareCompany {
	
	@Parameters("SoftwareCompany")
	@Test
	public void TestCase1(String name) 
	{
		System.out.println(name);
	}
}
