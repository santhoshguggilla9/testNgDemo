package testNGConcepts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ParallelExeDemo1 {

	@Test
	public void validateTitle() throws InterruptedException
	{
		WebDriver driver;
		driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		Assert.assertEquals(driver.getTitle(), "Swag Labs");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.name("user-name")).sendKeys("locked_out_user");
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		
		driver.findElement(By.id("login-button")).click();
					
		Thread.sleep(30);
		
		driver.quit();
	}
}
