package tests;

import org.testng.annotations.Test;

import Pages.Asia_News_page;
import Pages.Home_Page;
import Pages.News_page;
import Pages.World_Page;


public class Test1 {
	
	Home_Page hp=new Home_Page();
	News_page np=new News_page();
	World_Page wp=new World_Page();
	Asia_News_page anp=new Asia_News_page();
	@Test
	public void get_Asia_Headlenes()
	{
		
		hp.verify_Title();
		hp.click_News();
		np.click_World();
		wp.click_Asia();
		anp.get_Headline();
		
		
	}

}
