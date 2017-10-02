package io.robusta.animals.types;

import java.util.HashSet;
import java.util.Iterator;

import io.robusta.animals.Pingouin;

public class SetApplication {

	public static void main(String[] args) {
		 SetApplication app = new SetApplication();
				 app.init();

	}

	
	public void init(){
		
		
		
		Pingouin kowalsky = new Pingouin("Kowalsky");
	    Pingouin ricoh = new Pingouin("Ricoh");
	    Pingouin soldat = new Pingouin("Soldat");
	    Pingouin commandant = new Pingouin("Commandant");
	    Pingouin tux = new Pingouin("Tux");
		
		HashSet<Pingouin> set = new HashSet<>();
		
		
		
		set.add(tux);
		set.add(ricoh);
		set.add(soldat);
		set.add(tux);
		
	//	System.out.println(set.size());
		
		
		Pingouin imposteur = new Pingouin ("Tux");
		set.add(imposteur);
		//System.out.println(set);
	
		set.add(commandant);
		set.add(kowalsky);
		
		//System.out.println(set.size());
		
		Iterator<Pingouin> iterator = set.iterator();
		//System.out.println(iterator.next());
		
		
		// start again :
		
		
		iterator = set.iterator();
		
		while(iterator.hasNext()){
			
			Pingouin current = iterator.next();
			System.out.println(current);
			
		}
		
		
		
		System.out.println(" =============== OTHER ==================");
		
		
		for (Pingouin current : set){
			System.out.println(current);
		}
		
		
		
	}
	
}
