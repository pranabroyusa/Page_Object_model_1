package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Home_Page extends Base_Class {
	/*Singleton_Class bsc= Singleton_Class.getInstance();
	WebDriver driver = bsc.getDriver();*/
	
	public void verify_Title()
	{
		
		driver.get("https:www.bbc.com");
		driver.manage().window().maximize();
		Assert.assertEquals(driver.getTitle(), "BBC - Homepage");
		driver.findElement(By.xpath("//*[@id='orb-nav-links']/ul/li[2]/a")).click(); //News
	}
	
	
	public void click_News()
	{
		
		driver.findElement(By.xpath("//*[@id='orb-nav-links']/ul/li[2]/a")).click(); //News
		
	}
	public void click_Sports()
	{
		
		driver.findElement(By.xpath("//*[@id='orb-nav-links']/ul/li[2]/a")).click(); //News
	}
	
	

}
