package com.k7.logic;

import com.k7.entities.ContactName;
import lombok.AllArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@AllArgsConstructor
public class NameContactsFinder implements ContactsFinder {
    private Set<ContactName> contacts;

    @Override
    public Set<ContactName> searchContact(String text) {
        Set<ContactName> findContacts = new HashSet<>();
        for (ContactName c : contacts
        ) {
            String name = c.getName();
            if (name.indexOf(text) == 0)
                findContacts.add(new ContactName(c.getName()));
        }
        return findContacts;
    }
}
