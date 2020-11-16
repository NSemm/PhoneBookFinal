package com.k7.logic;

import com.k7.dao.*;
import com.k7.entities.ContactName;
import com.k7.entities.Phone;


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
        if (name.trim().equals("")) System.out.println("Contact name mast be declared");
        else {
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
    }

    public void deleteContactByName(String name) {
        DeleteContact delContactMethod = new ByNameDeleteContact(names, phones);
        if (delContactMethod.deleteContact(name) == 1) {
            delContactMethod.deletePhone(name);

        }
    }

    public void deleteContactByPhone(String phone) {
        String name = "";
        int count = 0;
        for (Phone p : phones.getAllPhones()
        ) {
            if (p.getPhoneNumber().equals(phone))
                name = p.getContactName();
        }
        for (Phone p : phones.getAllPhones()
        ) {
            if (p.getContactName().equals(name)) ++count;
        }
        if (count > 1) {
            DeleteContact delContactMethod = new ByPhoneDeleteContact(names, phones);
            delContactMethod.deletePhone(phone);
        } else {
            DeleteContact delContactMethod = new ByNameDeleteContact(names, phones);
            if (delContactMethod.deleteContact(name) == 1)
                delContactMethod.deletePhone(name);

        }

    }

}
