package questao03;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PegarAnagramas {

	public List<String> pegarAnagramasDasSubstrings(char[] chars, List<String> substrings) {
		List<String> encontrados = new ArrayList<>();

		for (int i = 0; i < substrings.size() - 1; i++) { 

			for (int j = 0; j < chars.length; j++) {
				String s = substrings.get(i);
				String t = substrings.get(i + 1);

				if (saoAnagramas(s, t)) {
					encontrados.add("[" + s + "," + t + "]");
				}
			}
		}
		return encontrados.stream().distinct().collect(Collectors.toList());
	}

	private boolean saoAnagramas(String s, String t) {

		Map<Character, Integer> hMap1 = new HashMap<>();
		Map<Character, Integer> hMap2 = new HashMap<>();

		char[] arr1 = s.toCharArray();
		char[] arr2 = t.toCharArray();

		// primeira String
		for (int i = 0; i < arr1.length; i++) {
			if (hMap1.get(arr1[i]) == null) {
				hMap1.put(arr1[i], 1);
			} else {
				Integer c = (int) hMap1.get(arr1[i]);
				hMap1.put(arr1[i], ++c);
			}
		}

		// segunda String
		for (int j = 0; j < arr2.length; j++) {
			if (hMap2.get(arr2[j]) == null) {
				hMap2.put(arr2[j], 1);
			} else {
				Integer d = (int) hMap2.get(arr2[j]);
				hMap2.put(arr2[j], ++d);
			}
		}

		if (hMap1.equals(hMap2)) {
			return true;
		} else {
			return false;
		}
	}
}