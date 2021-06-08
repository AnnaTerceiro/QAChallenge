package steps;

import static org.hamcrest.Matchers.is;

import java.util.concurrent.TimeUnit;

import static org.hamcrest.MatcherAssert.assertThat;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import pages.HomePage;

public class ModelParaSeCandidatarSteps {

	private static WebDriver driver;
	private WebElement homePage = new HomePage(driver);

	@Before
	public static void inicializar() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\annac\\eclipse-workspace-QAChallenge\\driver\\chrome\\Versão 83\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60000, TimeUnit.MILLISECONDS);
	}

	@Dado("que abro o navegador")
	public void que_abro_o_navegador() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\annac\\eclipse-workspace-QAChallenge\\driver\\chrome\\Versão 83\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60000, TimeUnit.MILLISECONDS);
	}
	
	@Quando("acesso o site url")
	public void acesso_o_site_url() {
			driver.get("https://beta.coodesh.com");
			homePage = new HomePage(driver);
		
	}

	@Então("aparece a pagina completa")
	public void aparece_a_pagina_completa() {
		((HomePage) homePage).carregarPaginaInicial();
		assertThat(((HomePage) homePage).obterTituloPagina(),is("Plataforma de recrutamento para avaliar e contratar desenvolvedores | Coodesh 👨‍💻👩‍💻"));
	}

	@After
	public static void finalizar() {
		driver.quit();
	}

}
