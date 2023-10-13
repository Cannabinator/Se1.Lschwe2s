package org.hbrs.se1.ws23.uebung1.view;



import org.hbrs.se1.ws23.uebung1.control.Translator;
import org.hbrs.se1.ws23.uebung1.control.objectFac;

public class Client {

		objectFac fac=new objectFac();
		/*
		 * Methode zur Ausgabe einer Zahl auf der Console
		 * (auch bezeichnet als CLI, Terminal)
		 *
		 */
		 void display( int aNumber ){
			  Translator x2 = fac.createTransl();
			  String ret=x2.translateNumber(aNumber);
			// In dieser Methode soll die Methode translateNumber
			// mit dem übergegebenen Wert der Variable aNumber
			// aufgerufen werden.
			//
			// Strenge Implementierung gegen das Interface Translator gewuenscht!


			System.out.println("Das Ergebnis der Berechnung: " +ret);

		 }
}





