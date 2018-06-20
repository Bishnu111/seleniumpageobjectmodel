package test;

import java.io.IOException;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import page.Addcontactpage;
import page.TechFiosHomePage;
import page.TechFiosLoginPage;
import util.BrowserFactory;

public class Addcontacttest {

	@Test
	public void loginTest() throws IOException{
			
	WebDriver driver = BrowserFactory.startBrowser("chrome", "http://techfios.com/test/billing/?ng=admin/");
					
			
	TechFiosLoginPage loginPage = PageFactory.initElements(driver, TechFiosLoginPage.class);
			
	loginPage.login_TechFios();
	
	TechFiosHomePage homepage = PageFactory.initElements(driver, TechFiosHomePage.class);
	homepage.clickingcontactbuttons();
	
	Addcontactpage addcontact= PageFactory.initElements(driver,Addcontactpage.class);
	
	addcontact.Addcontact();

	
	driver.close();

	driver.quit();
	
	}	
	
}
