package questao03;

import java.util.List; 
import java.util.stream.Collectors;

public class PegarRepetidas {

	public List<String> procurarEColetar(char[] array, List<String> elementos) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				if (i != j) {
					if (array[i] == array[j]) {
						elementos.add("[" + array[i] + "," + array[j] + "]");
					}
				}
			}
		}
		return elementos.stream().distinct().collect(Collectors.toList());
	}
}