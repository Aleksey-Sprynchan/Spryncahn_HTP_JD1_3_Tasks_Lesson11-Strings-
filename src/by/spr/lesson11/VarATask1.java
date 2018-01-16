package by.spr.lesson11;

public class VarATask1 {

	public static void main(String[] args) {

		// В каждом слове текста k-ю букву заменить заданным символом. Если k
		// больше длины слова, корректировку не выполнять.

		String s1 = "Hello how are you everything is fine thank you";
		System.out.println(s1);
		String[] words;
		words = s1.split(" ");
		int k = 3;
		char c = '#';

		char[] letters;

		for (int i = 0; i < words.length; i++) {
			letters = words[i].toCharArray();

			if (letters.length < k) {

			} else {
				letters[k - 1] = c;
				words[i] = new String(letters);
			}
		}

		String fin = words[0];
		for (int i = 1; i < words.length; i++) {
			fin = fin + ' ' + words[i];
		}

		System.out.println(fin);

	}

}

