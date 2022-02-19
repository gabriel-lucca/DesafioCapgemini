package questao02;

import java.util.List; 
import java.util.Scanner;

public class Questao02 {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.print("Insira a sua senha: ");
		String senha = sc.next();

		boolean retorna = new ValidarSenha().validar(senha);
		if (retorna) {
			System.out.println("Senha aprovada");
		}
	}

}
