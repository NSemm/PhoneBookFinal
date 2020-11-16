package com.k7.logic;

import com.k7.dao.*;
import com.k7.entities.ContactName;
import com.k7.entities.Phone;

import java.util.Iterator;

public class PhoneBookControl {
    ContactNamesDao names = new ArrayContactNamesDao();
    PhoneDao phones = new ArrayPhoneDao();
    ContatsViewer viewer = new DefaultContatsViewer();
    PhoneTypeDao phoneTypes = new ArrayPhoneTypeDao();

    public void autoAddContacts() {
        names.addInArray();
        phones.addPhonesInArray();
    }

    public void showContacts() {
        viewer.viewContact(names.getAll(), phones.getAllPhones(), phoneTypes.getAllTypes());
    }

    public void searchContactByName(String text) {
        ContactsFinder finder = new NameContactsFinder(names.getAll());
        viewer.viewContact(finder.searchContact(text), phones.getAllPhones(), phoneTypes.getAllTypes());
    }

    public void searchContactByPhone(String text) {
        ContactsFinder finder = new PhoneContactsFinder(phones.getAllPhones());
        viewer.viewContact(finder.searchContact(text), phones.getAllPhones(), phoneTypes.getAllTypes());
    }

    public void addPhoneToContact(String name, String phone, String type) {
        int flag = 0;
        for (ContactName c : names.getAll()
        ) {
            if (c.getName().equals(name)) flag = 1;

        }
        if (flag == 0) System.out.println("Contact not found");
        else {
            phones.addPhones(name, phone, type);
            System.out.println("Phone added");
        }
    }

    public void createContact(String name, String phone, String type) {
        int flag = 0;
        for (ContactName c : names.getAll()
        ) {
            if (c.getName().equals(name)) flag = 1;

        }
        if (flag != 0) System.out.println("Contact already exist");
        else {
            names.add(name);
            phones.addPhones(name, phone, type);
            System.out.println("Contact added");
        }
    }

    public void deleteContact(String name) {
        int flag = 0;
        ContactName temp = new ContactName("");
        for (ContactName c : names.getAll()
        ) {
            if (c.getName().equals(name)) flag = 1;
        }
        if (flag == 0) System.out.println("Contact not found");
        else {
            for (ContactName n : names.getAll()
            ) {
                if (n.getName().equals(name))
                    temp = n;
            }
            names.del(temp);
            Iterator<Phone> iter = phones.getAllPhones().iterator();
            while (iter.hasNext()) {
                Phone p = iter.next();
                if (p.getContactName().equals(name))
                    iter.remove();
            }
            System.out.println("Contact deleted");
        }
    }
    public void deletePhoneFromContact(String phone){

    }

}
