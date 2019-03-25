package Pages;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base_Class {
	
	Singleton_Class bsc= Singleton_Class.getInstance();
	 WebDriver driver= bsc.getDriver();;
	@BeforeMethod
	public void start()
	{
		
	
	}
	
	@AfterMethod
	public void end()
	{
		
		driver.quit();
	
	}
}
