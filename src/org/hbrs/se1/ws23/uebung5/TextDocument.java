package org.hbrs.se1.ws23.uebung5;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class TextDocument extends CoreDocument {
    private String textDoc;
    private Encoding textDocEncoding;
    private int textDocID;

    TextDocument(String s, Encoding encoding) {
        this.textDoc = s;
        this.textDocEncoding = encoding;
    }

    @Override
    public void getID() {
        System.out.println(this.textDocID);
    }

    @Override
    public void setID(int i) {
        this.textDocID = i;
    }

    @Override
    public void returnByte() {
        byte[] b;
        byte[] a;
        // Use the specified encoding when converting the string to bytes
        try {
            b = this.textDoc.getBytes(this.textDocEncoding.getVal());
            a = this.textDocEncoding.getVal().getBytes();
            System.out.println("getval.getbytes:");
            System.out.println(Arrays.toString(a));
            System.out.println("getbytes(this.textdoc.getval):");
            System.out.println(Arrays.toString(b));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }

    public void toBinary() throws UnsupportedEncodingException {
            byte[] a;
            a = this.textDoc.getBytes(this.textDocEncoding.getVal());
            StringBuilder binaryString = new StringBuilder();
            for (byte b : a) {
                for (int i = 7; i >= 0; i--) {
                    binaryString.append((b & (1 << i)) != 0 ? '1' : '0');
                }
            }
            System.out.println("in binary"+binaryString);
        }
    }


