package pages;

import org.openqa.selenium.By;

public class HomePage extends BasePage{
	public By Home_Button = By.xpath("//a[normalize-space()='home']");
	
	public void ShowHomePage() {
		clickOnElement(Home_Button);
		
	}

}
