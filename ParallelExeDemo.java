package testNGConcepts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ParallelExeDemo {

	WebDriver driver;
	@Test
	public void validateLogo() throws InterruptedException
	{
		driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		
		WebElement logo = driver.findElement(By.xpath("//div[@class='login_logo']"));
		Assert.assertTrue(logo.isDisplayed());
		Thread.sleep(30);	
		//driver.quit();
	}
	
	@Test
	public void validateTitle() throws InterruptedException
	{
		driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		Assert.assertEquals(driver.getTitle(), "Swag Labs");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.name("user-name")).sendKeys("standard_user");
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		
		driver.findElement(By.id("login-button")).click();
		
		
		String linkTest=driver.findElement(By.xpath("//div[@class='app_logo']")).getText();
		System.out.println(linkTest);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Assert.assertEquals(linkTest, "Swag Labs");
		
		Thread.sleep(30);
		
		//driver.quit();
	}
	
}
