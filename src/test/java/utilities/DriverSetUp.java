package utilities;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class DriverSetUp {
	private static String browserName = System.getProperty("browser","firefox");
	private static ThreadLocal<WebDriver> LOCAL_DRIVER = new ThreadLocal();
	
	public static void setDriver(WebDriver driver) {
		DriverSetUp.LOCAL_DRIVER.set(driver);
	}
	public static WebDriver getDriver() {
		return LOCAL_DRIVER.get();	
	}
	
	public static WebDriver getBrowser(String browserName) {
		switch (browserName.toLowerCase()) {
		case "chrome":
			return new ChromeDriver();
		case "firefox":
			return new FirefoxDriver();
		case "edge":
			return new EdgeDriver();
		default:
			throw new RuntimeException("Browser is not found using the name '"+browserName+"'!");
		}
	}
	@BeforeSuite
	public static synchronized void setBrowser() {
		WebDriver webDriver = getBrowser(browserName);
		webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		webDriver.manage().window().maximize();
		setDriver(webDriver);	
	}
	@AfterSuite
	public static synchronized void quitBrowser() {
		getDriver().quit();
	}

	
}
