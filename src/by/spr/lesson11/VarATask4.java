package by.spr.lesson11;

public class VarATask4 {

	public static void main(String[] args) {

		// В тексте после k-го символа вставить заданную подстроку

		int k = 11;

		StringBuilder s1 = new StringBuilder();

		StringBuilder subString = new StringBuilder("Republic of Belarus");

		s1 = s1.append("Printed in the United States of America");

		System.out.println("Initial text:\n" + s1);
		System.out.println("\nCharacter number in text to insert from: " + k);
		System.out.println("\nSubstring to insert:\n" + subString);

		try {
			s1.delete(k, s1.length());
			s1.insert(k, subString);
			System.out.println("\nResult:\n" + s1);
		} catch (StringIndexOutOfBoundsException e) {
			e.printStackTrace();
			System.out.println("Use an integer number between 0 and " + s1.length());
		}

	}

}
