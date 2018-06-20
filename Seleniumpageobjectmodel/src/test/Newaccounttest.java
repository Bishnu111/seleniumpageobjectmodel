package test;

import java.io.IOException;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import page.Addcontactpage;
import page.BankandCashpage;
import page.NewAccountpage;
import page.TechFiosHomePage;
import page.TechFiosLoginPage;
import util.BrowserFactory;

public class Newaccounttest {

	@Test
	public void NewAccounttest() throws IOException{
			
	WebDriver driver = BrowserFactory.startBrowser("chrome", "http://techfios.com/test/billing/?ng=admin/");
					
			
	TechFiosLoginPage loginPage = PageFactory.initElements(driver, TechFiosLoginPage.class);
			
	loginPage.login_TechFios();
	
	BankandCashpage newaccount = PageFactory.initElements(driver, BankandCashpage.class);
	
	newaccount.bankandcash();
	

	
	NewAccountpage bankandcash= PageFactory.initElements(driver,NewAccountpage.class);
	bankandcash.BankandCash();
	


	driver.close();

	driver.quit();
	
	}	
	
	
	
	
}
