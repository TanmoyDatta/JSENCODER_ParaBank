package pages;

import org.openqa.selenium.By;

public class LoginPage extends BasePage{
	
	public String Home_URL ="http://159.89.38.11/login";
	public By Email_input = By.xpath("//input[@id='email-1']");
	public By Pass_input = By.xpath("//input[@id='password-1']");
	public By Login_BTN = By.xpath("//button[@id='m_login_signin_submit']");
	
	
	public void dologin(String username, String password) throws InterruptedException {	
		writeTextOnElement(Email_input,username);
		writeTextOnElement(Pass_input,password);
		Thread.sleep(2000);
		
		clickOnElement(Login_BTN);
		Thread.sleep(5000);
	}
}
