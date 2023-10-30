package org.hbrs.se1.ws23.uebung2;

import org.hbrs.se1.ws23.uebung2.Member;

import java.io.Serializable;

public class ConcreteMember implements Member, Serializable {
    Integer ID;
    public ConcreteMember(Integer a){
        this.ID=a;
    }

    public Integer getID(){
        return this.ID;
    }

    @Override
    public String toString(){
        return "Member (ID = "+this.ID+")";
    }
}
