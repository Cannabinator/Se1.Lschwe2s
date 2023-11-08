package org.hbrs.se1.ws23.uebung3;

import org.hbrs.se1.ws23.uebung2.Container;
import org.hbrs.se1.ws23.uebung2.Member;

public class Main {


    public static void main(String[] args){
        Container container;
        container=Container.getInstance();
        container.setStrategy(new PersistenceStrategyStream<Member>());
         Client client;
        client = new Client();
        client.setContainer(container);
         client.setMemberView(new MemberView());
    }
}
