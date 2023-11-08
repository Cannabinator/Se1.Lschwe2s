package org.hbrs.se1.ws23.uebung3;

import org.hbrs.se1.ws23.uebung2.ConcreteMember;
import org.hbrs.se1.ws23.uebung2.Container;
import org.hbrs.se1.ws23.uebung2.ContainerException;
import org.hbrs.se1.ws23.uebung2.Member;

import java.util.ArrayList;

public class Client {
    Member m1,m2,m3,m4;
    Container container;
    MemberView memberView;
     public void schneidenRendernHochladen(){
         m1=new ConcreteMember(1);
         m2=new ConcreteMember(2);
         m3=new ConcreteMember(3);
         m4=new ConcreteMember(4);
         try {
             container.addMember(m1);
             container.addMember(m2);
             container.addMember(m3);
             container.addMember(m4);
             memberView.dump(container.getCurrentList());
         } catch (ContainerException e) {
             throw new RuntimeException(e);
         }
     }
     public void setContainer(Container cont){
         this.container=cont;
     }
     public void setMemberView(MemberView memberV){
         this.memberView=memberV;
     }
}
