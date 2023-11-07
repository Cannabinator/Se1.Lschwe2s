package org.hbrs.se1.ws23.uebung3.test;

import org.hbrs.se1.ws23.uebung2.ConcreteMember;
import org.hbrs.se1.ws23.uebung2.Member;
import org.hbrs.se1.ws23.uebung3.PersistenceException;
import org.hbrs.se1.ws23.uebung3.PersistenceStrategyStream;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class PersistenceStrategyStreamTest {
    @Test
    void setuptest(){
        PersistenceStrategyStream<Member> x1= new PersistenceStrategyStream<>();
        List<Member> L1= new ArrayList<>();
        L1.add(new ConcreteMember(12));
        L1.add(new ConcreteMember(15));
        try {
            x1.save(L1);
        } catch (PersistenceException e) {
            throw new RuntimeException(e);
        }
    }
}
