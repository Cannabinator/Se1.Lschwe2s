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
}
