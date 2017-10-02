package io.robusta.animals.types;

import java.util.ArrayList;
import java.util.List;

public class IntegersApp {

	public static void main(String[] args) {
		
		
		
		IntegersApp app = new IntegersApp();
		app.launch();
		
	}
	
	public void launch(){
		
		int i = 3;
		int j = 4;
		int k = 5;
		
		Integer a = new Integer(3);
		
		List<Integer> list = new ArrayList<>();
		list.add(a);
		// a.notify();  Integer is a real object
		
		a = i;
		a = Integer.valueOf(3); // This is magical
		list.add(4);
		
		
		Integer myInteger = 3;
		
		System.out.println(myInteger == 3);
		
		Integer myOtherInteger = 3;
		System.out.println(myInteger == myOtherInteger);
		
		
		Integer x = new Integer(320);
		Integer y = new Integer(320);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
