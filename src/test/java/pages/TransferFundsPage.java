package pages;

import org.openqa.selenium.By;

public class TransferFundsPage extends BasePage{
	
	public By TransferFunds_Button = By.xpath("//a[contains(text(),'Transfer Funds')]");
	public By FromAccount = By.xpath("//*[@id=\"fromAccountId\"]/option[2]");
	public By Transfer_Button = By.xpath("//*[@id=\"rightPanel\"]/div/div/form/div[2]/input");
	public By TransferAmount = By.xpath("//*[@id=\"amount\"]");
	public By TransferComplete = By.xpath("//h1[contains(text(),'Transfer Complete!')]");
	
	
	public void TransferFunds() throws InterruptedException {
		
		clickOnElement(TransferFunds_Button);
		Thread.sleep(2000);
		writeTextOnElement(TransferAmount,"100");
		Thread.sleep(2000);
		clickOnElement(Transfer_Button);
		Thread.sleep(2000);
		
		
	}

}
