package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class World_Page extends Base_Class {
	/*Singleton_Class bsc= Singleton_Class.getInstance();
	WebDriver driver = bsc.getDriver();*/
	
	public void click_Asia()
	{
		
		driver.findElement(By.xpath("//*[@id='site-container']/div[1]/div[4]/nav/ul/li[2]/a")).click(); //News
	}

}
