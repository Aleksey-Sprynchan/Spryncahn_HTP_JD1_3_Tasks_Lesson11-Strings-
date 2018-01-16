package by.spr.lesson11;

public class VarATask9 {

	public static void main(String[] args) {

		// Определить, сколько раз повторяется в тексте каждое слово, которое
		// встречается в нем.

		String s1 = "Hello new new car is never hello never go home is new new car home never big big big big";
		String[] s = s1.split(" ");

		String temp;
		int precount = 0;
		int count = 0;
		for (int j = 0; j < s.length; j++) {
			temp = s[j];
			for (int k = 0; k <= j; k++) {
				if (temp.equalsIgnoreCase(s[k])) {
					precount++;
				}
			}
			if (precount == 1) {
				for (int i = 0; i < s.length; i++) {
					if (temp.equalsIgnoreCase(s[i])) {
						count++;
					}
				}

				System.out.println("Word " + (char) 34 + s[j].toUpperCase() + (char) 34 + " occurs " + count
						+ " times in this text");
				count = 0;

			}
			precount = 0;

		}

	}

}
