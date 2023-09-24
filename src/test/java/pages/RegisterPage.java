package pages;

import org.openqa.selenium.By;

public class RegisterPage extends BasePage{
	
	public String Home_URL ="https://parabank.parasoft.com/";
	public By Register_Button = By.xpath("//*[@id=\"loginPanel\"]/p[2]/a");
	public By FirstName = By.xpath("//input[@id='customer.firstName']");
	public By LastName = By.xpath("//input[@id='customer.lastName']");
	public By Address = By.cssSelector("#customer\\.address\\.street"); 
	public By City = By.xpath("//input[@id='customer.address.city']");
	public By State = By.xpath("//input[@id='customer.address.state']");
	public By ZipCode = By.xpath("//input[@id='customer.address.zipCode']");
	public By PhoneNumber = By.xpath("//input[@id='customer.phoneNumber']");
	public By SSN = By.xpath("//input[@id='customer.ssn']");
	public By UserName = By.xpath("//input[@id='customer.username']");
	public By Password = By.xpath("//input[@id='customer.password']");
	public By Confrim_Password = By.xpath("//input[@id='repeatedPassword']");
	public By Register = By.xpath("//input[@value='Register']");
	
	
	public void ShowRegisterPage() throws InterruptedException {
		clickOnElement(Register_Button);
		Thread.sleep(2000);
		writeTextOnElement(FirstName,"Tanmoy");
		writeTextOnElement(LastName,"Datta");
		writeTextOnElement(Address,"Mirpur, Dhaka");
		writeTextOnElement(City,"Dhaka");
		writeTextOnElement(State,"Dhaka");
		writeTextOnElement(ZipCode,"1203");
		writeTextOnElement(PhoneNumber,"01716948523");
		writeTextOnElement(SSN,"0123456");
		writeTextOnElement(UserName,"anmoy");
		writeTextOnElement(Password,"123456");
		writeTextOnElement(Confrim_Password,"123456");
		
		clickOnElement(Register);
		Thread.sleep(4000);
	}
}
