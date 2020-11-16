package com.k7.logic;

import com.k7.entities.ContactName;
import com.k7.entities.Phone;
import com.k7.entities.PhoneType;


import java.util.List;
import java.util.Set;


public class DefaultContatsViewer implements ContatsViewer {


    @Override
    public void viewContact(Set<ContactName> contacts, List<Phone> phones, List<PhoneType> phoneTypes) {
        System.out.println("--------------Contacts-------------");
        for (ContactName c : contacts
        ) {
            System.out.println(c.getName() + ":");
            for (Phone p : phones
            ) {
                if (c.getName().equals(p.getContactName()))
                    System.out.println("  " + p.getPhoneType() + " : " + p.getPhoneNumber());
            }

        }
        System.out.println("-----------------------------------");


    }
}
