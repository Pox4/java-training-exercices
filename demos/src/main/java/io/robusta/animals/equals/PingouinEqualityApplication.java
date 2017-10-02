package io.robusta.animals.equals;

import io.robusta.animals.Pingouin;

public class PingouinEqualityApplication {

	public static void main(String[] args) {
		
		
		
		Pingouin jack = new Pingouin("jack");
		Pingouin john = new Pingouin("jack");
		
		
		System.out.println(jack.equals(john));
		
		

	}

}
