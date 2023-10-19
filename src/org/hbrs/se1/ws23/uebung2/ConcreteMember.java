package org.hbrs.se1.ws23.uebung2;

import org.hbrs.se1.ws23.uebung2.Member;

public class ConcreteMember implements Member {
    int ID;
    int counter=0;

    public ConcreteMember(int a){
        this.ID=a;
    }

    public Integer getID(){
        return this.ID;
    }
}
