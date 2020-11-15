package com.k7.dao;

import com.k7.entities.ContactName;

import java.util.HashSet;
import java.util.Set;

public class ArrayContactNamesDao implements ContactNamesDao {
    Set<ContactName> contactNames = new HashSet<>();
    public void addInArray (){
        contactNames.add(new ContactName("Vasya"));
        contactNames.add(new ContactName("Petia"));
        contactNames.add(new ContactName("Alex"));
        contactNames.add(new ContactName("Max"));
        contactNames.add(new ContactName("Leo"));
    }

    @Override
    public Set<ContactName> getAll() {
        return contactNames;
    }

    @Override
    public void add(String name) {
        contactNames.add(new ContactName(name));


    }

    @Override
    public void del(ContactName contact) {
        contactNames.remove(contact);
    }
}
