package pages;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import driverFactory.Drivers;
import io.github.bonigarcia.wdm.WebDriverManager;

public class PageBase extends Drivers {

	public static void abrirNavegador() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();

	}

	public static void preencherCampo(By elemento, String texto) {

		driver.findElement(elemento).sendKeys(texto);
	}

	public static void clicar(By elemento) {
		driver.findElement(elemento).click();
	}

	public static void validarTexto(By elemento, String textoEsperado) {

		String objetoCapturado = driver.findElement(elemento).getText();
		System.out.println(objetoCapturado + "," + textoEsperado);
		System.out.println(objetoCapturado);

		assertEquals(objetoCapturado, textoEsperado);

	}

	public static void elementoDaLista(By elementoClassificarEFiltrar, By elementoDaLista) {

		driver.findElement(elementoClassificarEFiltrar).click();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		WebElement elementoParaClicar = wait.until(ExpectedConditions.elementToBeClickable(elementoDaLista));

		elementoParaClicar.click();

	}
	
	public static void fecharNavegador() {
		driver.quit();
	}

	public static void evidenciar(String nomeDaCaptura) {
		File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File destinationFile = new File("src/evidencias/captura " + nomeDaCaptura + ".png");
		try {
			FileUtils.copyFile(screenshot, destinationFile);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	
}