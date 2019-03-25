package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;



public class Singleton_Class {
	
	
	 private WebDriver driver;
	// instance of singleton class
		private static Singleton_Class base_Singleton_Class=null;

	    // Constructor
	    private Singleton_Class(){
	    	System.setProperty("webdriver.chrome.driver","C:\\Users\\Pranab Roy\\Desktop\\Drivers\\chromedriver.exe");
			driver= new ChromeDriver();
	    }
	    
	    // TO create instance of class
	    public static Singleton_Class getInstance(){
	        if(base_Singleton_Class==null){
	        	base_Singleton_Class = new Singleton_Class();
	        }
	        return base_Singleton_Class;
	    }
	    
	    // To get driver
	    public WebDriver getDriver()
	    {
	    	return driver;
	    }
	
	
	
	

}
