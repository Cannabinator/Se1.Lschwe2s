package org.hbrs.se1.ws23.uebung1.view;



import org.hbrs.se1.ws23.uebung1.control.Translator;
import org.hbrs.se1.ws23.uebung1.control.GermanTranslator;
import org.hbrs.se1.ws23.uebung1.control.objectFac;

public class Client {

		objectFac x1=new objectFac();
		/*
		 * Methode zur Ausgabe einer Zahl auf der Console
		 * (auch bezeichnet als CLI, Terminal)
		 *
		 */
		 void display( int aNumber ){
			  Translator x2 = x1.createTransl();

			// In dieser Methode soll die Methode translateNumber
			// mit dem übergegebenen Wert der Variable aNumber
			// aufgerufen werden.
			//
			// Strenge Implementierung gegen das Interface Translator gewuenscht!


			System.out.println("Das Ergebnis der Berechnung: " +
					"[das Ergebnis an dieser Stelle]"  );

		 }
}





