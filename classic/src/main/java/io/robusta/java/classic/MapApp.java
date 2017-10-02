package io.robusta.java.classic;

import java.util.*;
import java.util.Map.Entry;

/**
 *
 * Map : We add entry with map.put(key, val) We read value with map.get(key) We
 * read keys with map.keySet() We read values with map.values() We read entries
 * with map.entrySet()
 *
 *
 */
public class MapApp {

	Map<Integer, String> buildMap(int key1, String val1, int key2, String val2) {

		Map<Integer, String> hmap = new HashMap<Integer, String>();

		hmap.put(key1, val1);
		hmap.put(key2, val2);

		return hmap;

	}

	Map<Integer, String> buildMap(int[] keys, String[] values) {

		// Guards :
		
		if (keys.length != values.length){
			throw new IllegalArgumentException("not the same lenght");
		}
		
		Map<Integer, String> hmap = new HashMap<Integer, String>();

		for (int i = 0; i < keys.length; i++) {

			hmap.put(keys[i], values[i]);

		}

		return hmap;
	}

	Set<Integer> getKeys(Map<Integer, String> map) {

		Set<Integer> hset = new HashSet<Integer>();

		hset = map.keySet();

		return hset;
	}

	List<Integer> getKeysAsList(Map<Integer, String> map) {

		List<Integer> list = new ArrayList<>(map.keySet());

		return list;
	}

	Set<Entry<Integer, String>> getEntries(Map<Integer, String> map) {

		Set<Entry<Integer, String>> set = map.entrySet();

		return set;
	}

	List<String> getValues(Map<Integer, String> map) {

		ArrayList<String> list = new ArrayList<>(map.values());

		return list;

	}

	String[] getValuesFromMap(Map<Integer, String> map, int key1, int key2) {

		String[] str = new String[2];
		int[] keys = { key1, key2 };

		for (int i = 0; i < keys.length; i++) {

			if (!(map.containsKey(key1)) && !(map.containsKey(key2))) {

				str[i] = null;
			} else if (map.containsKey(key1) || map.containsKey(key2)) {

				str[i] = map.get(keys[i]);

			}

		}

		
		return str;

	}

	// TODO: move up
	String displayMap(Map<Integer, String> map) {

		String display = "";

		// Use map.entrySet()to have nice display
		for (Entry<Integer, String> entry : map.entrySet()) {
			// System.out.println("Entry:" + entry.getKey());
			// System.out.println("Value:" + entry.getValue());
			display = display + entry.getValue() + "->" + entry.getKey() + ":";
		}

		return display;
	}

	List<Integer> getKeysHavingValue(Map<Integer, String> map, String value) {

		List<Integer> keysFromValue = new ArrayList<>();

		if (!map.containsValue(value)) {
			return null;
		}

		for (Entry<Integer, String> entry : map.entrySet()) {

			if (value == entry.getValue()) {

				keysFromValue.add(entry.getKey());
			}

			// System.out.println( entry.getKey() + ">>>>"+ entry.getValue());

		}

		return keysFromValue;
	}

	List<Integer> getKeysHavingValueAnyValue(Map<Integer, String> map, String... values) {

		List<Integer> list = new ArrayList<>();

		for (String value : values) {
			list.addAll(getKeysHavingValue(map, value));
		}

		return list;

	}

	List<Card> getCards(Map<Integer, Character> map) {

		List<Card> list = new ArrayList<Card>();

		for (Entry<Integer, Character> entry : map.entrySet()) {

			list.add(new Card(entry.getKey(), entry.getValue()));
		}

		return list;

	}

}