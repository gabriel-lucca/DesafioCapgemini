package questao03;

import java.util.List;
import java.util.Scanner;

public class Questao03 {

	/**
	 * Encontrar o n�mero de pares de substrings que s�o anagramas 
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<String> anagramas;
		List<String> substrings;
		List<String> listaSaida;
		char[] chars;

		// Recebe dados do usu�rio e transforma em array de char
		System.out.print("Escreva uma palavra: ");
		chars = sc.nextLine().toCharArray();
		sc.close();

		// Cria a lista de substrings da palavra digitada
		substrings = new Substrings().criarDoArray(chars);

		// Percorre a lista de substrings descobrindo se existem anagramas e colet�-las
		anagramas = new PegarAnagramas().pegarAnagramasDasSubstrings(chars, substrings);

		listaSaida = new PegarRepetidas().procurarEColetar(chars, anagramas);

		System.out.println(listaSaida);
		System.out.println("Total de anagramas pares: " + (listaSaida.size() > 0 ? listaSaida.size() : "n�o existem"));

	}

}