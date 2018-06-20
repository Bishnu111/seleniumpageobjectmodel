package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Addcontactpage {

		WebDriver driver;
			
			public Addcontactpage(WebDriver ldriver){
				
				this.driver=ldriver;
			}
			// username=Id= user_login
			@FindBy(how=How.ID,using="account")
			WebElement Fullname;
			
			@FindBy(how=How.ID,using="company")
			WebElement CompanyName;
			
			@FindBy(how=How.ID, using="email")
			WebElement Email;
			
			@FindBy(how=How.ID,using="phone")
			WebElement Phone;
			
			@FindBy(how=How.ID,using="address")
			WebElement Address;
			
			@FindBy(how=How.ID, using="city")
			WebElement City;
			
			@FindBy(how=How.ID,using="state")
			WebElement State;
			
			@FindBy(how=How.ID,using="zip")
			WebElement Zipcode;
			
			@FindBy(how=How.ID,using="submit")
			WebElement Submit;
			
			
		public void Addcontact(){
				
				Fullname.sendKeys("Casey Holmes");
				CompanyName.sendKeys("Techfios");
				Email.sendKeys("caseyholmes@gmailcom");
				Phone.sendKeys("1234561234");
				Address.sendKeys("123 marsh ln");
				City.sendKeys("Irving");
				State.sendKeys("Texas");
				Zipcode.sendKeys("45673");
				
				Submit.click();	
		}
	
	
	
	
	
}
