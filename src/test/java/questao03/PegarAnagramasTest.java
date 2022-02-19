package questao03;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class PegarAnagramasTest {

	@Test
	public void sucesso_SecoletarUmaApenas() {
		char[] array = { 'a', 'n', 'a' };
		List<String> subStrings = List.of("a", "n", "a", "an", "na", "ana");
		List<String> coletadas = new PegarAnagramas().pegarAnagramasDasSubstrings(array, subStrings);

		Assert.assertEquals(1, coletadas.size());
	}

	@Test
	public void sucesso_seDevolver0ParaArrayVazio() {
		char[] array = {};
		List<String> subStrings = List.of();
		List<String> coletadas = new PegarAnagramas().pegarAnagramasDasSubstrings(array, subStrings);

		Assert.assertEquals(0, coletadas.size());
	}

	@Test
	public void sucesso_seDevolver0ParaArrayNulo() {
		char[] array = null;
		List<String> subStrings = List.of();
		List<String> coletadas = new PegarAnagramas().pegarAnagramasDasSubstrings(array, subStrings);

		Assert.assertEquals(0, coletadas.size());
	}

}