package org.hbrs.se1.ws23.uebung5;

import java.util.Arrays;

public class TextDocument extends CoreDocument{
    private String textDoc;
    private Encoding textDocEncoding;
    private int textDocID;
    TextDocument(String s,Encoding encoding){
        this.textDoc=s;
        this.textDocEncoding=encoding;
    }
    @Override
    public void getID() {
        System.out.println(this.textDocID);
    }

    @Override
    public void setID(int i) {
        this.textDocID=i;
    }

    @Override
    public void returnByte() {
        byte[] b;
        b=this.textDoc.getBytes();
        System.out.println(Arrays.toString(b));
    }
}
