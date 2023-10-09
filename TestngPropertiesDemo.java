package testngPropertiesFile;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class TestngPropertiesDemo {
	WebDriver driver;
	
	@BeforeTest
	public void setup() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		//Maximizing window
		driver.manage().window().maximize();
	}
	@Test
	public void loginPage() throws IOException
	{
		ReadConfig readProperty = new ReadConfig();
		
		driver.get(readProperty.getUrl());
		driver.findElement(By.id("userName")).sendKeys(readProperty.getUsername());
		driver.findElement(By.id("password")).sendKeys(readProperty.getpassword());
		
		driver.findElement(By.id("login")).click();
	}
	@AfterTest
	public void teardown() 
	{
		driver.quit();
	}

}
