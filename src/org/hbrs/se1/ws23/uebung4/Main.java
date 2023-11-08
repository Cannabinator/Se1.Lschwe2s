package org.hbrs.se1.ws23.uebung4;

import org.hbrs.se1.ws23.uebung2.Container;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String []args){
        Container container;
        Scanner scanner=new Scanner(System.in);
        String next=scanner.nextLine();
        String newUS=">enter";
        System.out.println("type:>befehl [parameter]");
        System.out.println("to create a new US:>enter [userStoryID,beschreibung,mehrwert,strafe,aufwand,risiko]");
        if(scanner.nextLine().contains(newUS)){
            new UserStory(scanner.nextInt());
            System.out.println("");
            UserStory userStory=new UserStory(scanner.nextInt());

        }
        System.out.println("");
    }
}
