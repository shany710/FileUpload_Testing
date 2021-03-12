package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import junit.framework.Assert;
import pages.CommonBase;
import pages.CommonDriver;
import pages.DragAndDropFilePage;
import pages.UploadFilePage;

public class DragAndDropTest {
	
	CommonDriver common;
	CommonBase commonBase;
	DragAndDropFilePage dragDrop;

	@BeforeMethod
	public void beforeMethod() {
		common = new CommonDriver();
		common.getUrl("http://demo.guru99.com/test/drag_drop.html");
		common.maximizarNavegador();
		commonBase = new CommonBase(common.getDriver(), common.getWait());
		dragDrop = new DragAndDropFilePage(common.getDriver(), common.getWait());

	}
	@Test
	public void cargarArchivoSeleccionado() {
		dragDrop.dragAndDrogElements();
	}
	
	@AfterMethod
	public void afterMethod() {
		commonBase.cerrarNavegador();
	}


}
