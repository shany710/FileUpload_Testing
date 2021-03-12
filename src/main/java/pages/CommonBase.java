package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonBase {

	private WebDriver driver;
	private WebDriverWait wait;

	public CommonBase(WebDriver driver, WebDriverWait wait) {
		this.driver = driver;
		this.wait = wait;
	}

	public void darClic(By locator) {
		wait.until(ExpectedConditions.elementToBeClickable(locator)).click();
	}

	public void subirArchivo(By locator, String archivo) {
		driver.findElement(locator).sendKeys(archivo);
	}

	public String getTexto(By locator) {
		return driver.findElement(locator).getText();
	}
	
	public String getTextoElement(WebElement elemento) {
		return elemento.getText();
	}
	
	public String getValueAttribute(WebElement elemento, String atributo)
	{
		return elemento.getAttribute(atributo);
		
	}
	
	public void dragDrop(WebElement from, WebElement to) {
			
        Actions act=new Actions(driver);						
        act.dragAndDrop(from, to).build().perform();	
	}

	public List<WebElement> getElements(By locator) {

		return driver.findElements(locator);
	}

	public WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	public boolean isDisplayed(By locator) {
		return driver.findElement(locator).isDisplayed();
	}
	public void cerrarNavegador() {
		driver.quit();
	}
}
