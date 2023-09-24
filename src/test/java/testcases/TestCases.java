package testcases;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import pages.AccountsPage;
import pages.BillPayPage;
import pages.HomePage;
import pages.LoginPage;
import pages.RegisterPage;
import pages.TransferFundsPage;
import utilities.Dataset;
import utilities.DriverSetUp;

public class TestCases extends DriverSetUp{
	RegisterPage registerPage = new RegisterPage();
	LoginPage loginPage = new LoginPage();
	HomePage homePage = new HomePage();
	AccountsPage accountsPage = new AccountsPage();
	TransferFundsPage transferFundsPage = new TransferFundsPage();
	BillPayPage billPayPage = new BillPayPage();
//	@Test(priority = 0)
//	public void RegisterPage() throws InterruptedException {
//		getDriver().get(registerPage.Home_URL);
//		Thread.sleep(3000);
//		registerPage.ShowRegisterPage();
//	}
	@Test(priority = 1, description = "Login with valid value", dataProvider = "ValidCredensial", dataProviderClass = Dataset.class)
	public void loginpageswithValidCredensialUsingDataprovider(String username, String password) throws InterruptedException {
		getDriver().get(loginPage.Login_URL);
		Thread.sleep(3000);
		loginPage.dologin(username,password);
		Thread.sleep(2000);
	}
	
	@Test(priority = 2, description = "Home Page")
	public void HomePage() {
		homePage.ShowHomePage();
	}
	
	@Test(priority = 3,description = "Account Details Page")
	public void AccountOverViewPage() throws InterruptedException {
		accountsPage.AccountDetails();
		assertEquals(accountsPage.AccountDeatails_Title,"Account Details");
		Thread.sleep(2000);
		assertEquals(accountsPage.getElementText(accountsPage.AccountNumber),"Account Number:");
		assertEquals(accountsPage.getElementText(accountsPage.AccountType),"Account Type:");
		assertEquals(accountsPage.getElementText(accountsPage.Balance),"Balance:");
		assertEquals(accountsPage.getElementText(accountsPage.AvaiableBalance),"Available:");
		
		transferFundsPage.TransferFunds();
		assertEquals(transferFundsPage.getElementText(transferFundsPage.TransferComplete),"Transfer Complete!");
		
		
		billPayPage.BillPay();
		assertEquals(billPayPage.Billpayment,"Bill Payment Complete");
	}
	
}
