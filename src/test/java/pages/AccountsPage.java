package pages;

import org.openqa.selenium.By;

public class AccountsPage extends BasePage{
	public By accountOverview_Button = By.xpath("//a[normalize-space()='Accounts Overview']");
    public By accountDetails = By.xpath("//*[@id=\"accountTable\"]/tbody/tr[1]/td[1]/a"); 
    public String AccountDeatails_Title ="Account Details";
    public By AccountNumber = By.xpath("//td[contains(text(),'Account Number:')]"); 
    public By AccountType = By.xpath("//td[contains(text(),'Account Type:')]");
    public By Balance = By.xpath("//td[contains(text(),'Balance:')]");
    public By AvaiableBalance = By.xpath("//td[contains(text(),'Available:')]");
    
	
	public void AccountDetails ()throws InterruptedException {
		clickOnElement(accountOverview_Button);
		Thread.sleep(2000);
		clickOnElement(accountDetails);
		Thread.sleep(2000);
		
	}

}
