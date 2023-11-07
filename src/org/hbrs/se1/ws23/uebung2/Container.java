package org.hbrs.se1.ws23.uebung2;
import org.hbrs.se1.ws23.uebung2.Member;
import org.hbrs.se1.ws23.uebung3.PersistenceException;
import org.hbrs.se1.ws23.uebung3.PersistenceStrategy;

import java.util.*;

public final class Container {
    public ArrayList<Member> memberListe=new ArrayList();
    private static Container container=null;
    private Container(){};
    private PersistenceStrategy persistenceStrategyContainer;
    public static Container getInstance(){
        if(container==null){
            container=new Container();

        }
        return container;
    }


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
    public int size(){
        return memberListe.size();
    }
    public List<Member> getCurrentList(){
        return memberListe;
    }
    public void setStrategy(PersistenceStrategy persistenceStrategy){
        this.persistenceStrategyContainer=persistenceStrategy;
    }
    public void store()throws PersistenceException{
        persistenceStrategyContainer.save(memberListe);
    }
    public void load()throws PersistenceException{
        memberListe= (ArrayList<Member>) persistenceStrategyContainer.load();
    }
}
