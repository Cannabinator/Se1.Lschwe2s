package org.hbrs.se1.ws23.uebung5;

import javax.sound.sampled.AudioFormat;
import java.awt.*;
import java.io.UnsupportedEncodingException;

public class Main {
    public static void main(String [] args) throws UnsupportedEncodingException {

        TextDocument td8 =new TextDocument("b",Encoding.UTF8);
        TextDocument td16 = new TextDocument("b",Encoding.UTF16);
        TextDocument td32 = new TextDocument("b",Encoding.UTF32);

        td8.returnByte();
        td8.toBinary();
        td16.returnByte();
        td16.toBinary();
        td32.returnByte();
        td32.toBinary();
    }
}
//      128/64/32/16/8/4/2/1
//      1  0  0  0  0 0 0 0 =128
//      1 0 0 0 0 0 0 1     = 129
//      01100010            = 98 = b ?
//     00000000 0000000 0000000 0000000
//      0   0   0   1100010 =98 =b
