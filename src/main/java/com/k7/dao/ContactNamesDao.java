package com.k7.dao;

import com.k7.entities.ContactName;

import java.util.Set;

public interface ContactNamesDao {
    Set<ContactName> getAll();
    void add(String name);
    void del(ContactName contact);
}
