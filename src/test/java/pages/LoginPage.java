package pages;

import org.openqa.selenium.By;

public class LoginPage extends BasePage{
	
	public String Login_URL ="https://parabank.parasoft.com/parabank/index.htm";
	public By UserName_input = By.xpath("//input[@type='text']");
	public By Password_input = By.xpath("//input[@type='password']");
	public By Login_Button = By.cssSelector("input[value='Log In']");
	
	
	public void dologin(String username, String password) throws InterruptedException {	
		writeTextOnElement(UserName_input,username);
		writeTextOnElement(Password_input,password);
		Thread.sleep(2000);
		
		clickOnElement(Login_Button);
		Thread.sleep(2000);
	}
}
