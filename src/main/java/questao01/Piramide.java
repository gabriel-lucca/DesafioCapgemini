package questao01;

import java.util.ArrayList;
import java.util.List;

public class Piramide {

	public List<String> cTamanho(int tamanho) {
		List<String> linhas = new ArrayList<>();
		StringBuilder sb = new StringBuilder();

		for (int linha = 0; linha < tamanho; linha++) {
			for (int coluna = tamanho - 1; coluna >= 0; coluna--) {

				if (coluna <= linha) {
					sb.append('*');
				} else {
					sb.append(' ');
				}
			}
			linhas.add(sb.toString());
			sb = new StringBuilder();
		}
		return linhas;
	}
}
