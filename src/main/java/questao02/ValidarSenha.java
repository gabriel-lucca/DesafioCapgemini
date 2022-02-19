package questao02;

public class ValidarSenha {

	public boolean validar(String senha) {
		if (senha.length() < 6) {
			throw new RuntimeException("Torne sua senha segura adicionando: " + (6 - senha.length()) + " caracter(es).");
		} else if (!senha.matches(".*[A-Z]+.*")) {
			throw new RuntimeException("A senha deve possuir pelo menos 1 letra maiúscula.");

		} else if (!senha.matches(".*[a-z]+.*")) {
			throw new RuntimeException("A senha deve possuir pelo menos 1 letra minúscula.");

		} else if (senha.length() < 6) {
			throw new RuntimeException(
					"Torne sua senha segura adicionando: " + (6 - senha.length()) + " caracter(es).");
		} else if (!senha.matches(".*[!@#$%^&*()-+]+.*")) {
			throw new RuntimeException("A senha deve possuir pelo menos 1 caractere especial.");

		} else if (!senha.matches(".*\\d+.*")) {
			throw new RuntimeException("A senha deve possuir pelo menos 1 dígito.");
		} else if (senha == null || senha.isBlank() || senha.isEmpty()) {
			throw new RuntimeException("Campo não pode estar em branco ou ser nulo.");
		}
		return true;
	}

}
