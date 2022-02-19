package questao03;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;


public class SubstringsTest {

	@Test
	public void deveRetornarSucesso_seTrouxer6Substrings() {
		char[] array = { 'o', 'v', 'o' };
		List<String> lista = new Substrings().criarDoArray(array);
		Assert.assertEquals(6, lista.size());
	}

	@Test
	public void deveRetornarSucesso_seTrouxer0ParaArrayVazio() {
		char[] array = {};
		List<String> lista = new Substrings().criarDoArray(array);
		Assert.assertEquals(0, lista.size());
	}

}