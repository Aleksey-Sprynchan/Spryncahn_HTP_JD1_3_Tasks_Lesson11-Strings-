package by.spr.lesson11;

public class VarCTask11 {

	/*
	 * Пусть текст содержит миллион символов и необходимо сформировать из них строку
	 * путем конкатенации. Определить время работы кода. Ускорить процесс, используя
	 * класс StringBuilder.
	 */

	public static void main(String[] args) {

		long startTime = System.currentTimeMillis();

		// Переменные десятичного представления диапазона основных сомиволов
		final int min = 48;
		final int max = 126;

		char[] cArr = new char[1000000];

		int i = 0;
		for (char c : cArr) {
			cArr[i] = randomSymbol(min, max);
			i++;
		}

		// String s = new String();
		// for (char c : cArr) {
		// s = s + c;
		// i++;
		// }
		// System.out.println(s);
		// System.out.println("String sb final length = " + s.length());

		StringBuilder sb = new StringBuilder();
		for (char c : cArr) {
			sb = sb.append(c);
		}
		// System.out.println(sb);
		System.out.println("String sb final length = " + sb.length());

		long timeSpend = System.currentTimeMillis() - startTime;
		System.out.println("Spend time = " + timeSpend + " milliseconds");

	}

	// Генерируем случайные символы по ASCI через десятичную форму

	static char randomSymbol(int min, int max) {
		max = max - min;
		int temp = (int) ((Math.random() * ++max) + min);
		return (char) temp;

	}

}
