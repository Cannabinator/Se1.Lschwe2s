package org.hbrs.se1.ws23.uebung4;

import org.hbrs.se1.ws23.uebung2.Member;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

public class UserStory implements Member, Serializable {
    private final int userStoryID;
    String beschreibung;
    String projekt;
    Integer mehrwert;
    Integer strafe;
    Integer aufwand;
    Integer risiko;
    Integer prio;

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
        return "Beschreibung:"+beschreibung+"\nProjekt:"+projekt+"UserID:"+userStoryID+"\nMehrw/Str/Aufw/Ris:"+mehrwert+"/"+strafe+"/"+aufwand+"/"+risiko;
    }
    public void prioBerechnen(){
        if(this.mehrwert==null||strafe==null||aufwand==null||risiko==null){
            System.out.println("mehrwert,strafe,aufwand oder risiko sind null");
        }else {
            this.prio = (mehrwert + strafe) / (aufwand + risiko);
        }
    }

   @Override
   public Integer returnPrio(){
        prioBerechnen();
        return this.prio;
    }
}
