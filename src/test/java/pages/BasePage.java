package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static utilities.DriverSetUp.getDriver;

import java.time.Duration;
public class BasePage {
	
	public WebElement getElement(By locator) {
		return getDriver().findElement(locator);
	}
	
	// Click method
	public void clickOnElement(By locator) {
		 getElement(locator).click();	
	}
	// Send keys method
	public void writeTextOnElement(By locator, String text) {
		getElement(locator).sendKeys(text);
	}
	// get text method
	public String getElementText(By locator){
		return getElement(locator).getText();	
	}
	// wait driver wait
	public WebElement getVisibleElements(By locator) {
		WebDriverWait wait = new WebDriverWait(getDriver(),Duration.ofSeconds(30));
		return wait.until(ExpectedConditions.elementToBeClickable(locator));
	}
}
