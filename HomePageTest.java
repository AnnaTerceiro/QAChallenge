package homePage;

import org.junit.jupiter.api.Test;

import base.BaseTests;

public class HomePageTest extends BaseTests {

	@Test //carregamento da home page
	public void testCarregarHomePage_CarregamentoDaHomePage() {
		int indice = 0;
		String tituloSite_HomePage = homePage.obterTitulo(indice);
		
		System.out.println(tituloSite_HomePage);
	}
	
}
