package testNGParameterDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNGParameterGoogleDemo {
	
	@Parameters({"keyword"})
	@Test
	public void googleSearch(String searchData) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		WebElement searchBox= driver.findElement(By.name("q"));
		searchBox.sendKeys(searchData);
		
		//Thread.sleep(3000);
		
		//Assert.assertEquals(searchData, searchBox.getAttribute("value"));
		
		//driver.quit();
	}
}
