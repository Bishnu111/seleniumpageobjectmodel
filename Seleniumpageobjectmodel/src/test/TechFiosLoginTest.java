package test;

import java.io.IOException;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import page.TechFiosLoginPage;
import util.BrowserFactory;

public class TechFiosLoginTest {

	@Test
	public void loginTest() throws IOException{
			
	WebDriver driver = BrowserFactory.startBrowser("chrome", "http://techfios.com/test/billing/?ng=admin/");
					
			
	TechFiosLoginPage loginPage = PageFactory.initElements(driver, TechFiosLoginPage.class);
			
				
	loginPage.login_TechFios();

	driver.close();

	driver.quit();
				
		
	}
	}	
	
	
	

