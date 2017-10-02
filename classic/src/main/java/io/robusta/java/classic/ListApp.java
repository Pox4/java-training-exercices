package io.robusta.java.classic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by nicorama on 21/06/2017.
 */
public class ListApp {

	List<Integer> buildList(int a, int b, int c) {

		List<Integer> list = new ArrayList<Integer>();

		//list.add(a);
		//list.add(b);
		//list.add(c);
		
		Collections.addAll(list, a,b,c);

		return list;
	}

	ArrayList<Integer> buildList(int... numbers) {

		ArrayList<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < numbers.length; i++) {
			list.add(i, numbers[i]);

		}

		return list;
	}

	boolean equality(List<Integer> list1, List<Integer> list2) {

		return list1.equals(list2);
	}

	String asString(List<Integer> numbers) {

		return null;
	}

	int first(List<Integer> ints) {
		return ints.get(0);
	}

	int last(List<Integer> ints) {
		return ints.get(ints.size() - 1);
	}

	int medium(List<Integer> ints) {

		if (ints.size() % 2 == 1) {

			// System.out.println(ints.get(ints.size()/2 - 1/2));

			return ints.get(ints.size() / 2 + 1 / 2);
		}

		// System.out.println(ints.get(ints.size() / 2 - 1));

		return ints.get(ints.size() / 2 - 1);

	}
}
