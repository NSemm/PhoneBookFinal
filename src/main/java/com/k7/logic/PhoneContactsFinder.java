package com.k7.logic;

import com.k7.entities.ContactName;
import com.k7.entities.Phone;
import lombok.AllArgsConstructor;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@AllArgsConstructor
public class PhoneContactsFinder implements ContactsFinder {
    private List<Phone> contacts;

    @Override
    public Set<ContactName> searchContact(String text) {
        Set<ContactName> findContacts = new HashSet<>();
        for (Phone p : contacts
        ) {
            String phone = p.getPhoneNumber();
            if (phone.indexOf(text) != -1)
                findContacts.add(new ContactName(p.getContactName()));
        }
        return findContacts;
    }
}
