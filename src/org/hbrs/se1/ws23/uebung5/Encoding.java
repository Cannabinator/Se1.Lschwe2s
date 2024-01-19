package org.hbrs.se1.ws23.uebung5;

public enum Encoding {
    UTF8("utf-8"),
    UTF16("utf-16"),
    UTF32("utf-32");
    private final String value;
    Encoding(String value) {
        this.value = value;
    }
    public String getVal(){
        return value;
    }
}
