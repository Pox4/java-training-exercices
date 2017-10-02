package io.robusta.animals;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ListApplication {
	
	
	
	
	Pingouin kowalsky = new Pingouin("Kowalsky");
    Pingouin ricoh = new Pingouin("Ricoh");
    Pingouin soldat = new Pingouin("Soldat");
    Pingouin commandant = new Pingouin("Commandant");
    Pingouin tux = new Pingouin("Tux");
    Pingouin _12 = new Pingouin("12");
	
	
	
	

	public static void main(String[] args) {
		
		ListApplication app = new ListApplication();
		//app.launch();
		//app.mix();
		app.iterate();

	}
	
	
	void launch(){
		
		
		LinkedList<Pingouin> pingouins = new LinkedList<>();
		Collections.addAll(pingouins, kowalsky, ricoh, commandant, tux, soldat, _12);
		
		System.out.println(pingouins);
		
		
		Pingouin last = pingouins.getLast();
		last = pingouins.peekLast();
		
		
		Pingouin first = pingouins.getFirst();
		first = pingouins.peekFirst();
		first = pingouins.get(0);
		
		
		
		
		Pingouin second = pingouins.get(1);
		
		
		int length = pingouins.size();
		Pingouin penult = pingouins.get(length -2);
		
		
		int moit = (int) (length/2);
		Pingouin middle = pingouins.get(moit);
		System.out.println(middle);
		
	}
		
		void mix(){
			
			
			List<Pingouin> list = new ArrayList<>();
			Collections.addAll(list, kowalsky, ricoh, commandant, tux, soldat, _12);
			Collections.shuffle(list); // random list pingouin
			System.out.println(list);
			
			
			list = new LinkedList();
			
			
			
		}
		
		
		
		public void iterate(){
			
			
			
			
			
			List<Pingouin> pingouins = new ArrayList<>();
			Collections.addAll(pingouins, soldat, tux, commandant, ricoh);
			
			
			for (Pingouin current : pingouins){
				
				System.out.println(current);
			}
			
			
			
			
			
			
			
			
		}
		
		
		
	}


