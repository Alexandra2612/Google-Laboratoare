package Laborator5.io;

import Laborator5.io.Contact;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class PhoneBook {
    private Contact[] contacts;

    public PhoneBook(String inputFileName){
        importantContacts(inputFileName);
    }

    private void importantContacts(String file)  {
        contacts = new Contact[10];

        try {
            Scanner scanner = new Scanner(new BufferedReader(new FileReader(file)));
            String name;
            String phoneNumber;
            int i=0;
            while(scanner.hasNext()){
                name= scanner.next();
                if(scanner.hasNextLong()){
                    phoneNumber= String.valueOf(scanner.nextLong());
                    contacts[i] = new Contact(name, phoneNumber);
                    i++;
                }
            }
        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }
    }

    public String toString(){
        String toReturn=" ";
        for(Contact c:contacts){
            if(c!=null){
                toReturn +=c;
            }
            else{return toReturn;}
        }
        return toReturn;
    }

    public String getNumberByName(String name){
        int i=0;

        while(contacts[i]!=null){
            if(contacts[i].getName().equals(name)){
                return "0"+contacts[i].getPhoneNumber();
            }
            i++;
        }
        return null;
    }

}
