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

		Penguin tux = new Penguin("CoinCoin");

		return tux;
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

		
		
		System.out.println(list2);
		return list2;
	}

	Penguin getPenguinByName(Penguin[] pingouins, String name) {
	
		
		
		if (Arrays.toString(pingouins).contains(name)){
		
			
			return null;
			
		}
	
		
		
		
		return  null;
	}

	
	
	
	
	Penguin getFastest(List<Penguin> penguins) {
	
		
		
		
		
		return null;
	}

	Penguin getFriend(Penguin penguin) {
		return null;
	}

	List<Penguin> getPenguinsWithLetter(Penguin[] pengouins, String letters) {
		return null;
	}

	Penguin[] getPenguinsWithLetter(List<Penguin> pengouins, String letters) {
		return null;
	}

	Object getSmallestSize(Penguin[] array, List<Penguin> list) {
		return null;
	}

	List<Penguin> getFriends(Penguin[] penguins) {
		return null;
	}

}
