package testNGConcepts;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AnnotationAttributes {
	
	
	@Test(priority=3)
	public void banana()
	{
		System.out.println("Test Case banana executed!");
	}
	@Test(priority=2)
	public void Apple()
	{
		System.out.println("Test Case apple executed!");
	}
	@Test(priority=1, enabled=false)
	public void cat()
	{
		System.out.println("Test Case cat executed!");
	}
	
	@Test(description="this is descripted testcase",dependsOnMethods= {"cat","Apple"})
	public void doll()
	{
		System.out.println("Test Case doll for description!");
		//Assert.assertTrue(false);
	}

}
