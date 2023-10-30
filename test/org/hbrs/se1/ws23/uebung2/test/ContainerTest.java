package org.hbrs.se1.ws23.uebung2.test;

import org.hbrs.se1.ws23.uebung2.ConcreteMember;
import org.hbrs.se1.ws23.uebung2.Container;
import org.hbrs.se1.ws23.uebung2.ContainerException;
import org.hbrs.se1.ws23.uebung2.Member;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ContainerTest {
    private Container container;

    @BeforeEach
    void setUp() {
        container = container.getInstance();
    }

    @Test
    void testInitialState() {
        assertEquals(0, container.size());
    }

    @Test
    void testAddMember() throws ContainerException {
        Member member1 = new ConcreteMember(1);
        Member member2 = new ConcreteMember(2);

        container.addMember(member1);
        assertEquals(1, container.size());

        container.addMember(member2);
        assertEquals(2, container.size());

        assertThrows(ContainerException.class, () -> container.addMember(member1));
    }

    @Test
    void testDeleteMember()throws ContainerException {
        Member member1 = new ConcreteMember(1);
        Member member2 = new ConcreteMember(2);

        container.addMember(member1);
        container.addMember(member2);

        assertEquals(2, container.size());

        assertEquals("Member deleted", container.deleteMember(1));
        assertEquals(1, container.size());


        assertEquals("Kein Member mit3bekannt", container.deleteMember(3));
        assertEquals(1, container.size());
    }

    @Test
    void testDeleteLastMember()throws ContainerException {
        Member member1 = new ConcreteMember(1);
        container.addMember(member1);

        assertEquals(1, container.size());
        assertEquals("Member deleted", container.deleteMember(1));
        assertEquals(0, container.size());
    }


}
