package org.hbrs.se1.ws23.uebung4;

import org.hbrs.se1.ws23.uebung2.Member;

import java.io.Serializable;

public class UserStory implements Member, Serializable {
    private final int userStoryID;
    String beschreibung;
    int mehrwert;
    int strafe;
    int aufwand;
    int risiko;
    int prio;

    public UserStory(int userStoryID){
        this.userStoryID=userStoryID;
    }
    @Override
    public Integer getID(){
        return userStoryID;
    }
    public void setBeschreibung(String beschreibung){
        this.beschreibung=beschreibung;
    }
    public void setMehrwert(int mehrwert){
        this.mehrwert=mehrwert;
    }
    public void setStrafe(int strafe){this.strafe=strafe;}
    public void setAufwand(int aufwand){this.aufwand=aufwand;}
    public void setRisiko(int risiko){this.risiko=risiko;}
    public void calcPrio(){
        this.prio=mehrwert+strafe/aufwand+risiko;
    }

}
