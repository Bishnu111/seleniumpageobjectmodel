package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class TechFiosHomePage {

	
WebDriver driver;
	
	public TechFiosHomePage(WebDriver ldriver){
		
		this.driver=ldriver;
	}


	@FindBy(how=How.XPATH, using="//text()[contains(.,'CRM')]/ancestor::a[1]")
	WebElement crmlink;

	
	
	@FindBy(how=How.XPATH, using="//a[text()='Add Contact']")
	WebElement addcontactlink;	
	
	@FindBy(how=How.XPATH, using="//span[text()='Welcome TechFios Tester']")
	WebElement welcome;
	
	@FindBy(how=How.XPATH, using="//span[contains(text(),'Income Today')]")
	WebElement incometoday;
	
	@FindBy(how=How.XPATH, using="//span[contains(text(),'Expense Today')]")
	WebElement expensetoday;
	
	@FindBy(how=How.XPATH, using="//span[contains(text(),'Income This Month')]")
	WebElement incomethismonth;
	
	@FindBy(how=How.XPATH, using="//span[contains(text(),'Expense This Month')]")
	WebElement expensethismonth;
	
	@FindBy(how=How.XPATH, using="//input[@type='text'][@placeholder='Search Customers...']")
	WebElement Search;
	
	@FindBy(how=How.XPATH, using="//h5[text()='Income & Expense - June 2018']")
	WebElement incomeandexpense;
	
	@FindBy(how=How.XPATH, using="//h5[text()='Net Worth & Account Balances']")
	WebElement networth;
	
	@FindBy(how=How.XPATH, using="//h5[text()='Income vs Expense - June 2018']")
	WebElement incomevsexpense;
	
	
	
	public void dashboard() {
		crmlink.click();
	}
	
	public void clickingcontactbuttons() {
    addcontactlink.click();
	
	}
	public void ValidateUser(){
    if(welcome.isDisplayed())
    {
    	System.out.println("login works and homepage open");
     }
	}
	public void ValidateIncome() {
    if (incometoday.isDisplayed())
    {
    	System.out.println("income is displayed");
    }
	}
	public void ValidateExpense(){
	if (expensetoday.isDisplayed())
    {
	System.out.println("Expense is displayed");
    }
    }
	
	public void Validateincomethismonth() {
	if (expensethismonth.isDisplayed())
	{
		System.out.println("Income this month is displayed");
	}
	}
	
	public void Validateexpensethismonth() {
	if (expensethismonth.isDisplayed())
	{
		System.out.println("expense this month is displayed");
	}
	}
		
	public void ValidateSearch() {
	if (Search.isDisplayed())
	{
		System.out.println("search bar is displayed");
	}
	}
	
	public void Validateincomeandexpense() {
	if (incomeandexpense.isDisplayed())
	{
		System.out.println("income and expense graph is displayed");
	}
	}
	
	public void Validatenetworth() {
	if (networth.isDisplayed())
	{
		System.out.println("networth table is displayed");
	}
	}
	
	public void Validateincomevsexpenses() {
	if (incomevsexpense.isDisplayed())
	{
		System.out.print("Income vs expense chart is displayed");
	}
	}
	
	}

	

