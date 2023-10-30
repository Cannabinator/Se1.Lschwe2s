package org.hbrs.se1.ws23.uebung3.test;


import org.hbrs.se1.ws23.uebung2.ConcreteMember;
import org.hbrs.se1.ws23.uebung2.Member;
import org.hbrs.se1.ws23.uebung3.PersistenceException;
import org.hbrs.se1.ws23.uebung3.PersistenceStrategy;
import org.hbrs.se1.ws23.uebung3.PersistenceStrategyStream;
import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;

public class PersistenceStrategyStreamTest {
    @Test

    public void psstest() throws PersistenceException {
        PersistenceStrategyStream<Member> x1= new PersistenceStrategyStream<>();
        ArrayList<Member> y1=new ArrayList<>();
        y1.add(new ConcreteMember(2345));
        y1.add(new ConcreteMember(1234));
        x1.save(y1);
    }
    @Test
    public void psstestload() throws PersistenceException {

        PersistenceStrategyStream<Member> x1=new PersistenceStrategyStream<>();
        ArrayList<Member> y1;
        y1=(ArrayList<Member>) x1.load();
        System.out.println(y1);



    }

}
