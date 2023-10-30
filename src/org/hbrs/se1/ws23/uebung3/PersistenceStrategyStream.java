package org.hbrs.se1.ws23.uebung3;

import org.hbrs.se1.ws23.uebung2.ConcreteMember;
import org.hbrs.se1.ws23.uebung2.Member;

import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class PersistenceStrategyStream<E> implements PersistenceStrategy<E>{

    //lol.java
    // URL of file, in which the objects are stored
    private String location = "objects.ser";

    private List<Member> memberslist;
    FileOutputStream fos;
    ObjectOutputStream oos;
    FileInputStream fis;
    ObjectInputStream ois;

    // Backdoor method used only for testing purposes, if the location should be changed in a Unit-Test
    // Example: Location is a directory (Streams do not like directories, so try this out ;-)!
    public void setLocation(String location) {
        this.location = location;
    }


    /**
     * Method for opening the connection to a stream (here: Input- and Output-Stream)
     * In case of having problems while opening the streams, leave the code in methods load
     * and save.---> Openconnection opens the input stream and closecon closes the input stream.
     */
    @Override
    public void openConnection()throws PersistenceException{
       try {
           fis = new FileInputStream(location);
           ois = new ObjectInputStream(fis);
       }catch(IOException e){
           throw new PersistenceException(PersistenceException.ExceptionType.ConnectionNotAvailable,"F in openCon");
       }
    }
    @Override
    public void closeConnection()throws PersistenceException{
        try{
            fis.close();
            ois.close();

        }catch(IOException e){
            throw new PersistenceException(PersistenceException.ExceptionType.ConnectionNotAvailable,"F in Close con");
        }
    }

    public void openConnectionOut() throws PersistenceException {
        try {
            fos =new FileOutputStream(location);
            oos =new ObjectOutputStream(fos);
        } catch(IOException e){
            throw new PersistenceException(PersistenceException.ExceptionType.ConnectionNotAvailable,"F Open con Out");
        }
    }
    public void closeConnectionOut() throws PersistenceException{
        try{
            oos.close();
            fos.close();
        }catch(IOException e){
            throw new PersistenceException(PersistenceException.ExceptionType.ConnectionNotAvailable,"F in Close Out");
        }
    }
    @Override
    /**
     * Method for saving a list of Member-objects to a disk (HDD)
     */
    public void save(List<E> member) throws PersistenceException{
       try {
           openConnectionOut();
           oos.writeObject(member);
           closeConnectionOut();
       }catch (PersistenceException e){
           throw new PersistenceException(PersistenceException.ExceptionType.ConnectionNotAvailable,"F in save");
       } catch (IOException e) {
           throw new RuntimeException(e);
       }

    }

    @Override
    /**
     * Method for loading a list of Member-objects from a disk (HDD)
     * Some coding examples come for free :-)
     * Take also a look at the import statements above ;-!
     */
    @SuppressWarnings("unchecked")
    public List<E> load() throws PersistenceException  {
        List<E> f1;
        try {
            openConnection();
            f1=(ArrayList<E>) ois.readObject();

        }catch (IOException e){
           throw new PersistenceException(PersistenceException.ExceptionType.NoStrategyIsSet,"f in load");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }


        // Some Coding hints ;-)

        // ObjectInputStream ois = null;
        // FileInputStream fis = null;
        // List<...> newListe =  null;
        //
        // Initiating the Stream (can also be moved to method openConnection()... ;-)
        // fis = new FileInputStream( " a location to a file" );

        // Tipp: Use a directory (ends with "/") to implement a negative test case ;-)
        // ois = new ObjectInputStream(fis);

        // Reading and extracting the list (try .. catch ommitted here)
        // Object obj = ois.readObject();

        // if (obj instanceof List<?>) {
        //       newListe = (List) obj;
        // return newListe

        // and finally close the streams (guess where this could be...?)
        return f1;
    }
}
