package io.robusta.java.classic;

/**
 * Created by nicorama on 21/06/2017.
 */
public class ArrayApp {

	String[] buildEmptyArray(int size) {

		String[] emptyArray = new String[size];

		return emptyArray;
	}

	int[] buildArray(int a, int b, int c) {

		int[] array = { a, b, c };

		return array;
	}

	boolean equality(int[] array1, int[] array2) {

		if (array1 == array2)
			return false;

		if (array1.length != array2.length)
			return false;

		for (int i = 0; i < array1.length; i++) {

			if (array1[i] != array2[i])

				return false;

		}

		return true;

	}

	

	String asString(int[] numbers) {

		String chaine = "";
		for (int i = 0; i < numbers.length; i++) {
			chaine = chaine + numbers[i] + ":";
		}

		return chaine;

	}

	String asStringJoin(int[] numbers) {

		String chaine = "";
		
		for (int i = 0; i < numbers.length; i++) {
			chaine = chaine + numbers[i] + ":";
		}

		chaine = chaine.substring(0, chaine.length() - 1);

		return chaine;

	}

	String asString(String[] strings) {

		
		String chaine = "";
		for (int i = 0; i < strings.length; i++) {
			chaine = chaine + strings[i] + " ";
			
		}
		
		chaine = chaine.substring(0, chaine.length() - 1);
		
		return chaine;

	}
	
	
	

	String asString(Card[] cards) {
		
		
		String chaine = "[";
		for (int i = 0; i < cards.length; i++) {
			chaine = chaine + cards[i] + " ";
			
		}
		
		chaine = chaine.substring(0, chaine.length() - 1) + "]";
		
		return chaine;
	}

}
