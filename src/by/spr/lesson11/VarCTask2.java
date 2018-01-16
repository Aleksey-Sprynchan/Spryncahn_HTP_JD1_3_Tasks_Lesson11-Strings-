package by.spr.lesson11;

public class VarCTask2 {

	/*
	 * Исключить из текста подстроку максимальной длины, начинающуюся и
	 * заканчивающуюся одним и тем же символом.
	 * 
	 * В данной реализации поиск и удаление подстроки выполнен с учетом регистра!!
	 */
	public static void main(String[] args) {

		String s1 = "What is going on ? How are you everything is fine and you what is your favorite singer";

		char[] c = s1.toCharArray();

		int endId = 0;
		int maxSubStr = 0;
		int finalStart = 0;
		int finalEnd = 0;
		for (int i = 0; i < c.length; i++) {
			for (int j = i; j < c.length; j++) {
				if (c[i] != ' ' && c[i] == c[j]) {
					endId = j;
				}
			}
			if (maxSubStr < (endId - i + 1)) {
				maxSubStr = endId - i + 1;
				finalStart = i;
				finalEnd = endId;
			}
		}

		String s2 = s1.substring(finalStart, finalEnd + 1);

		StringBuilder s = new StringBuilder(s1);
		s = s.delete(finalStart, finalEnd + 1);

		System.out.println("Initial text:\n" + (char) 34 + s1 + (char) 34 + "\n");
		System.out.println("Substring of the maximum length, beginning and ending with the same symbol:\n"
				+ (char) 34 + s2 + (char) 34 + "\n");
		System.out.println("New string without this substring:\n" + (char) 34 + s + (char) 34);

	}

}
