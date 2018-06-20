package test;

import java.io.IOException;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import page.NewProductpage;
import page.Productandservicepage;
import page.TechFiosLoginPage;
import util.BrowserFactory;

public class Newproducttest {

	@Test
	public void loginTest() throws IOException{
			
	WebDriver driver = BrowserFactory.startBrowser("chrome", "http://techfios.com/test/billing/?ng=admin/");
					
			
	TechFiosLoginPage loginPage = PageFactory.initElements(driver, TechFiosLoginPage.class);
			
	loginPage.login_TechFios();
	
	Productandservicepage addnewproduct = PageFactory.initElements(driver, Productandservicepage.class);
	
	addnewproduct.newproduct();
	
	NewProductpage newproduct01= PageFactory.initElements(driver,NewProductpage.class);
	newproduct01.newproduct();
	
	driver.close();

	driver.quit();
	
	
	}	
}
