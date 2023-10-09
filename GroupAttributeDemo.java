package testNGConcepts;

import org.testng.annotations.Test;

public class GroupAttributeDemo {
	
	@Test(groups= {"Software Company"})
	public void Techcompany()
	{
		System.out.println("Company name: Infosys");
	}
	@Test(groups= {"Software Company"})
	public void Techcompany1()
	{
		System.out.println("Company name: TCS");
	}
	@Test(groups= {"Automobile Company"})
	public void Autocompany()
	{
		System.out.println("Company name: Tata");
	}
	@Test(groups= {"Automobile Company"})
	public void Autocompany1()
	{
		System.out.println("Company name: Mahindra");
	}
	@Test
	public void Mobcompany()
	{
		System.out.println("Company name: Apple");
	}
}
