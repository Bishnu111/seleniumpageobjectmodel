package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class NewProductpage {

WebDriver driver;
	
	public NewProductpage(WebDriver ldriver){
		
		this.driver=ldriver;
	}
	// username=Id= user_login
	@FindBy(how=How.ID,using="name")
	WebElement name;
	
	@FindBy(how=How.ID,using="sales_price")
	WebElement sales_price;
	
	@FindBy(how=How.ID, using="item_number")
	WebElement item_number;	
	
	@FindBy(how=How.ID, using="description")
	WebElement description;	
	
	@FindBy(how=How.ID,using="submit")
	WebElement Submit;
	
	public void newproduct() {
		name.sendKeys("Inurance");
		sales_price.sendKeys("$300 permonth");
		item_number.sendKeys("001");
		description.sendKeys("home insurance");
		Submit.click();
		
		
		
}
}