package com.k7;

import com.k7.logic.*;


public class Main {
    public static void main(String[] args) {
        PhoneBookControl bookControl = new PhoneBookControl();

        bookControl.autoAddContacts();
        bookControl.showContacts();
        //bookControl.searchContactByName("Va");
        //bookControl.searchContactByPhone("11");
        //bookControl.createContact("Maxa","0633213131","axf");
        //bookControl.addPhoneToContact("Max","0633213131","fax");
        //bookControl.deleteContactByName("Alex");
        //bookControl.deleteContactByPhone("+380748768111");
        bookControl.showContacts();


    }
}
