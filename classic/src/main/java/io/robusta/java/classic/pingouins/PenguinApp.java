package io.robusta.java.classic.pingouins;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by nicorama on 28/09/2017.
 */
public class PenguinApp {

	Penguin createSimplePenguin() {

		Penguin pox = new Penguin("Pox4");

		return pox;
	}

	List<Penguin> getPenguins(Penguin p1, Penguin p2, Penguin p3, Penguin p4, Penguin p5) {

		List<Penguin> list = new ArrayList<>();
		List<Penguin> list2 = new ArrayList<>();

		Collections.addAll(list, p1, p2, p3, p4, p5);

		for (Penguin current : list) {
			if (!(current == null)) {
				list2.add(current);
			}
		}

		return list2;
	}

	Penguin getPenguinByName(Penguin[] pingouins, String name) {

		for (Penguin pingouin : pingouins) {
			if (pingouin.getName() == name) {
				return pingouin;
			}

		}

		return null;
	}

	Penguin getFastest(List<Penguin> penguins) {

		int nulVitesse = 0;

		for (Penguin pingouin : penguins) {
			if (pingouin.getSpeed() > nulVitesse) {
				return pingouin;
			}
		}

		return null;
	}

	Penguin getFriend(Penguin penguin) {

		return penguin.getFriend();
	}

	List<Penguin> getPenguinsWithLetter(Penguin[] pengouins, String letters) {

		List<Penguin> list = new ArrayList<Penguin>();
		list = Arrays.asList(pengouins);

		List<Penguin> list2 = new ArrayList<Penguin>();

		for (Penguin pingouin : list) {

			if (pingouin.getName().toLowerCase().contains(letters.toLowerCase())) {
				list2.add(pingouin);
			}

		}

		return list2;
	}

	Penguin[] getPenguinsWithLetter(List<Penguin> pengouins, String letters) {

		// Moche :

		List<Penguin> list = new ArrayList<Penguin>(pengouins);

		List<Penguin> list2 = new ArrayList<Penguin>();

		for (Penguin pingouin : list) {

			if (pingouin.getName().toLowerCase().contains(letters.toLowerCase())) {
				list2.add(pingouin);
			}

		}

		Penguin[] penguinLettre = new Penguin[list2.size()];
		list2.toArray(penguinLettre);

		return penguinLettre;
	}

	Object getSmallestSize(Penguin[] array, List<Penguin> list) {

		Object smallest = "";

		if (array.length < list.size()) {
			smallest = array;
		}

		if (array.length > list.size()) {
			smallest = list;
		}

		if (array.length == list.size()) {
			return null;
		}

		return smallest;
	}

	// Ne pas faire :

	List<Penguin> getFriends(Penguin[] penguins) {
		return null;
	}

}
