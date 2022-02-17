package Questao03;

import java.util.ArrayList;
import java.util.List;

public class substrings {

	public List<String> criarDoArray(char[] chars) {
		List<String> sub = new ArrayList<>();

		for (int i = 1; i <= chars.length; i++) {
			for (int p = 0; p <= chars.length - i; p++) {
				int j = p + i - 1;
				String s = "";
				for (int k = p; k <= j; k++) {
					s = s + String.valueOf(chars[k]);
				}
				sub.add(s);
			}
		}
		return sub;
	}

}