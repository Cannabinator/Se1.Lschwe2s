package org.hbrs.se1.ws23.uebung2;
import org.hbrs.se1.ws23.uebung2.Member;

import java.util.ArrayList;
public class Container {
    public ArrayList<Member> memberListe=new ArrayList();


    public void addMember(Member member) throws ContainerException {
        if(memberListe.contains(member)){
            throw new ContainerException("Das Member-Objekt mit der ID "+member.getID()+" ist be\n" +
                                         "reits vorhanden!");
        }else{
            memberListe.add(member);
        }
    }
    public String deleteMember(Integer ID){
        //Ohne eine Exception muss ich den rueckgabewewert ueberpruefen um fehler auszuschliessen.
        for(Member o:memberListe){
            if(o.getID()==ID){
              memberListe.remove(o);
              return "Member deleted";
            }
        }
        return ("Kein Member mit"+ID+"bekannt");
    }
    public void dump(){
        for(Member o:memberListe){
            System.out.println(o.toString());
        }
    }
}
