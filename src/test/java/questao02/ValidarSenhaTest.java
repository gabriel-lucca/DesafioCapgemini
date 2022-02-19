package questao02;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class ValidarSenhaTest {

	@Test
	public void espera_umaExcecao_seNaoTiverLetraMaiuscula() {
		String senha = "abacaxi31@";

		RuntimeException exe = Assert.assertThrows(RuntimeException.class, () -> new ValidarSenha().validar(senha));
		assertEquals("A senha deve possuir pelo menos 1 letra mai�scula.", exe.getMessage());
	}

	@Test
	public void espera_umaExcecao_seNaoTiverLetraMinuscula() {
		String senha = "ABACAXI31@";

		RuntimeException exe = Assert.assertThrows(RuntimeException.class, () -> new ValidarSenha().validar(senha));
		assertEquals("A senha deve possuir pelo menos 1 letra min�scula.", exe.getMessage());
	}

	@Test
	public void espera_umaExcecao_seNaoTiverCaractereEspecial() {
		String senha = "Abacaxi31";

		RuntimeException exe = Assert.assertThrows(RuntimeException.class, () -> new ValidarSenha().validar(senha));
		assertEquals("A senha deve possuir pelo menos 1 caractere especial.", exe.getMessage());
	}

	@Test
	public void espera_umaExcecao_seNaoTiverUmDigito() {
		String senha = "Abacaxi$";

		RuntimeException exe = Assert.assertThrows(RuntimeException.class, () -> new ValidarSenha().validar(senha));
		assertEquals("A senha deve possuir pelo menos 1 d�gito.", exe.getMessage());
	}

	@Test
	public void espera_umaExcecao_seNaoTiverSeisCaracteres() {
		String senha = "raim";

		RuntimeException exe = Assert.assertThrows(RuntimeException.class, () -> new ValidarSenha().validar(senha));
		assertEquals("Torne sua senha segura adicionando: 2 caracter(es).", exe.getMessage());
	}

}
