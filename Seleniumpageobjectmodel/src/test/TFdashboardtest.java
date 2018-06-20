package test;

import java.io.IOException;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import page.TechFiosHomePage;
import page.TechFiosLoginPage;
import util.BrowserFactory;

public class TFdashboardtest {

	@Test
	public void TFdashboardtest() throws IOException{
			
	WebDriver driver = BrowserFactory.startBrowser("chrome", "http://techfios.com/test/billing/?ng=admin/");
					
	TechFiosLoginPage loginPage = PageFactory.initElements(driver, TechFiosLoginPage.class);
	loginPage.login_TechFios();
	
	TechFiosHomePage dashboardpage = PageFactory.initElements(driver, TechFiosHomePage.class);
   
	dashboardpage.ValidateUser();
	dashboardpage.ValidateIncome();
	dashboardpage.ValidateExpense();
	dashboardpage.Validateincomethismonth();
	dashboardpage.Validateexpensethismonth();
	dashboardpage.ValidateSearch();
	dashboardpage.Validateincomeandexpense();
	dashboardpage.Validatenetworth();
	dashboardpage.Validateincomevsexpenses();
	
	driver.close();

	driver.quit();
	
	
	
	
	}	
}
