package io.robusta.animals.types;

import java.util.Arrays;

import io.robusta.animals.Pingouin;

public class ArrayApplication {

	public static void main(String[] args) {
		

		Pingouin kowalsky = new Pingouin("Kowalsky");
        Pingouin ricoh = new Pingouin("Ricoh");
        Pingouin soldat = new Pingouin("Soldat");
        Pingouin commandant = new Pingouin("Commandant");
        Pingouin tux = new Pingouin("Tux");
		
		
        Pingouin[] pingouins = new Pingouin[5];
        pingouins[0] = kowalsky; // affectation (setter)
        pingouins[1] = ricoh;
        pingouins[2] = soldat;
        pingouins[3] = commandant;
        pingouins[4] = tux;
		
        Pingouin third = pingouins[2]; // lecture (getter)
        System.out.println(third);
        System.out.println(pingouins);
        System.out.println(Arrays.toString(pingouins)); // Affiche tableau avec String
        
        
        
        // Create Arrays :
        
        // Direct way ;
        
        Pingouin[] directPingouins = {tux, ricoh, kowalsky};
        
        
        Pingouin [] almostDirectPingouins = new Pingouin[]{tux, ricoh};
        
        int length = almostDirectPingouins.length;
        Pingouin last = almostDirectPingouins[length - 1];
        
        
        
        
        // Matrice

        
        
        
		
	}

}
