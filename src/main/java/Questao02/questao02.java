package Questao02;

import java.util.List;
import java.util.Scanner;

public class questao02 {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.print("Insira a sua senha: ");
		String senha = sc.next();

		if (senha.length() < 6) {
			System.out.println("Torne sua senha segura adicionando: " + (6 - senha.length()) + " caracter(es).");
		} else if (!senha.matches(".*[A-Z]+.*")) {
			System.out.println("\nA senha deve possuir pelo menos 1 letra maiúscula.");

		} else if (!senha.matches(".*[a-z]+.*")) {
			System.out.println("A senha deve possuir pelo menos 1 letra minúscula.");

		} else if (senha.length() < 6) {
			System.out.println("Torne sua senha segura adicionando: " + (6 - senha.length()) + " caracter(es).");
		} else if (!senha.matches(".*[!@#$%^&*()-+]+.*")) {
			System.out.println("A senha deve possuir pelo menos 1 caractere especial.");

		} else if (!senha.matches(".*\\d+.*")) {
			System.out.println("A senha deve possuir pelo menos 1 dígito.");
		}
	}
	// } else if (senha == null || senha.isBlank() || senha.isEmpty()) {
	// throw new IllegalArgumentException("Campo não pode estar em branco ou ser
	// nulo.");
	// }
 
	// if (senha.contains("!") || senha.contains("@") || senha.contains("#") ||
	// senha.contains("$")
	// || senha.contains("%") || senha.contains("^") || senha.contains("&") ||
	// senha.contains("*")
	// || senha.contains("(") || senha.contains(")") || senha.contains("-") ||
	// senha.contains("+")) {
	// countCaractereEspecial += 1;
	// }

	private static void verificarCondicoesDaSenha(List<RestricaoParaSenha> restricoes, String senha) {
		try {
			restricoes.forEach(r -> r.verifica(senha));

			System.out.println("\n\nSenha Aprovada!!");
			System.out.println(senha);
		} catch (IllegalArgumentException e) {
			System.err.print(e.getMessage());
		} finally {
			sc.close();
		}
	}
}
