package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DragAndDropFilePage extends CommonBase {

	// LOCATORS
	private By elementDrag = By.xpath("//ul/li[@data-id]");
	private By areaDrop1 = By.xpath("//ol[@id='bank']");
	private By areaDrop2 = By.id("amt7");
	private By areaDrop3= By.xpath("//ol[@id='loan']");
	private By areaDrop4 = By.id("amt8");
	private By btnExerciseFinish = By.xpath("//a[text()[contains(.,'Perfect!')]]");

	public DragAndDropFilePage(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);
		// TODO Auto-generated constructor stub
	}

	public void dragAndDrogElements() {
		
		List<WebElement> lista = getElements(elementDrag);
		WebElement elementoDrop;
		
		for (WebElement elemento : lista) {
			
			String nombre = getValueAttribute(elemento, "data-id");
			
			if(nombre.equalsIgnoreCase("2")) {
				elementoDrop = getElement(areaDrop2);
				dragDrop(elemento, elementoDrop);
				
				elementoDrop = getElement(areaDrop4);
				dragDrop(elemento, elementoDrop);
			}
			else if(nombre.equalsIgnoreCase("6")) {
				elementoDrop = getElement(areaDrop3);
				dragDrop(elemento, elementoDrop);
			}
			else if(nombre.equalsIgnoreCase("5")) {
				elementoDrop = getElement(areaDrop1);
				dragDrop(elemento, elementoDrop);
			}
		}
		if(isDisplayed(btnExerciseFinish))
		{
			System.out.println("Se completó ejercicio correctamente");
		}
		else
		{
			System.out.println("El ejercicio no se completó");
		}
	}
}
