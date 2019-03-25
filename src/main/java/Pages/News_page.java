package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class News_page extends Base_Class  {
	
	/*Singleton_Class bsc= Singleton_Class.getInstance();
	WebDriver driver = bsc.getDriver();*/

	public void click_World()
	{
		                    
		driver.findElement(By.xpath("//*[@id='orb-modules']/header/div[2]/div/div[1]/nav/ul/li[3]/a/span")).click(); //world
		
	}

}
