package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Asia_News_page extends Base_Class {
	/*Singleton_Class bsc= Singleton_Class.getInstance();
	WebDriver driver = bsc.getDriver();*/
	
	public void get_Headline()
	{
		
		String s=driver.findElement(By.xpath("//span[@class='title-link__title-text']")).getText(); //Headlines
		System.out.println(" Todays Asia Heshline is :"+s);
	}
}
