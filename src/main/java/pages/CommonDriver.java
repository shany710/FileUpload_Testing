package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonDriver {
	
	private WebDriver driver;
	private WebDriverWait wait;
	private String rutaChromeDriver;
	
	public CommonDriver() {
		
		rutaChromeDriver = System.getProperty("user.dir")+"\\drivers\\chrome\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", rutaChromeDriver);
		driver = new ChromeDriver();
		
		wait = new WebDriverWait(driver, 10);
	}
	
	public void getUrl(String url)
	{
		driver.get(url);
	}
	
	public void maximizarNavegador() {
		driver.manage().window().maximize();
	}
	public WebDriver getDriver() {
		return driver;
	}

	public WebDriverWait getWait() {
		return wait;
	}
	

}
