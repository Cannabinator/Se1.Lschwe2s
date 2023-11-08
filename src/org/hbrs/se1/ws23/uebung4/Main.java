package org.hbrs.se1.ws23.uebung4;

import org.hbrs.se1.ws23.uebung2.Container;
import org.hbrs.se1.ws23.uebung2.ContainerException;
import org.hbrs.se1.ws23.uebung2.Member;
import org.hbrs.se1.ws23.uebung3.PersistenceException;
import org.hbrs.se1.ws23.uebung3.PersistenceStrategyStream;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner scanner;
    static Container container;
    static int counter=0;
    public static void main(String []args){
        scanner = new Scanner(System.in);
        container=Container.getInstance();
        container.setStrategy(new PersistenceStrategyStream<Member>());
            while (true) {
                System.out.print("Gib einen Befehl ein: ");
                String eingabe = scanner.nextLine();

                // Hier kannst du die Verarbeitung der Eingabe implementieren, z.B. aufteilen in Befehl und Parameter.

                String[] teile = eingabe.split(" "); //befehl [parameter,parameter]
                String befehl = teile[0];
                String parameter = (teile.length > 1) ? teile[1] : null;

                // Du kannst dann die Befehle verarbeiten, wie in deiner Anforderung.

                switch (befehl) {
                    case "enter":
                        UserStory userStory=new UserStory(counter++);
                        System.out.println("Gib beschreibung");
                        userStory.setBeschreibung(scanner.nextLine());
                        System.out.println("Gib Projekt");
                        userStory.setProjekt(scanner.nextLine());
                        System.out.println("gib mehrwert");
                        userStory.setMehrwert(scanner.nextInt());
                        System.out.println("gib strafe");
                        userStory.setStrafe(scanner.nextInt());
                        System.out.println("gib aufwand");
                        userStory.setAufwand(scanner.nextInt());
                        System.out.println("gib risiko");
                        userStory.setRisiko(scanner.nextInt());
                        scanner.nextLine();
                        try {
                            container.addMember(userStory);
                        } catch (ContainerException e) {
                            throw new RuntimeException(e);
                        }
                        break;
                    case "store":
                        try {
                            container.store();
                        } catch (PersistenceException e) {
                            throw new RuntimeException(e);
                        }
                        break;
                    case "load":
                        try{
                            container.load();
                        } catch (PersistenceException e){
                            throw new RuntimeException(e);
                        }
                        break;
                    case "dump":
                        //zu schwer zum jetzt machen
                        break;
                    case "search":
                        searchProject(parameter);
                        break;//suche US nach projekten. Projektname wird als Parameter uebergeben
                    default:
                        System.out.println("Unbekannter Befehl: " + befehl);
                        break;
            }
        }
    }
    public static void searchProject(String parameter){
        ArrayList<Member> userStories=(ArrayList<Member>) container.getCurrentList();
        for(Member story:userStories){

            if(((UserStory) story).projekt.equals(parameter)){
                System.out.println(story);
            }else{
                System.out.println("no matching projects");
            }
        }
    }
}
