package questao01;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class PiramideTest {

	@Test
	public void RetornarSucessoCom6Elementos() {
		int tamanho = 6;
		List<String> gera = new Piramide().cTamanho(tamanho);

		Assert.assertEquals(6, gera.size());
	}

	@Test
	public void RetornarSucessoCom0Elementos() {
		int tamanho = 0;
		List<String> gera = new Piramide().cTamanho(tamanho);

		Assert.assertEquals(0, gera.size());
	}

}