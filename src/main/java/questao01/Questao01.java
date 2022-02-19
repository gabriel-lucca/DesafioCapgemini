package questao01;

import java.util.List;
import java.util.Scanner;

public class Questao01 {

	private static Scanner sc = new Scanner(System.in);

	/**
	 * A base e altura da escada devem ser iguais ao valor de n. A �ltima linha n�o
	 * deve conter nenhum espa�o
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.print("Digite um n�mero at� 10: ");
		int tamanho = sc.nextInt();
		sc.close();

		List<String> linhas = new Piramide().cTamanho(tamanho);

		linhas.forEach(System.out::println);

	}
}
