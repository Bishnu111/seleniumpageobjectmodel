package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Productandservicepage {

WebDriver driver;
	
	public Productandservicepage (WebDriver ldriver){
		
		this.driver=ldriver;
	}	
	@FindBy(how=How.XPATH, using="//span[text()='Products & Services']")
	WebElement productandservicelink;
	
	@FindBy(how=How.XPATH, using="//a[text()='New Product']")
	WebElement newproductlink;
	
	public void newproduct() {
	productandservicelink.click();
	newproductlink.click();
	}
	
	
}
