package io.robusta.animals.types;

import java.util.HashMap;
import java.util.Map.Entry;

import io.robusta.animals.Pingouin;

public class MapApplication {

	public static void main(String[] args) {
		
		MapApplication app = new MapApplication();
	//	app.init();
		app.iterateEntries();

	}

	
	public void init(){
		
		
		Pingouin kowalsky = new Pingouin("Kowalsky");
	    Pingouin ricoh = new Pingouin("Ricoh");
	    Pingouin soldat = new Pingouin("Soldat");
	    Pingouin commandant = new Pingouin("Commandant");
	    Pingouin tux = new Pingouin("Tux");
	    
		
		
		HashMap<Pingouin, Integer> map = new HashMap<>();
		
		map.put(tux, 90);
		map.put(ricoh, 120);
		map.put(soldat, 150);
		map.put(kowalsky, -95);
		map.put(commandant, 0);
		System.out.println(map);
		
		System.out.println(map.get(tux)); // score de tux
		
		System.out.println(map.size());  // nbr elements
		
		
		// parcourir la map :
		
		
		map.put(soldat, 80); // remplace 150 par 80
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	public void iterateEntries(){
		
		
		
		Pingouin kowalsky = new Pingouin("Kowalsky");
	    Pingouin ricoh = new Pingouin("Ricoh");
	    Pingouin soldat = new Pingouin("Soldat");
	    Pingouin commandant = new Pingouin("Commandant");
	    Pingouin tux = new Pingouin("Tux");
	    
		
		
		HashMap<Pingouin, Integer> map = new HashMap<>();
		
		map.put(tux, 90);
		map.put(ricoh, 120);
		map.put(soldat, 150);
		map.put(kowalsky, -95);
		map.put(commandant, 0);
		
		
		// parcourir la map
		
		for ( Entry<Pingouin, Integer> entry : map.entrySet()){
			
			System.out.println(entry.getKey() + " has " +entry.getValue()+ " points.");
		}
		
		
	}
	
	
	
	
}
