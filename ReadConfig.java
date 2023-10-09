package testngPropertiesFile;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {
	
	Properties properties;
	
	String path="C:\\Users\\santh\\eclipse-workspace\\testNG\\src\\test\\java\\testngPropertiesFile\\Config.properties";
	
	public ReadConfig() throws IOException
	{
		properties=new Properties();
		
		FileInputStream input=new FileInputStream(path);
		properties.load(input);
	}
	public String getUrl() {
		
		String link=properties.getProperty("url");
		if(link!=null)
			return link;
		else
			throw new RuntimeException("url not found in config file");
	}
	public String getUsername() {
		String uname=properties.getProperty("username");
		if(uname!=null)
			return uname;
		else
			throw new RuntimeException("username not found");
	}
	public String getpassword() {
		String pwd=properties.getProperty("password");
		if(pwd!=null)
			return pwd;
		else
			throw new RuntimeException("password not found");
	}
}
