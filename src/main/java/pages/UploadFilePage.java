package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UploadFilePage extends CommonBase {
	
	//locators
	
	private By selectFile = By.id("file-upload");
	private By btnUploadFile = By.id("file-submit");
	private By uploadedFile =By.id("uploaded-files");
	
	public UploadFilePage(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);
		// TODO Auto-generated constructor stub
	}
	
	public void cargarArchivo(String archivo) {
		
		subirArchivo(selectFile, archivo);
		darClic(btnUploadFile);
		System.out.println("Se oprime boton cargar archivo");
	}
	
	public String darNombreArchivoCargado() {
		return getTexto(uploadedFile);
	}

	public void arrastrarSolarArchivo() {
		//Using Action class for drag and drop.		
//        Actions act=new Actions(driver);					

	//Dragged and dropped.		
//        act.dragAndDrop(From, To).build().perform();
	}
}
