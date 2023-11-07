package org.hbrs.se1.ws23.uebung3;

import org.hbrs.se1.ws23.uebung2.Member;

import java.util.ArrayList;
import java.util.List;

public class MemberView {
    public void dump(List<Member> o){
        for(Member member:o){
            System.out.println(member.toString());
        }
    }
}
