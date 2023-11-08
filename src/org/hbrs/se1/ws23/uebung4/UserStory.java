package org.hbrs.se1.ws23.uebung4;

import org.hbrs.se1.ws23.uebung2.Member;

import java.io.Serializable;
import java.util.Objects;

public class UserStory implements Member, Serializable {
    private final int userStoryID;
    String beschreibung;
    String projekt;
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
        if(mehrwert<1||mehrwert>5){
            System.out.println("wrong number we need:1-5");
        }else {
            this.mehrwert = mehrwert;
        }
    }
    public void setProjekt(String projekt){
        this.projekt=projekt;
    }
    public void setStrafe(int strafe){
        if(mehrwert<1||mehrwert>5){
            System.out.println("wrong number we need:1-5");
        }else {
            this.strafe = strafe;
        }
    }
    public void setAufwand(int aufwand){
        if(mehrwert<1||mehrwert>5){
            System.out.println("wrong number we need:1-5");
        }else {
            this.aufwand = aufwand;
        }
    }
    public void setRisiko(int risiko){
        if(mehrwert<1||mehrwert>5){
            System.out.println("wrong number we need:1-5");
        }else{
        this.risiko=risiko;
        }
    }
    @Override
    public String toString(){
        return "Beschreibung:"+beschreibung+"Projekt:"+projekt+"Mehrw/Str/Aufw/Ris:"+mehrwert+"/"+strafe+"/"+aufwand+"/"+risiko;
    }

}
