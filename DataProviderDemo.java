package testNGConcepts;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {
	WebDriver Driver;
	@BeforeMethod
	public void invokeBrowser(){
		Driver = new FirefoxDriver();
		Driver.manage().window().maximize();
		Driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	
	@Test (dataProvider="getData")
	public void facebookLogin(String username, String password){
	
	Driver.get("http://www.facebook.com");
	Driver.findElement(By.id("email")).sendKeys(username);
	Driver.findElement(By.id("pass")).sendKeys(password);
	Driver.findElement(By.name("login")).click();
	Driver.close();
	
	}
	
	@DataProvider
	public Object[][] getData(){
		Object[][] data = new Object[4][2];
		data[0][0] = "username1@gmail.com";
		data[0][1] = "password1";
		data[1][0] = "username2@gmail.com";
		data[1][1] = "password2";
		data[2][0] = "username3@gmail.com";
		data[2][1] = "password3";
		data[3][0] = "username4@gmail.com";
		data[3][1] = "password4";
		return data;
	}
}
