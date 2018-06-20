package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class NewAccountpage {

	WebDriver driver;
	
	public NewAccountpage(WebDriver ldriver){
		
		this.driver=ldriver;
	}
	// username=Id= user_login
	@FindBy(how=How.ID,using="account")
	WebElement Accounttitle;
	
	@FindBy(how=How.ID,using="description")
	WebElement description;
	
	@FindBy(how=How.ID, using="balance")
	WebElement initial_balance;
	
	@FindBy(how=How.XPATH, using="//text()[contains(.,'Submit')]/ancestor::button[1]")
	WebElement submit_button;
	
	public void BankandCash() {
		Accounttitle.sendKeys("checking account");
		description.sendKeys("minimum $1000 required");
		initial_balance.sendKeys("$1500");
		submit_button.click();
	}
	
	
	
	
	
}
