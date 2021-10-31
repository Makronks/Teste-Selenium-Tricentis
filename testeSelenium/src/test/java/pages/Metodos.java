package pages;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Metodos {

	WebDriver driver;
	
	public void abrirNavegador(String site) {
		try {
			System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
			
			driver = new ChromeDriver();
			driver.get(" http://sampleapp.tricentis.com/101/app.php");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		} catch (Exception e) {
			System.err.println("-----------Erro ao abrir navegador----------"+e.getCause());
		}
	}
	public void escrever(By elementos, String texto) {
		try {
			driver.findElement(elementos).sendKeys(texto);
		} catch (Exception e) {
			System.err.println("--------------Erro ao escrever--------------"+e.getMessage());
		}
	}
	public void submit(By elementos) {
		try {
			driver.findElement(elementos).submit();
		} catch (Exception e) {
			System.err.println("---------------Erro ao submiter--------------"+e.getCause());
		}
	}
	public void clicar(By elementos) {
		try {
			driver.findElement(elementos).click();
		} catch (Exception e) {
			System.err.println("-----------------Erro ao clicar --------------"+e.getMessage());
		}
	}
	public void validarTexto(By elementos,String textoEperado) {
		try {
			String texto = driver.findElement(elementos).getText();
			assertEquals(textoEperado, texto);
		} catch (Exception e) {
			System.err.println("-----------Erro ao validar o texto -----------"+e.getCause());
		}
	}
	public void screnShot(String nomeEvidencia) {
		try {
			TakesScreenshot srcShot = ((TakesScreenshot) driver);
			File srcFile = srcShot.getScreenshotAs(OutputType.FILE);
			File destFile = new File("./Evidencia"+nomeEvidencia+".png");
			FileUtils.copyFile(srcFile, destFile);
			
		} catch (Exception e) {
			System.err.println("-------------Erro ao criar evidencias---------"+e.getMessage());
		}
	}
	public void combo(By elementos) {
		try {
			WebElement elememt = driver.findElement(elementos);
			Select combo = new Select(elememt);
			combo.selectByIndex(2);
		} catch (Exception e) {
			System.err.println("--------------Erro ao selecionar o combo do elemento "+e.getMessage());
		}
	}
	public void fecharNavegador() {
		try {
			driver.quit();	
		} catch (Exception e) {
			System.err.println("--------------Erro ao fechar navegador "+e.getMessage());
		}
	}
	
}
