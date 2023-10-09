package testNGConcepts;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionsDemo {

	WebDriver Driver;
	@Test
	public void compareTitle(){
		Driver = new FirefoxDriver();
		Driver.manage().window().maximize();
		Driver.get("http://www.qatechhub.com");
		Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		System.out.println("Title of page:" + Driver.getTitle());

		Assert.assertEquals(Driver.getTitle(), "QA Automation Tools Trainings and Tutorials | QA Tech Hub");
		//Assert.assertEquals(Driver.getTitle(), "QA Automation Tools Trainings and Tutorials | QA Tech Hub", "Both are same");
		Driver.close();
	}

}
