package pages;

import org.openqa.selenium.By;

public class BillPayPage extends BasePage{
	public By BillPay_Button = By.xpath("//a[normalize-space()='Bill Pay']");

	public By PayeeName = By.xpath("//*[@id=\"rightPanel\"]/div/div[1]/form/table/tbody/tr[1]/td[2]/input");
	public By Address = By.xpath("//input[@ng-model='payee.address.street']");
	public By City = By.xpath("//input[@ng-model='payee.address.city']");
	public By State = By.xpath("//input[@ng-model='payee.address.state']");
	public By ZipCode = By.xpath("//input[@ng-model='payee.address.zipCode']");
	public By PhoneNumber = By.xpath("(//input[@id='d9e7da5d-6707-46cf-8c07-0601c9d33cd7'])[1]");
	public By Account = By.xpath("//input[@ng-model='payee.accountNumber']");
	public By VerifyAccount = By.xpath("//input[@ng-model='verifyAccount']");
	public By Amount = By.xpath("//input[@ng-model='amount']");
	public By SendPayment = By.xpath("//input[@value='Send Payment']");
	public String Billpayment = "Bill Payment Complete";
	
	public void BillPay() throws InterruptedException {
		
		clickOnElement(BillPay_Button);
		Thread.sleep(2000);
		writeTextOnElement(PayeeName,"Tanmoy");
		writeTextOnElement(Address,"Mirpur, Dhaka");
		writeTextOnElement(City,"Dhaka");
		writeTextOnElement(State,"Dhaka");
		writeTextOnElement(ZipCode,"1203");
		//writeTextOnElement(PhoneNumber,"01716948523");
		writeTextOnElement(Account,"14010");
		writeTextOnElement(VerifyAccount,"14010");
				
		clickOnElement(SendPayment);
		Thread.sleep(4000);
	}

}
