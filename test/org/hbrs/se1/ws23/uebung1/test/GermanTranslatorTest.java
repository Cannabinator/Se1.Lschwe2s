package org.hbrs.se1.ws23.uebung1.test;

import org.hbrs.se1.ws23.uebung1.control.GermanTranslator;
import org.hbrs.se1.ws23.uebung1.control.Translator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GermanTranslatorTest {

    @Test
    void aPositiveTest() {
        GermanTranslator translator = new GermanTranslator();
        String value = translator.translateNumber(0);
        assertEquals(value, "Übersetzung der Zahl " + "0" + " nicht möglich / version:"+ translator.version);
    }
    @Test
    void translateNumberTest(){
        GermanTranslator translator = new GermanTranslator();
        String val1= translator.translateNumber(1);
        String val2=translator.translateNumber(55);
        assertEquals(val1,"eins");
        assertEquals(val2,"Übersetzung der Zahl " + "55" + " nicht möglich / version:"+ translator.version);
    }
}