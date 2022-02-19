package questao03;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class PegarLetrasRepetidasTest {

	@Test
	public void deveRetornarSucesso_SeEncontrarApenas1LetraRepetida() {
		char[] array = { 'a', 'n', 'a' };
		List<String> lista = new ArrayList<>();
		List<String> encontradas = new PegarRepetidas().procurarEColetar(array, lista);

		Assert.assertEquals(1, encontradas.size());
	}

	@Test
	public void deveRetornarSucesso_SeEncontrarMaisDeUmaLetraRepetida() {
		char[] array = { 'a', 'r', 'a', 'r', 'a' };
		List<String> esperado = List.of("[a,a]", "[r,r]");

		List<String> lista = new ArrayList<>();
		List<String> encontradas = new PegarRepetidas().procurarEColetar(array, lista);

		Assert.assertEquals(2, encontradas.size());
		Assert.assertEquals(esperado, encontradas);
	}

	@Test
	public void deveRetornarSucesso_SeNaoEncontrarLetraRepetida() {
		char[] array = {};
		List<String> lista = new ArrayList<>();
		List<String> encontradas = new PegarRepetidas().procurarEColetar(array, lista);

		Assert.assertEquals(0, encontradas.size());
	}

}