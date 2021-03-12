package test;

import org.testng.annotations.Test;

import junit.framework.Assert;
import pages.CommonBase;
import pages.CommonDriver;
import pages.UploadFilePage;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class UploadFileTest {

	CommonDriver common;
	CommonBase commonBase;
	UploadFilePage uploadFile;

	@BeforeMethod
	public void beforeMethod() {
		common = new CommonDriver();
		common.getUrl("https://the-internet.herokuapp.com/upload");
		common.maximizarNavegador();
		commonBase = new CommonBase(common.getDriver(), common.getWait());
		uploadFile = new UploadFilePage(common.getDriver(), common.getWait());

	}

	@Test
	public void cargarArchivoSeleccionado() {
		uploadFile.cargarArchivo("D:\\IMAGENES\\zeus.jpg");
		String archivo = uploadFile.darNombreArchivoCargado();
		Assert.assertEquals("zeus.jpg", archivo);
	}


	@AfterMethod public void afterMethod() {
		
		commonBase.cerrarNavegador();
	}

}
